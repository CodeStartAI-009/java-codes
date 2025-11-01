import java.util.*;
public class CircleArea{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int radius=s.nextInt();
        double area=3.14*radius*radius;
        System.out.println("Area:"+area);
        s.close();
    }
}