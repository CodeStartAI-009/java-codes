import java.util.*;
public class century_leap_year{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if(year%400==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
    
    s.close();
}
}