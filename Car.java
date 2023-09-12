public class Car {
    private final String name;
    private final String state;
    private final double speed;
    private final String color;

    public Car(String name, String state, double speed, String color) {
        this.name = name;
        this.state = state;
        this.speed = speed;
        this.color = color;
    }

    public void displayState() {
        System.out.println(name + " is " + state + ".");
        System.out.println("Speed: " + speed + " units per second");
        System.out.println("Color: " + color);
    }
}
