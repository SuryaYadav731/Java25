package in.Encap;


//class Hello{
//
//    private String name;
//
//    public void setName(String name){
//        this.name= name;
//    }
//
//    public  String getName(){
//        return name;
//    }
//
//    protected void some(){
//        System.out.println("hello");
//    }
//
//
//}

//
//public class Main {
//    public static void main(String[] args) {
////        Hello nam =new Hello();
////        nam.setName("Surya");
////        System.out.println(nam.getName());
//          int a= 1;
//          int b=2;
//          int c= 3;
//
//        Integer fun(int a, Integer b, Integer c)
//
//        {
//
//            c=b+c;
//
//            b=(b+b)+b;
//
//            c=(10+6)&a;
//
//            c=(4+8)&b;
//
//            b=(a+c)&c;
//
//            Return a+b+c;
//
//        }
//    }
//}
//public class Main{
//    public static void main(String args[]){
//        String name="Hello surya";
//        String nam = String.join("-","Surya", "yadav");
//
//        char ch=name.charAt(7);
//        System.out.println(ch);
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.replace('e', 'p'));
//        System.out.println(name.length());
//        System.out.println(name.substring(2,5));
//        System.out.println(name.contains("su"));
//        System.out.println(nam);
//        System.out.println(name.split("s",2));
//        System.out.println(name.indexOf('s'));
//
//    }}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum of the two numbers is: " + max);

    }
}
