public class code10 {
    public static double kmToMiles(double km) {
        return km / 1.5;
    }

    public static double milesToKm(double miles) {
        return miles * 1.5;
    }

    public static void main(String... args) {
        double kmDistance = 10.0;
        double milesDistance = 6.0;

        System.out.println(kmDistance + " kilometers equals " + kmToMiles(kmDistance) + " miles.");
        System.out.println(milesDistance + " miles equals " + milesToKm(milesDistance) + " kilometers.");
    }
}
