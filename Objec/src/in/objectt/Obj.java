package in.objectt;
//class Employee{
//    int salary;
//    String name;
//
//
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name =  n;
//
//    }
//
//}
// class CellPhone{
//    public void ringing(){
//        System.out.println("Phone is ringing");
//    }
//
//    public void vibrating(){
//        System.out.println("Phone is vibrating");
//    }
//
// }

import org.w3c.dom.ls.LSOutput;

class Animal{

    public void animal(){
        System.out.println("I am animal");
    }

}

class Dog extends Animal{

    public void dog(){
        System.out.println("I am Dog");
    }


}




public class Obj {

    public static void main(String[] args) {
//  Employee surya = new Employee();
//  CellPhone yadav = new CellPhone();
//  yadav.ringing();
//  yadav.vibrating();
//
//  surya.setName("Surya Yadav");
//  surya.salary = 250;
//        System.out.println(surya.getName());
//        System.out.println(surya.getSalary());

        Dog tommy = new Dog();
        tommy.dog();
        tommy.animal();
    }
}
