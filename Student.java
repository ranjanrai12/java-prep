
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        super();
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 101);
        Student s2 = new Student("Ranjan", 102);
        System.out.println(s1);
        System.out.println(s2);
    }
}