public class Speed {
    public static void main(String[] args) {
        double sec = 2 * 60;

        speed("truck", 400, sec);
    }

    public static void speed(String type, double distance, double time) {
        double sp = distance / time;

        System.out.println("Vehicle: " + type);
        System.out.printf("%s%.2f", "Speed: " + sp);
    }


}
