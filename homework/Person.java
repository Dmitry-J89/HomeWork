public class Person {

    private String gender;
    private String name;
    private int height;
    private int weight;
    private int age;

    {
        gender = "мужской";
        name = "Дмитрий";
        height = 180;
        weight = 80;
        age = 36;
    }

    public void go() {
        System.out.println("go");
    }

    public void sit() {
        System.out.println("sit");
    }

    public void run() {
        System.out.println("run");
    }

    public void speak() {
        System.out.println("speak");
    }

    public void learnJava() {
        System.out.println("learnJava");
    }
}