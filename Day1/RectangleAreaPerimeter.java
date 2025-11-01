import java.util.*;
public class RectangleAreaPerimeter{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int length=s.nextInt();
        int width=s.nextInt();
        int area=length*width;
        int perimeter=2*(length+width);
        System.out.println("Area:"+area+" "+"Perimeter:"+perimeter);
        s.close();
    }
}