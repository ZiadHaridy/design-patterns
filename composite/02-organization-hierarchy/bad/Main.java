/**
 * BAD: Manager and Employee are unrelated. Every operation needs instanceof.
 */
public class Main {

    public static void main(String[] args) {
        Company.Manager ceo = new Company.Manager("Alice", "CEO", 200_000);
        Company.Manager eng = new Company.Manager("Bob", "VP Engineering", 150_000);
        Company.Manager sales = new Company.Manager("Carla", "VP Sales", 140_000);

        ceo.reports.add(eng);
        ceo.reports.add(sales);

        eng.reports.add(new Company.Employee("Dan", "Engineer", 90_000));
        eng.reports.add(new Company.Employee("Eve", "Engineer", 95_000));
        sales.reports.add(new Company.Employee("Frank", "Sales Rep", 70_000));

        Company company = new Company();

        System.out.println("=== Org chart ===");
        company.printOrgChart(ceo, "");

        System.out.println("\n=== Total salary cost ===");
        System.out.println("$" + company.totalSalary(ceo));

        System.out.println("\nProblem: every operation walks the org with instanceof.");
        System.out.println("Adding a 'Contractor' type means editing every method.");
    }
}
