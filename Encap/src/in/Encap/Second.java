package in.Encap;

//import java.util.Scanner;
//
//public class Second {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//
//            System.out.print("Enter the number: ");
//            int num = scanner.nextInt();
//
//            System.out.print("Enter the bit position to check (n): ");
//            int n = scanner.nextInt();
//
//            if (n <= 0) {
//                System.out.println("Error: Bit position should be greater than 0.");
//                return;
//            }
//            if ((num & (1 << (n - 1))) != 0) {
//                System.out.println("The " + n + "th bit of " + num + " is set (1).");
//            } else {
//                System.out.println("The " + n + "th bit of " + num + " is not set (0).");
//            }
//        } catch (Exception e) {
//            System.out.println("Error: Please provide valid integers for both inputs.");
//        }
//    }
//
//public static void main(String[] args) {
//    int a= 10;
//    int b = 0;
//
//    try{
//        System.out.println(a/b);
//
//    } catch (ArithmeticException e) {
//        System.out.println(e.toString());
//    }
//
//
//}
//

    // Custom exception class
//    public class Second extends Exception {
//        public Second(String message) {
//            super(message);
//        }
//    }
//    public class UpiValidator {
//
//        // Method to validate UPI ID
//        public static void validateUpiId(String upiId) throws Second {
//            // Regular expression for valid UPI ID format (example: username@bank)
//            String upiRegex = "^[a-zA-Z0-9.\\-_]{2,256}@[a-zA-Z]{2,64}$";
//
//            // Check if UPI ID matches the pattern
//            if (!upiId.matches(upiRegex)) {
//                // Throw custom exception if UPI ID is invalid
//                throw new Second("Invalid UPI ID: " + upiId);
//            } else {
//                System.out.println("UPI ID is valid: " + upiId);
//            }
//        }
//
//        public static void main(String[] args) {
//            String upiId = "testuser@bank";  // Test UPI ID
//
//            try {
//                validateUpiId(upiId);  // Validate UPI ID
//            } catch (Second e) {
//                // Handle custom exception
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//
//}
//
// Second.java
