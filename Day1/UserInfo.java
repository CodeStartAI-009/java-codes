import java.util.*;
public class UserInfo{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int age=s.nextInt();
        float height=s.nextFloat();
        System.out.println("Name:"+name+" "+"Age:"+age+" "+"Height:"+height);
        s.close();
    }
}