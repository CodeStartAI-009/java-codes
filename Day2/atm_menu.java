import java.util.*;
public class atm_menu{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int balance=1000;
        while(true){
            System.out.println("ATM Menu");
            System.out.println("1. Check Balance:"+(balance));
            System.out.println("2. Withdraw:"+(balance-s.nextInt()));
            System.out.println("3. Deposit:"+(balance+s.nextInt()));
            System.out.println("4. Exit");
            int choice=s.nextInt();
            if(choice==1){
                System.out.println("Balance:"+balance);
            }else if(choice==2){
                balance=balance-s.nextInt();
            }else if(choice==3){
                balance=balance+s.nextInt();
            }else if(choice==4){
                break;
            }
        }   
        s.close();
    }
}