import java.util.Arrays;
import java.util.Scanner;
public class anagram {

public static void main(String args[]){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the first string");
    String firstStr=scanner.nextLine();
    System.out.println("Enter the second string");
    String secStr=scanner.nextLine();

    boolean isAnangram=checkAnangram(firstStr,secStr);
if(isAnangram){
    System.out.println("The strings are anagram");

}
else{
    System.out.println("The strings are not angram");
}
scanner.close();

}

public static boolean checkAnangram(String str1, String str2){
    str1=str1.replaceAll("\\s+","").toLowerCase();
    str2=str2.replaceAll("\\s+","").toLowerCase();

    if(str1.length()!=str2.length()){
        return false;
    }

    char[] ArrayStr1=str1.toCharArray();
    char[] ArrayStr2=str2.toCharArray();
    
    Arrays.sort(ArrayStr1);
    Arrays.sort(ArrayStr2);

    return Arrays.equals(ArrayStr1,ArrayStr2);



}

    
}
