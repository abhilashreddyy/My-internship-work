package HotelBookingPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class HotelTesting {
    List<Hotel> hotels ;

    public HotelTesting() {
        hotels = new ArrayList<Hotel>();
    }
    Map<String, Integer> generateRateCard(int premiumWeekday,int regularWeekday, int premiumWeekend, int regularWeekend){

        Map<String, Integer> rateCard = new HashMap<String, Integer>();
        rateCard.put("PREMIUMWEEKDAY",premiumWeekday);
        rateCard.put("REGULARWEEKDAY",regularWeekday);
        rateCard.put("PREMIUMWEEKEND",premiumWeekend);
        rateCard.put("REGULARWEEKEND",regularWeekend);

        return rateCard;
    }
    @Before
    public void DefaultHotels(){
        Hotel lakeWoodHotel = new Hotel("LakeWood",3);
        lakeWoodHotel.updateRatecard(generateRateCard(80,110,80,90));
        hotels.add(lakeWoodHotel);

        Hotel bridgeWoodHotel = new Hotel("BridgeWood",4);
        bridgeWoodHotel.updateRatecard(generateRateCard(110,160,50,60));
        hotels.add(bridgeWoodHotel);

        Hotel ridgeWoodHotel = new Hotel("RidgeWood",5);
        ridgeWoodHotel.updateRatecard(generateRateCard(110,220,40,150));
        hotels.add(ridgeWoodHotel);
    }
    @Test
    public void findCheapestHotelTestWeekDayPremium(){
        Category categoryWeekdayPremium =  new Category("WEEKDAY","PREMIUM");
        HotelComparisionCompany goibibo = new HotelComparisionCompany(hotels);
        Hotel cheapestHotelWeekdayPremium = goibibo.findCheapestHotel(categoryWeekdayPremium);
        Assert.assertEquals("LakeWood",cheapestHotelWeekdayPremium.hotelName);

//        Category categoryWeekdayRegular =  new Category("WEEKDAY","REGULAR");
//        HotelComparisionCompany travelandco = new HotelComparisionCompany(hotels);
//        Hotel cheapestHotelWeekdayRegular = travelandco.findCheapestHotel(categoryWeekdayRegular);
//        Assert.assertEquals("LakeWood",cheapestHotelWeekdayRegular.hotelName);
    }


}
