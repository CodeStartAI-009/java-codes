import java.util.*;
public class AsciiValueFinder{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        int asciiValue=(int)c;
        System.out.println("ASCII Value:"+asciiValue);
        s.close();
    }
}