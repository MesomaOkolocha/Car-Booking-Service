package Bookings;

import java.util.ArrayList;
import java.util.List;

public class CarBookingDAO {
    private static List<CarBooking> bookings;

    static{
        bookings = new ArrayList<>();
    }

    public void saveBooking(CarBooking booking){
        bookings.add(booking);
    }

    public List<CarBooking> bookings(){
        return bookings;
    }
}
