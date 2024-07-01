import java.util.ArrayList;

public class Sandwich {
    Bread upperBread;
    Bread lowerBread;

    ArrayList<Ingredient> ingredients;

    public Sandwich(Bread upperBread, Bread lowerBread) {
        this.upperBread = upperBread;
        this.lowerBread = lowerBread;
        this.ingredients = new ArrayList<Ingredient>();
    }
}
