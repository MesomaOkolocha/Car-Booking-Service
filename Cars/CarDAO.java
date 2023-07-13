package Cars;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    private static List<Car> cars;
    private static int nextAvailableSlot =0;

    static{
        cars = new ArrayList<>();
    }

    public void saveCar(Car car){
        cars.add(car);
    }

    public List<Car> getCars(){
        return cars;
    }

    public int getNextAvailableSlot() {
        return nextAvailableSlot;
    }
}
