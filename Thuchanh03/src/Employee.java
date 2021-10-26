import java.sql.Date;

public class Employee extends Person {
    private int idEmployee;
    private Date dateJoin;
    private String position;
    private Double salaryLevel;
    private static Double basicSalary;

    public Employee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public Double getIncome() {
        return salaryLevel * basicSalary;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Date getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(Date dateJoin) {
        this.dateJoin = dateJoin;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(Double salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public static Double getBasicSalary() {
        return basicSalary;
    }

    public static void setBasicSalary(Double basicSalary) {
        Employee.basicSalary = basicSalary;
    }

    public void displayEmployee() {
        System.out.println("ID: " + idEmployee);
        System.out.println("Name: " + name);
        System.out.println("YearOfBirth: " + yearOfBirth);
        System.out.println("Gender: " + gender.getGenderEnum());
        System.out.println("DateJoin: " + dateJoin);
        System.out.println("Position: " + position);
        System.out.println("Income: " + getIncome());
    }
}

