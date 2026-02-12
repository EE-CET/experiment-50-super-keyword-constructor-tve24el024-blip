class Person {
    Person() {
        System.out.println("Person class");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("Student class");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
