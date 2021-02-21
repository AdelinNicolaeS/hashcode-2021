import java.util.ArrayList;
import java.util.Arrays;

public class Input {
    private int numberOfPizzas;
    private int[] teams = new int[3];
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public int[] getTeams() {
        return teams;
    }

    public void setTeams(int[] teams) {
        this.teams = teams;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public int getNumberOfPizzas() {
        return numberOfPizzas;
    }

    public void setNumberOfPizzas(int numberOfPizzas) {
        this.numberOfPizzas = numberOfPizzas;
    }

    @Override
    public String toString() {
        return "Input{" +
                "numberOfPizzas=" + numberOfPizzas +
                ", teams=" + Arrays.toString(teams) +
                ", pizzas=" + pizzas +
                '}';
    }

    public boolean existPizzas() {
        for (Pizza pizza : pizzas) {
            if (!pizza.isWasUsed()) {
                return true;
            }
        }
        return false;
    }
}
