/**
 * GOOD: Manager and Employee share the OrgUnit type.
 * The same call (totalSalary, printOrgChart) works on a single person
 * or a whole sub-tree.
 */
public class Main {

    public static void main(String[] args) {
        Manager ceo = new Manager("Alice", "CEO", 200_000);
        Manager eng = new Manager("Bob", "VP Engineering", 150_000);
        Manager sales = new Manager("Carla", "VP Sales", 140_000);

        ceo.add(eng).add(sales);

        eng.add(new Employee("Dan", "Engineer", 90_000))
           .add(new Employee("Eve", "Engineer", 95_000));

        sales.add(new Employee("Frank", "Sales Rep", 70_000));

        System.out.println("=== Org chart ===");
        ceo.printOrgChart("");

        System.out.println("\n=== Total salary cost ===");
        System.out.println("$" + ceo.totalSalary());

        // Department-level totals work the same way — same interface.
        System.out.println("\n=== Engineering only ===");
        System.out.println("$" + eng.totalSalary());

        System.out.println("\nSuccess: no instanceof. The tree walks itself.");
    }
}
