
import java.util.Scanner;
public class palindrome {

    public static void main(String args[]){

Scanner scanner=new Scanner(System.in);
System.out.println("Enter the string");
String str=scanner.nextLine();
boolean state= palin(str);
if(state){
    System.out.println("The string is palindrome");
    
}
else{
    System.out.println("The string is not palindrome");
}
scanner.close();
    }

    public static boolean palin(String name){
        StringBuilder reverse=new StringBuilder();
        for(int i=name.length()-1;i>=0;i--){
            reverse.append(name.charAt(i));

        }
        String reversedString=reverse.toString();

        if(name.equals(reversedString)){
            return true;
        }
        else{
            return false;
        }


    }

    
}
