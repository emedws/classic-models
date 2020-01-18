package mx.emmanuel.classicmodels.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private int officeCode;
    private Integer reportsTo;
    private String jobTitle;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(int officeCode) {
        this.officeCode = officeCode;
    }

    public int getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
