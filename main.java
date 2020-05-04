package HW2;

import java.util.Scanner;

import static HW2.Validator.checkAge;
import static HW2.Validator.checkDB;
import static HW2.Validator.checkPassword;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String fname = scan.next();
        int age = scan.nextInt();
        String gender = scan.next();
        String password = scan.next();
        String DB = scan.next();
        User user = new User(name,fname,age,gender,password,DB);
        if(!checkAge(user.getAge()) || !checkPassword(user.getPassword()) || !checkDB(user.getDateOfBirth())){
            System.out.println("Fail");
        }else{
            System.out.println("Success");
        }
    }
}
