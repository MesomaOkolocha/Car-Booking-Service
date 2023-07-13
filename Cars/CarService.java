package Cars;

import java.util.List;

public class CarService {
    private final CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    //0 means added successfully, 1 means failure
    public void addNewCar(Car car){
        //check if user is not null
        if (car.equals(null)){
            System.out.println("car is null!, pass in a user");
        }else{
            //check if car with same reg number already exists
            for(int i=0;i<carDAO.getCars().size();i++){
                if (car.getRegNumber().equals(carDAO.getCars().get(i).getRegNumber())){
                    System.out.println("Can't have the same reg Number\n"+"Car "+ carDAO.getCars().get(i) +" already exists");
                    return;
                }
            }
            //Set car to available then add it to the database
            car.setAvailable(true);
            carDAO.saveCar(car);
        }
    }

    public List<Car> getCars(){
        return carDAO.getCars();
    }
}
