import java.util.ArrayList;

public class Car {
    private int numStreets;
    private ArrayList<Street> streets;
    private int maxTime;

    public Car(int numStreets) {
        this.numStreets = numStreets;
        this.streets = new ArrayList<>();
        this.maxTime = 0;
    }

    public int getNumStreets() {
        return numStreets;
    }

    public void setNumStreets(int numStreets) {
        this.numStreets = numStreets;
    }

    public ArrayList<Street> getStreets() {
        return streets;
    }

    public void setStreets(ArrayList<Street> streets) {
        this.streets = streets;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numStreets=" + numStreets +
                ", streets=" + streets +
                ", maxTime=" + maxTime +
                '}';
    }
}


