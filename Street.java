public class Street {
    private int firstInt;
    private int secondInt;
    private String name;
    private int time;

    public Street(int firstInt, int secondInt, String name, int time) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
        this.name = name;
        this.time = time;
    }

    public int getFirstInt() {
        return firstInt;
    }

    public void setFirstInt(int firstInt) {
        this.firstInt = firstInt;
    }

    public int getSecondInt() {
        return secondInt;
    }

    public void setSecondInt(int secondInt) {
        this.secondInt = secondInt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Street{" +
                "firstInt=" + firstInt +
                ", secondInt=" + secondInt +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
