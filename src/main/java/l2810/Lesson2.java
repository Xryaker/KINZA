package l2810;

public class Lesson2 {
    public static void main(String[] args) {
        KinzaStudent student1 = new KinzaStudent("Shevchenko", "Vasiliy", 34);
        KinzaStudent student2=new KinzaStudent("Sheva","Nikolay",200);
        student2.printInfo();
        student1.printInfo();
        student1.printByear();
        KinzaStudent student3=new KinzaStudent(36);
        student3.setAge(200);
        student3.printInfo();
        System.out.println(student3.getName());
        KinzaStudent[] massStudent=new KinzaStudent[6];
        massStudent[0]=new KinzaStudent(6);

    }
}
