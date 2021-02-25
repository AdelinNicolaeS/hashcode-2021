import java.util.ArrayList;

public class Intersection {
    private int Id;
    private ArrayList<Street> inStreets;
    private ArrayList<Street> outStreets;

    public Intersection(int id) {
        Id = id;
        this.inStreets = new ArrayList<>();
        this.outStreets = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public ArrayList<Street> getInStreets() {
        return inStreets;
    }

    public void setInStreets(ArrayList<Street> inStreets) {
        this.inStreets = inStreets;
    }

    public ArrayList<Street> getOutStreets() {
        return outStreets;
    }

    public void setOutStreets(ArrayList<Street> outStreets) {
        this.outStreets = outStreets;
    }

    @Override
    public String toString() {
        return "Intersection{" +
                "Id=" + Id +
                ", inStreets=" + inStreets +
                ", outStreets=" + outStreets +
                '}';
    }
}
