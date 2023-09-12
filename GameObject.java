public class GameObject {
    private final String name;
    private final String state;
    private final double speed;
    private final String color;

    public GameObject(String name, String state, double speed, String color) {
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

    public static void main(String[] args) {
        GameObject obj1 = new GameObject("Object 1", "moving", 10.0, "red");

        obj1.displayState();
    }
}
