import java.util.Comparator;

public class AscPizzaByIngredientsSort implements Comparator<Pizza> {
    @Override
    public int compare(Pizza pizza1, Pizza pizza2) {
        return pizza1.getNumberOfIngredients() - pizza2.getNumberOfIngredients();
    }
}
