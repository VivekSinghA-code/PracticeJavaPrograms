import java.util.Scanner;

public class reverseString {
    
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        //Enter the input string
        System.out.println("Enter the string");
        String input=scanner.nextLine();
        String finalOutput=reverseString(input);
        System.out.println("The reversesed string is " +finalOutput);
        scanner.close();
        
    }

    public static String reverseString(String str){

        StringBuilder reverse=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reverse.append(str.charAt(i));

        }
        return reverse.toString();
    }

}
