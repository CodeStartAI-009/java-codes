import java.util.*;
public class TemperatureConverter{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int temperature=s.nextInt();
        int convertedTemperature=temperature*9/5+32;
        System.out.println("Converted Temperature:"+convertedTemperature);
        s.close();
    }
}