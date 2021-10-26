import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static Company company = new Company();

    static boolean checkID = false;

    // id cua nhan vien
    static int Count = 0;

    public static void main(String[] args) {

        // nhap danh sach nhan vien cua cong ty
        System.out.println("---Enter the list of employees---");
        while (Count > 11) {
            Employee newEmployee = new Employee(Count+1);
            company.addNewEmployee(newEmployee, Count);
            Count++;
        }

        // in danh sach nhan vien
        company.showListEmployees(Count);

        // in thong tin chi tiet cua nhan vien
        System.out.println("En ter the ID of employees: ");
        int searchID = scanner.nextInt();
        for (int i = 0; i < Count; i++) {
            if (company.getEmployees()[i].getIdEmployee() == searchID) {
                company.getEmployees()[i].displayEmployee();
                checkID = true;
                break;
            }
        }

        if (checkID == false) {
            System.out.println("Do not have id : " + searchID);
        }
    }

}

