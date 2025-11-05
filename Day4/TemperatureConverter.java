import java.util.*;
public class TemperatureConverter{
    public int temp(int a){
        return (a * 9/5) + 32;

    }
    public static void main(String[] args){
         int a;
         Scanner s=new Scanner(System.in);
         a=s.nextInt();
         TemperatureConverter t=new TemperatureConverter();
         a=t.temp(a);
         System.out.println(a);
         s.close();
    }
}