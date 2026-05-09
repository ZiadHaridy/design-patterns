import java.util.ArrayList;
import java.util.List;

/**
 * BAD EXAMPLE: Two unrelated classes (Employee, Manager) and a
 * monolithic Company that walks the org chart with instanceof.
 *
 * Problems:
 *  1. totalSalary() and printOrgChart() each repeat the same instanceof walk.
 *  2. A "Contractor" or "Team" type would force edits to every method here.
 *  3. A manager cannot be treated like an "any person in the org" —
 *     the client must always know which type it is holding.
 */
public class Company {

    public static class Employee {
        public String name;
        public String title;
        public double salary;
        public Employee(String name, String title, double salary) {
            this.name = name; this.title = title; this.salary = salary;
        }
    }

    public static class Manager {
        public String name;
        public String title;
        public double salary;
        public List<Object> reports = new ArrayList<>(); // Employee or Manager
        public Manager(String name, String title, double salary) {
            this.name = name; this.title = title; this.salary = salary;
        }
    }

    public double totalSalary(Object person) {
        if (person instanceof Employee) {
            return ((Employee) person).salary;
        } else if (person instanceof Manager) {
            Manager m = (Manager) person;
            double total = m.salary;
            for (Object report : m.reports) {
                total += totalSalary(report);
            }
            return total;
        }
        throw new IllegalArgumentException("Unknown person type");
    }

    public void printOrgChart(Object person, String indent) {
        if (person instanceof Employee) {
            Employee e = (Employee) person;
            System.out.println(indent + "- " + e.name + " (" + e.title + ")");
        } else if (person instanceof Manager) {
            Manager m = (Manager) person;
            System.out.println(indent + "+ " + m.name + " (" + m.title + ")");
            for (Object report : m.reports) {
                printOrgChart(report, indent + "  ");
            }
        }
    }
}
