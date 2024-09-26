package in.Encap;
import java.util.Scanner;
public class SecondProject {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the number: ");
            int num = scanner.nextInt();

            System.out.print("Enter the bit position to check (n): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Error: Bit position should be greater than 0.");
                return;
            }
            if ((num & (1 << (n - 1))) != 0) {
                System.out.println("The " + n + "th bit of " + num + " is set (1).");
            } else {
                System.out.println("The " + n + "th bit of " + num + " is not set (0).");
            }
        } catch (Exception e) {
            System.out.println("Error: Please provide valid integers for both inputs.");
        }
    }
}
