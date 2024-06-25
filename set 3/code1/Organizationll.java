import java.util.LinkedList;

class Department {
    String deptCode;
    String deptName;
    String location;

    public Department(String deptCode, String deptName, String location) {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.location = location;
    }
}

class Employee {
    String empCode;
    String empName;
    double basicPay;
    String deptCode;

    public Employee(String empCode, String empName, double basicPay, String deptCode) {
        this.empCode = empCode;
        this.empName = empName;
        this.basicPay = basicPay;
        this.deptCode = deptCode;
    }
}

public class Organizationll {
    LinkedList<Department> departments;
    LinkedList<Employee> employees;

    public Organizationll() {
        departments = new LinkedList<>();
        employees = new LinkedList<>();
    }

    public void addDepartment(String deptCode, String deptName, String location) {
        departments.add(new Department(deptCode, deptName, location));
        System.out.println("Department " + deptName + " added successfully.");
    }

    public void addEmployee(String empCode, String empName, double basicPay, String deptCode) {
        employees.add(new Employee(empCode, empName, basicPay, deptCode));
        System.out.println("Employee " + empName + " added successfully.");
    }

    public void displayEmployeeDetails(String empCode) {
        for (Employee emp : employees) {
            if (emp.empCode.equals(empCode)) {
                System.out.println("Employee Name: " + emp.empName);
                System.out.println("Employee Code: " + emp.empCode);
                System.out.println("Basic Pay: " + emp.basicPay);
                for (Department dept : departments) {
                    if (dept.deptCode.equals(emp.deptCode)) {
                        System.out.println("Department Name: " + dept.deptName);
                        System.out.println("Department Location: " + dept.location);
                        break;
                    }
                }
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void displayAllEmployees() {
        for (Employee emp : employees) {
            System.out.println("Employee Name: " + emp.empName);
            System.out.println("Employee Code: " + emp.empCode);
            System.out.println("Basic Pay: " + emp.basicPay);
            for (Department dept : departments) {
                if (dept.deptCode.equals(emp.deptCode)) {
                    System.out.println("Department Name: " + dept.deptName);
                    System.out.println("Department Location: " + dept.location);
                    break;
                }
            }
            System.out.println();
        }
    }

    public double getTotalBasicPayForDepartment(String deptCode) {
        double total = 0;
        for (Employee emp : employees) {
            if (emp.deptCode.equals(deptCode)) {
                total += emp.basicPay;
            }
        }
        return total;
    }

    public void removeEmployee(String empCode) {
        for (Employee emp : employees) {
            if (emp.empCode.equals(empCode)) {
                employees.remove(emp);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void modifyBasicPay(String empCode, double newBasic) {
        for (Employee emp : employees) {
            if (emp.empCode.equals(empCode)) {
                emp.basicPay = newBasic;
                System.out.println("Basic pay modified successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void sortEmployeesByBasicPayDesc() {
        employees.sort((emp1, emp2) -> Double.compare(emp2.basicPay, emp1.basicPay));
        displayAllEmployees();
    }

    public void sortEmployeesByDeptCode() {
        employees.sort((emp1, emp2) -> emp1.deptCode.compareTo(emp2.deptCode));
        displayAllEmployees();
    }

    public void sortEmployeesByEmpCode() {
        employees.sort((emp1, emp2) -> emp1.empCode.compareTo(emp2.empCode));
        displayAllEmployees();
    }

    public static void main(String[] args) {
        Organizationll org = new Organizationll();

        // Adding departments
        org.addDepartment("D001", "HR", "New York");
        org.addDepartment("D002", "Finance", "London");

        // Adding employees
        org.addEmployee("E001", "John Doe", 50000, "D001");
        org.addEmployee("E002", "Jane Smith", 60000, "D001");
        org.addEmployee("E003", "David Johnson", 70000, "D002");

        // Displaying employee details
        org.displayEmployeeDetails("E002");

        // Displaying all employees
        org.displayAllEmployees();

        // Getting total basic pay for a department
        double totalPay = org.getTotalBasicPayForDepartment("D001");
        System.out.println("Total basic pay for HR department: " + totalPay);

        // Removing an employee
        org.removeEmployee("E002");

        // Modifying basic pay
        org.modifyBasicPay("E001", 55000);

        // Sorting employees
        System.out.println("Sorting employees by basic pay in descending order:");
        org.sortEmployeesByBasicPayDesc();
    }
}
