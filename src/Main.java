import java.util.Random;

public class Main {
    private static final Random random = new Random(2);

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(5);
        employeeBook.add("ivanov ivan", 25000, 1);
        employeeBook.add("sergeev sergei", 30000, 2);
        employeeBook.add("rakhmatulin ramil", 34000, 2);

        employeeBook.printAll(2);
        System.out.println(employeeBook.getSalarySum(2));
        employeeBook.changeSalaryByPercent(100, 1);
        System.out.println();
        employeeBook.printAll();

    }
}