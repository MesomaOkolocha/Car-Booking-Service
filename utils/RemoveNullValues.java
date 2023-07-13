package utils;

import Bookings.CarBooking;
import Cars.Car;
import User.User;

public final class RemoveNullValues {

    private RemoveNullValues(){}
    //helper method to remove null elements from array of users
    public static User[] removeNullUsers(User[] inputArray) {
        // Count the number of non-null elements
        int count = 0;
        for (User element : inputArray) {
            if (element != null) {
                count++;
            }
        }
        // Create a new array of non-null element
        User[] newArray = new User[count];
        int index = 0;
        for (User element : inputArray) {
            if (element != null) {
                newArray[index] = element;
                index++;
            }
        }

        return newArray;
    }

    //helper method to remove null elements from array of cars
    public static Car[] removeNullCars(Car[] inputArray) {
        // Count the number of non-null elements
        int count = 0;
        for (Car element : inputArray) {
            if (element != null) {
                count++;
            }
        }

        // Create a new array of non-null elements
        Car[] newArray = new Car[count];
        int index = 0;
        for (Car element : inputArray) {
            if (element != null) {
                newArray[index] = element;
                index++;
            }
        }

        return newArray;
    }

    //helper method to remove null elements from array of bookings
    public static CarBooking[] removeNullBookings(CarBooking[] inputArray) {
        // Count the number of non-null elements
        int count = 0;
        for (CarBooking element : inputArray) {
            if (element != null) {
                count++;
            }
        }

        // Create a new array of non-null elements
        CarBooking[] newArray = new CarBooking[count];
        int index = 0;
        for (CarBooking element : inputArray) {
            if (element != null) {
                newArray[index] = element;
                index++;
            }
        }

        return newArray;
    }
}
