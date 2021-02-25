import java.util.ArrayList;

public class Utilities {

    public Street searchStreet(String streetName, ArrayList<Street> streets){
        Street wanted = null;
        for (Street street : streets){
            if (street.getName().equals(streetName)){
                wanted = street;
                break;
            }
        }
        return wanted;
    }

    public void calculateTime(Car car){
        for (Street street : car.getStreets()){
            car.setMaxTime(car.getMaxTime() + street.getTime());
        }
    }

}
