import java.util.*;
public class TriangleArea{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int base=s.nextInt();
        int height=s.nextInt();
        double area=0.5*base*height;
        System.out.println("Area:"+area);
        s.close();
    }
}