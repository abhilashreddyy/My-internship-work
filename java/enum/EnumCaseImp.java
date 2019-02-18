
import java.util.Scanner;
enum Day{
    MONDAY, TUESDAY ,WEDNESDAY, THIRSDAY, FRIDAY, SATURDAY, SUNDAY;
}
public class EnumCaseImp {
    Day d;

    EnumCaseImp(Day d){
        this.d = d;
    }
    public void DescribeDay(){
        switch (d){
            case MONDAY:;
            case TUESDAY:;
            case WEDNESDAY:;
            case THIRSDAY:;
            case FRIDAY:
                System.out.println("not a week end :-(");
                break;
            case SATURDAY:;
            case SUNDAY:
                System.out.println("Weekend :-)");
                break;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your day : ");
        String inp = sc.nextLine();

        EnumCaseImp temp = new EnumCaseImp(Day.valueOf(inp));
        temp.DescribeDay();


    }
}
