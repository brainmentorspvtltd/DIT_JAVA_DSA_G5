/*
 * Copy Constructor in Java?
 * No 
 * 1. Passing a Reference and Copy Value by Value
 * 2. clone method
 */

 class Student implements Cloneable{
    private int rollno;
    private String name;
    private String course;
    private double fees;

    Student(int rollno, String name, String course, double fees){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.fees = fees;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public boolean equals(Object object){
            if(this == object){
                return true;
            }
            if(object instanceof Student){
                Student p = (Student) object; // Downcasting
                if(this.name.equals(p.name) && this.rollno == p.rollno && this.fees == p.fees){
                    return true;
                }
            }
            return false;
    }

 }

class Person extends Object{
    private String name;
    private int age;
    Person(){

    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }
    @Override
    public boolean equals(Object object){
            if(this == object){
                return true;
            }
            if(object instanceof Person){
                Person p = (Person) object; // Downcasting
                if(this.name.equals(p.name) && this.age == p.age){
                    return true;
                }
            }
            return false;
    }
}
public class ConstructorExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Person amit = new Person("Amit", 22);
        // Person amit2 = null;
        // amit2 = new Person(amit);
        // System.out.println("Ref Same "+(amit == amit2));
        // System.out.println("Value Same "+(amit.equals(amit2)));

        Student ram = new Student(1001, "Ram", "Java",999);
        Student shyam = (Student)ram.clone(); // Downcasting
        System.out.println("Ref Compare "+(ram == shyam));
        System.out.println("Value Compare "+(ram.equals(shyam)));

       
    }
}
