
class Address {
    private String premisesNumber;
    private String street;
    private String city;
    private String pin;
    private String state;


    public Address(String premisesNumber, String street, String city, String pin, String state) {
        this.premisesNumber = premisesNumber;
        this.street = street;
        this.city = city;
        this.pin = pin;
        this.state = state;
    }

    
    public String getPremisesNumber() {
        return premisesNumber;
    }

    public void setPremisesNumber(String premisesNumber) {
        this.premisesNumber = premisesNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void updateAddress(String premisesNumber, String street, String city, String pin, String state) {
        if (premisesNumber != null) {
            this.premisesNumber = premisesNumber;
        }
        if (street != null) {
            this.street = street;
        }
        if (city != null) {
            this.city = city;
        }
        if (pin != null) {
            this.pin = pin;
        }
        if (state != null) {
            this.state = state;
        }
    }


    public void displayAddress() {
        System.out.println("Address: " + premisesNumber + ", " + street + ", " + city + ", " + pin + ", " + state);
    }
}


class Person {
    private String name;
    private String phoneNumber;
    private String email;
    private Address address;

    
    public Person(String name, String phoneNumber, String email, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        address.displayAddress();
    }
}


class Student extends Person {
    private int rollNumber;
    private String courseOfStudy;


    public Student(String name, String phoneNumber, String email, Address address, int rollNumber, String courseOfStudy) {
        super(name, phoneNumber, email, address);
        this.rollNumber = rollNumber;
        this.courseOfStudy = courseOfStudy;
    }

  
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    
    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course of Study: " + courseOfStudy);
    }
}


class Faculty extends Person {
    private int employeeId;
    private String department;
    private String specialization;

    public Faculty(String name, String phoneNumber, String email, Address address, int employeeId, String department, String specialization) {
        super(name, phoneNumber, email, address);
        this.employeeId = employeeId;
        this.department = department;
        this.specialization = specialization;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

  
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
    }
}

public class code2 {
    public static void main(String[] args) {
     
        Address address1 = new Address("123", "Main Street", "City", "123456", "State");

        Student student1 = new Student("John Doe", "1234567890", "john@example.com", address1, 101, "Computer Science");

        Faculty faculty1 = new Faculty("Jane Smith", "9876543210", "jane@example.com", address1, 201, "Engineering", "Mechanical Engineering");

        System.out.println("Student Details:");
        student1.displayPerson();

        System.out.println();

        System.out.println("Faculty Details:");
        faculty1.displayPerson();
    }
}
