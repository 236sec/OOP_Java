public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Sandwich test = new Sandwich(new Bread(), new Bread());
        test.ingredients.add(new Ingredient());
    }
}
