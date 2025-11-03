import java.util.*;
public class MinElement{
    public static void main(Strings[] args){
        Scanner s=new scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int min=a[0];
        for(int i=1;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.ot.println(min);
    }
}