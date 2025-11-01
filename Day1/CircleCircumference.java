import java.util.*;
public class CircleCircumference{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int radius=s.nextInt();
        double circumference=2*3.14*radius;
        System.out.println("Circumference:"+circumference);
        s.close();
    }
}