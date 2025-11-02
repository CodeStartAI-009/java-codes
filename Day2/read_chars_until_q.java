import java.util.*;
public class read_chars_until_q{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        while(c!='q'){
            System.out.println(c);
            c=s.next().charAt(0);
        }
        s.close();
    }
}