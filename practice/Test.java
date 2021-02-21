import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File(args[0]));
        int numberOfPizzas = scanner.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        Input input = new Input();
        input.setNumberOfPizzas(numberOfPizzas);
        input.setTeams(arr);
        for (int i = 0; i < input.getNumberOfPizzas(); i++) {
            Pizza pizza = new Pizza();
            int ingredients = scanner.nextInt();
            pizza.setId(i);
            pizza.setNumberOfIngredients(ingredients);
            for (int j = 0; j < ingredients; j++) {
                String newIngredient = scanner.next();
                pizza.getIngredients().add(newIngredient);
            }
            input.getPizzas().add(pizza);
        }
        // La testul c, sunt multe ingrediente, deci incerc sa folosesc cat mai multe
        // prin pizza care are mai multe ingrediente
        input.getPizzas().sort(new AscPizzaByIngredientsSort().reversed());
        Output output = new Output();
        int pizzaNotEaten = input.getNumberOfPizzas();
        for (int j = 4; j >= 2; j--) {
            while (pizzaNotEaten >= j && arr[j - 2] > 0) {
                input.getPizzas().removeIf(Pizza::isWasUsed);
                Team team = new Team();
                team.setNumberOfMembers(j);
                for (int i = 0; i < j; i++) {
                    team.getPizzas().add(input.getPizzas().get(i));
                    input.getPizzas().get(i).setWasUsed(true);
                }
                output.getTeams().add(team);
                arr[j - 2]--;
                pizzaNotEaten -= j;
            }
        }
        output.setNumberOfTeams(output.getTeams().size());
        System.out.println(output);
        FileWriter fileWriter = new FileWriter(new File(args[1]));
        fileWriter.write(output.toString());
        fileWriter.flush();
        fileWriter.close();
    }
}
