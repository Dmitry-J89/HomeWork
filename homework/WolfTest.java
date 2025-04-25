public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("Самец");
        wolf.setName("Мудрец");
        wolf.setWeight(40);
        wolf.setAge(10);
        wolf.setColor("Серый");

        System.out.println("Пол: " + wolf.getGender());
        System.out.println("Кличка: " + wolf.getName());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Окрас: " + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();

        wolf.setAge(5);
    }
}