package HotelBookingPackage;

import java.util.List;

public class HotelComparisionCompany implements ComparisionInterface {
    List<Hotel> hotels;
    HotelComparisionCompany(List<Hotel> hotels){
        this.hotels = hotels;
    }

    public Hotel findCheapestHotel(Category category) {
        Hotel cheapestHotel = null;
        int cheapestHotelFare = 9999;
        for(Hotel hotel : hotels){
            String categoryString = category.getCategoryString();
            int localHotelFare = hotel.getRate(categoryString);
            if(localHotelFare < cheapestHotelFare){
                cheapestHotelFare = localHotelFare;
                cheapestHotel = hotel;
            }
            else if(localHotelFare == cheapestHotelFare){
                if(hotel.hotelRating > cheapestHotel.hotelRating){
                    cheapestHotel = hotel ;
                }
            }
        }
        return cheapestHotel;
    }
}
