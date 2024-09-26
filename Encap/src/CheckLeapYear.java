import java.util.Scanner;
class NotALeapYearException extends Exception {
    public NotALeapYearException(String message) {
        super(message);
    }
}
public class CheckLeapYear {
    public void validate(int year) throws NotALeapYearException {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year! You can proceed.");
        } else {
            throw new NotALeapYearException(year + " is not a leap year.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year: ");
        int year = sc.nextInt();

        CheckLeapYear check = new CheckLeapYear();

        try {
            check.validate(year);
        } catch (NotALeapYearException e) {

            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
