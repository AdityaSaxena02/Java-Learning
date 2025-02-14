class Student{
    String name;
    int age;
    String favouriteSubject;

    public Student(String name, int age, String favouriteSubject){
        this.name = name;
        this.age = age;
        this.favouriteSubject = favouriteSubject;
    }

    public void updateAge(){
        age += 1;
        System.out.println("The age has been updated to "+  age);
    }

    public void updateSubject(){
        favouriteSubject = "Java";
        System.out.println("the favourite Subject has been updates to " + favouriteSubject);
    }
}

public class Main{
    public static void main(String[] args){
        Student s1 = new Student("Aditya", 25, "DSA");
        System.out.println(s1);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.favouriteSubject);
        s1.updateAge();
        System.out.println(s1);
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.updateSubject();
    }
}