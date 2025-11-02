import java.util.*;
public class char_type_check{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
    
    s.close();
}
}