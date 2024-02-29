public class City {
    public static String generateWelcomeMessage(String name, String city, String state) {
        return "Hello, " + name + "! Welcome to " + city + ", " + state + "!";
    }

    public static void main(String[] args) {
        String name = "John Smith";
        String city = "Phoenix";
        String state = "Arizona";
        String welcomeMessage = generateWelcomeMessage(name, city, state);
        System.out.println(welcomeMessage);
    }
}
