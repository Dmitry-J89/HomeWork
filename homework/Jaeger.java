public class Jaeger {

    private String modelName;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String origin, double height, double weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void printInfo() {
        System.out.println("Модель: " + modelName);
        System.out.println("Происхождение: " + origin);
        System.out.println("Рост: " + height + " м");
        System.out.println("Вес: " + weight + " т");
        System.out.println("Скорость: " + speed);
        System.out.println("Сила: " + strength);
        System.out.println("Броня: " + armor);
    }

    public void drift() {
        System.out.println(modelName + " Активирован. Управление синхронизировано.");
    }
}