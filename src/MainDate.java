import java.util.Scanner;

public class MainDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el mes (entero):");
        int month = scanner.nextInt();

        System.out.println("Ingrese el día (entero):");
        int day = scanner.nextInt();

        System.out.println("Ingrese el año (entero):");
        int year = scanner.nextInt();

        Date userDate = new Date(month, day, year);
        userDate.displayDate("MM/DD/YYYY");
        userDate.displayDate("Month DD, YYYY");
        userDate.displayDate("DD Month YYYY");

        scanner.close();
    }
}
