/**
 * Component — anything that lives in the org chart.
 * Both individual contributors and managers implement this interface.
 */
public abstract class OrgUnit {

    protected final String name;
    protected final String title;
    protected final double salary;

    protected OrgUnit(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public abstract double totalSalary();

    public abstract void printOrgChart(String indent);
}
