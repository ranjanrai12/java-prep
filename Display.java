public class Display {
    public static void main(String[] args) {
        show();
    }

    static void show() {
        System.out.println("Example of static method");
    }

    private String name;

    public String getName() {
        return name;
    }
}
