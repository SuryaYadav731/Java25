

import java.util.Scanner;


class UserDefiExcep extends Exception{

    UserDefiExcep(){
    }
}

public class CheckUpi{

    public void validate(int upi) throws UserDefiExcep{
        if(upi != 7310) {
            throw new UserDefiExcep();
        } else {
            System.out.println("Yeah!! you can go ahead...");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the UPI : ");
        int upi = sc.nextInt();

        CheckUpi c = new CheckUpi();

        try {
            c.validate(upi);
        } catch(UserDefiExcep e){
            System.out.println("Exception occurred");
        }


    }
}
