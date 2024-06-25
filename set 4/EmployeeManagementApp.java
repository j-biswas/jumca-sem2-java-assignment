import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class Employee {
    private String empCode;
    private String empName;
    private double basicSalary;
    private String grade;
    private String deptCode;

    public Employee(String empCode, String empName, double basicSalary, String grade, String deptCode) {
        this.empCode = empCode;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.grade = grade;
        this.deptCode = deptCode;
    }

    public String getEmpCode() {
        return empCode;
    }

    @Override
    public String toString() {
        return "Employee Code: " + empCode + "\n" +
               "Employee Name: " + empName + "\n" +
               "Basic Salary: " + basicSalary + "\n" +
               "Grade: " + grade + "\n" +
               "Department Code: " + deptCode;
    }
}

class EmployeeStorage {
    private Map<String, Employee> employeeMap = new HashMap<>();

    public boolean addEmployee(Employee employee) {
        if (employeeMap.containsKey(employee.getEmpCode())) {
            return false;
        }
        employeeMap.put(employee.getEmpCode(), employee);
        return true;
    }

    public Employee getEmployee(String empCode) {
        return employeeMap.get(empCode);
    }
}

class AddEmployeeGUI extends JFrame {
    private JTextField empCodeField;
    private JTextField empNameField;
    private JTextField basicSalaryField;
    private JComboBox<String> gradeComboBox;
    private JComboBox<String> deptComboBox;
    private EmployeeStorage storage;

    public AddEmployeeGUI(EmployeeStorage storage) {
        this.storage = storage;
        setTitle("Add Employee");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        empCodeField = new JTextField();
        empNameField = new JTextField();
        basicSalaryField = new JTextField();
        gradeComboBox = new JComboBox<>(new String[] {"A", "B", "C"});
        deptComboBox = new JComboBox<>(new String[] {"HR", "IT", "Finance"});

        add(new JLabel("Emp Code:"));
        add(empCodeField);
        add(new JLabel("Emp Name:"));
        add(empNameField);
        add(new JLabel("Basic Salary:"));
        add(basicSalaryField);
        add(new JLabel("Grade:"));
        add(gradeComboBox);
        add(new JLabel("Dept:"));
        add(deptComboBox);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new SaveButtonListener());
        add(saveButton);
        setVisible(true);
    }

    private class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String empCode = empCodeField.getText();
            String empName = empNameField.getText();
            double basicSalary = Double.parseDouble(basicSalaryField.getText());
            String grade = (String) gradeComboBox.getSelectedItem();
            String deptCode = (String) deptComboBox.getSelectedItem();

            Employee employee = new Employee(empCode, empName, basicSalary, grade, deptCode);

            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save this employee?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                boolean success = storage.addEmployee(employee);
                if (success) {
                    JOptionPane.showMessageDialog(null, "Employee added successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Duplicate employee code!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}

class SearchEmployeeGUI extends JFrame {
    private JTextField empCodeField;
    private EmployeeStorage storage;

    public SearchEmployeeGUI(EmployeeStorage storage) {
        this.storage = storage;
        setTitle("Search Employee");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        empCodeField = new JTextField();

        add(new JLabel("Emp Code:"));
        add(empCodeField);

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new SearchButtonListener());
        add(searchButton);
        setVisible(true);
    }

    private class SearchButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String empCode = empCodeField.getText();
            Employee employee = storage.getEmployee(empCode);
            if (employee != null) {
                JOptionPane.showMessageDialog(null, employee.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Employee not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

public class EmployeeManagementApp {
    public static void main(String[] args) {
        EmployeeStorage storage = new EmployeeStorage();
        SwingUtilities.invokeLater(() -> new AddEmployeeGUI(storage));
        SwingUtilities.invokeLater(() -> new SearchEmployeeGUI(storage));
    }
}
