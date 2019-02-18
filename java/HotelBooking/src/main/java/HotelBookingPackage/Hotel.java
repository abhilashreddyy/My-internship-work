package HotelBookingPackage;


import java.util.EnumMap;
import java.util.Map;
import java.util.HashMap;



public class Hotel {
    String hotelName;
    int hotelRating;
    //EnumMap<Day, EnumMap<CustomerType, Integer>> rateCard ;
    Map<String, Integer> rateCard ;


    Hotel(String hotelName){
        this.hotelName = hotelName;
    }

    Hotel(String hotelName, int hotelRating){
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
    }

    Hotel(String hotelName, int hotelRating, Map<String, Integer> rateCard){
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        updateRatecard(rateCard);
    }



    public boolean updateRatecard(Map<String, Integer> rateCard){
        try {
            this.rateCard = rateCard; //Here we may update data base so i added exception
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    public Integer getRate(String category){
        try{
            return rateCard.get(category);
        }
        catch (Exception e){
            System.out.println("Value Not Found : "+e.getMessage());
            return -1;
        }
    }




}
