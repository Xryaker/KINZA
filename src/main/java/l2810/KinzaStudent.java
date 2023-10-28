package l2810;

public class KinzaStudent {
    private String family, name;
    private int age;

    public void setAge(int age) {
        checkAge(age);
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("family = " + family);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    public KinzaStudent(String f, String name, int age) {
        this.family = f;
        this.name = name;
        checkAge(age);
    }

    public KinzaStudent(int age) {
        this.family = "Dou";
        this.name = "John";
        checkAge(age);
    }

    public void printByear() {
        System.out.println(2023 - age);
    }

    private void checkAge(int age) {
        if (age < 15 || age > 60) {
            this.age = 15;
        } else {
            this.age = age;
        }
    }
}
