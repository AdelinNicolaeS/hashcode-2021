import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Test {

    public static void main(String[] args) throws IOException {
        Utilities utilities = new Utilities();
        Random random = new Random();
        ArrayList<Street> allStreets = new ArrayList<>();
        ArrayList<Intersection> allIntersections = new ArrayList<>();
        ArrayList<Car> allCars = new ArrayList<>();
        ArrayList<Car> sortedCar = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        int simulationTime;
        int intersections;
        int streets;
        int cars;
        int points;
        String line = bufferedReader.readLine();
        String[] values = line.split(" ");
        simulationTime = Integer.parseInt(values[0]);
        intersections = Integer.parseInt(values[1]);
        streets = Integer.parseInt(values[2]);
        cars = Integer.parseInt(values[3]);
        points = Integer.parseInt(values[4]);
        for (int i = 0; i < intersections; i++) {
            allIntersections.add(new Intersection(i));
        }
        for (int i = 0; i < streets; i++) {
            line = bufferedReader.readLine();
            String[] values2 = line.split(" ");
            Street newStreet = new Street(Integer.parseInt(values2[0]), Integer.parseInt(values2[1]), values2[2], Integer.parseInt(values2[3]));
            allIntersections.get(Integer.parseInt(values2[0])).getOutStreets().add(newStreet);
            allIntersections.get(Integer.parseInt(values2[1])).getInStreets().add(newStreet);
            allStreets.add(newStreet);
        }
        for (int i = 0; i < cars; i++) {
            line = bufferedReader.readLine();
            String[] values3 = line.split(" ");
            Car newCar = new Car(Integer.parseInt(values3[0]));
            for (int j = 0; j < Integer.parseInt(values3[0]); j++) {
                newCar.getStreets().add(utilities.searchStreet(values3[j + 1], allStreets));
            }
            utilities.calculateTime(newCar);
            allCars.add(newCar);
        }
        allIntersections.forEach(System.out::println);
        BufferedWriter writer = new BufferedWriter(new FileWriter("ceva.txt"));
        Collections.sort(allIntersections, Comparator.comparing(intersection -> intersection.getInStreets().size()));
        ArrayList<Street> checkStreets = new ArrayList<>();
//        int count = 0;
//        while (checkStreets.size() != allStreets.size()){
//
//        }
        int count = allIntersections.size();
        writer.write(count + "\n");
        for (int i = 0; i < allIntersections.size(); i ++ ){
            writer.write(allIntersections.get(i).getId() + "\n");
            writer.write(allIntersections.get(i).getInStreets().size() + "\n");
            for (int j = 0; j < allIntersections.get(i).getInStreets().size(); j ++){
                writer.write(allIntersections.get(i).getInStreets().get(j).getName() + " ");
                writer .write(random.nextInt(2)  + "\n");
            }
        }
        writer.flush();
        writer.close();
    }
}
