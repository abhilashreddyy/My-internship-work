package HotelBookingPackage;

enum Day{
    WEEKEND,WEEKDAY;
}

enum CustomerType{
    REGULAR,PREMIUM;
}

public class Category {
    Day day ;
    CustomerType customerType ;

    Category(String day, String customerType){
        setCategory(day, customerType);
    }

    //@Override
    //public boolean equals(Category obj) {
    //    return
    //}

    public String getCategoryString(){
        return  customerType.name() + day.name() ;
    }
    private boolean setCategory(String day, String customerType){
        try{
            this.day = Day.valueOf(day);
            this.customerType = CustomerType.valueOf(customerType);
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

}
