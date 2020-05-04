package HW2;

public class Validator {
    public static boolean checkAge(int age){
        if(age<18){
            return false;
        }else{
            return true;
        }
    }public static boolean checkPassword(String password){
        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        int specialS = 0;
        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) > 65 && password.charAt(i) < 90){
                uppercase++;
            }else if(password.charAt(i) > 97 && password.charAt(i) < 122){
                lowercase++;
            }else if(password.charAt(i) == '@' || password.charAt(i) == '$' || password.charAt(i) == '!' || password.charAt(i) == '^'){
                specialS++;
            }else if(password.charAt(i) > 48 && password.charAt(i) < 57){
                digit++;
            }
        }if(uppercase>=1 && lowercase>=1 && digit>=1 && specialS>=1 && password.length()>=8){
            return true;
        }else{
            return false;
        }
    }public static boolean checkDB(String DB){ // DB = Date of Birth
        if(DB.charAt(0)<48 || DB.charAt(0)>57 || DB.charAt(1)<48 || DB.charAt(1)>48 || DB.charAt(2)!='/' ||  DB.charAt(3)<48 || DB.charAt(3)>57 || DB.charAt(4)<48 || DB.charAt(4)>48 || DB.charAt(5)!='/' ||  DB.charAt(6)<48 || DB.charAt(6)>57 || DB.charAt(7)<48 || DB.charAt(7)>48 ||  DB.charAt(8)<48 || DB.charAt(8)>57 || DB.charAt(9)<48 || DB.charAt(9)>48 || DB.length()!=10){
            return false;
        }
        int day = Integer.parseInt(DB.substring(0, 2));
        int month = Integer.parseInt(DB.substring(3, 5));
        int year = Integer.parseInt(DB.substring(6, 10));
        if(month>12 || day>31){
            return false;
        }else if(month==2 && day>29){
            return false;
        }else if(month==2 && day==29){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                return true;
            }else{
                return false;
            }
        }else if(month==4 || month==6 || month==9 || month==11){
            if(day==31){
                return false;
            }else{
                return true;
            }
        }else{
            return true;
        }
    }
}
