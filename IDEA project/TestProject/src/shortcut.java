public class shortcut {
    public static void main(String[] args) {
        // use .var to create instance
        Student chao = new Student("Chao", 27, 93.2);



    }
}

class Student {
    String name;
    int age;
    double grade;
    // use alt + insert to make constructor

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

class Person extends Student{// you can use Ctrl +H to see hierachy


    public Person(String name, int age, double grade) {
        super(name, age, grade);
    }
}