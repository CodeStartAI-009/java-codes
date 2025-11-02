import java.util.*;
public class triangle_type{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a==b==c){
            System.out.println("Equilateral triangle");
        }e
        else if(a==b||b==c||c==a){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene triangle");
        }
    
    s.close();
}
}