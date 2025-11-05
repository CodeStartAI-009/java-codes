import java.util.*;
public class RectangleArea{
    public int area(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        RectangleArea r=new RectangleArea();
        a=r.area(a,b);
        System.out.println(a);
        s.close();
      
    }
}