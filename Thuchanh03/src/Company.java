import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Company {
    private String nameCompany;
    private Date dateCreate;

    private Employee[] employees = new Employee[10];

    Scanner scanner = new Scanner(System.in);

    public String getNameCompany() {
        return nameCompany;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void showListEmployees(int Count) {
        for (int i = 0; i < Count; i++) {
            employees[i].displayEmployee();
            System.out.println("---------------------------------");
        }
    }

    public void addNewEmployee(Employee e, int Count) {


        System.out.println("Enter New Employee Information: ");

        System.out.println("Input name new employee: ");
        e.name = scanner.nextLine();

        System.out.println("Input yearOfBirth new employee: ");
        e.yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        // gender

        // dateJoin
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            System.out.println("Input dateJoin new employee: ");
            Date date = (Date) sdf.parse(scanner.nextLine());
            e.setDateJoin(date);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }

        System.out.println("Input position new employee: ");
        e.setPosition(scanner.nextLine());

        System.out.println("Input salaryLevel new employee: ");
        e.setSalaryLevel(scanner.nextDouble());
    }

    // thong bao da tuyen toi da so nguoi
    public void info() {
        System.out.println("The company has hired enough people.");
    }
}

