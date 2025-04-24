public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.gender = "Самец";
        wolf.name = "Мудрец";
        wolf.weight = 40;
        wolf.age = 10;
        wolf.color = "Серый";

        System.out.println("Пол: " + wolf.gender);
        System.out.println("Кличка: " + wolf.name);
        System.out.println("Вес: " + wolf.weight);
        System.out.println("Возраст: " + wolf.age);
        System.out.println("Окрас: " + wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}