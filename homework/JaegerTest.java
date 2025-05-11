public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger();
        gipsyDanger.setModelName("Gipsy Danger");
        gipsyDanger.setOrigin("USA");
        gipsyDanger.setHeight(79.25);
        gipsyDanger.setWeight(1.980);
        gipsyDanger.setSpeed(7);
        gipsyDanger.setStrength(8);
        gipsyDanger.setArmor(6);

        Jaeger strikerEureka = new Jaeger(
            "Striker Eureka",
            "Australia",
            76.2,
            1.850,
            10,
            10,
            9
        );

        System.out.println("--- Gipsy Danger ---");
        gipsyDanger.printInfo();
        gipsyDanger.drift();

        System.out.println();

        System.out.println("--- Striker Eureka ---");
        strikerEureka.printInfo();
        strikerEureka.drift();
    }
}