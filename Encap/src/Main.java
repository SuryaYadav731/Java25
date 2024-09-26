import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private double salary;

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        // First compare by salary
        if (this.salary > other.salary) {
            return 1;
        } else if (this.salary < other.salary) {
            return -1;
        } else {
            // If salaries are the same, compare by id
            return Integer.compare(this.id, other.id);
        }
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", salary=" + salary + "}";
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, 50000));
        employees.add(new Employee(102, 60000));
        employees.add(new Employee(103, 50000));
        employees.add(new Employee(104, 55000));

        // Sorting the employees
        Collections.sort(employees);

        // Display sorted list
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
