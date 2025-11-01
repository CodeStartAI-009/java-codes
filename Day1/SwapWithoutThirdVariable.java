import java.util.*;
public class SwapWithoutThirdVariable{
    public static void main(String[] args){
        int a=10;
        int b=30;
        System.out.println("Before swapping: a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+" b="+b);
    }
}