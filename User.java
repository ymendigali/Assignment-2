package HW2;

public class User {
    private String firstName;
    private String secondName;
    private int id;
    private int age;
    private String gender;
    private String password;
    private String dateOfBirth;
    int idS = 0;
    public User(String fname,String sname,int Age,String Gender,String Password,String DB){
        this.firstName = fname;
        this.secondName = sname;
        this.id = idS;
        this.age = Age;
        this.gender = Gender;
        this.password = Password;
        this.dateOfBirth = DB;
        idS++;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getGender() {
        return gender;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getPassword() {
        return password;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void PrintAll(){
        System.out.println(firstName + " " + secondName + " " + id + " " + age + " " + gender + " " + password + " " + dateOfBirth);
    }
}
