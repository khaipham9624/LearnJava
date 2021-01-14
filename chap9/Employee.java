package basic.LearnJava.chap9;

import java.text.NumberFormat;

public class Employee implements Printable, DepartmentConstants{
    private int department;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int department, String lastName, String firstName, double
            salary) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public void print() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Name:\t" + firstName + " " + lastName);
        System.out.println("Salary:\t" + formatter.format(salary));

        String dept = "";
        if (department == DepartmentConstants.ADMIN) {
            dept = "Administrator";
        } else if (department == DepartmentConstants.EDITORIAL) {
            dept = "Editorial";
        } else if (department == DepartmentConstants.MARKETING) {
            dept = "Marketing";
        }

        System.out.println("Dept:\t" + dept);

    }
}
