import java.util.ArrayList;

public class Pizza {
    private int id;
    private int numberOfIngredients;
    private ArrayList<String> ingredients = new ArrayList<>(numberOfIngredients);
    private boolean wasUsed = false;

    @Override
    public String toString() {
        return "Pizza{" +
                "numberOfIngredients=" + numberOfIngredients +
                ", ingredients=" + ingredients +
                ", wasUsed=" + wasUsed +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isWasUsed() {
        return wasUsed;
    }

    public void setWasUsed(boolean wasUsed) {
        this.wasUsed = wasUsed;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setNumberOfIngredients(int numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

}
