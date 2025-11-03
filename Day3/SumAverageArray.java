import java.util.*;
public class SumAverageArray{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        double average = 0;
        if(n > 0) {
            average = (double)sum / n;
        }
        System.out.println(sum);
        System.out.println(average);
    }
}
