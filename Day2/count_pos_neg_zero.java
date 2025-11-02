import java.util.*;
public class count_pos_neg_zero{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int pos=0;
        int neg=0;
        int zero=0;
        while(n!=0){
            if(n>0){
                pos++;
            }else if(n<0){
                neg++;
            }else{
                zero++;
            }
            n=s.nextInt();
        }
        System.out.println("Positive:"+pos+" "+"Negative:"+neg+" "+"Zero:"+zero);
        s.close();
    }
}