import java.util.Scanner;
public class stringCompress {

    public static void main(String args[]){

Scanner scanner=new Scanner(System.in);
System.out.println("Enter the string");
String str= scanner.nextLine();

String compress=compressString(str);
System.out.println(compress);
scanner.close();
}

public static String compressString(String cmprs){

StringBuilder compressed= new StringBuilder();
int count=1;

for(int i=0;i<cmprs.length();i++)
{
    if(i+1<cmprs.length() && cmprs.charAt(i)==cmprs.charAt(i+1))
    {
        count++;
    }
    else{
        compressed.append(cmprs.charAt(i));
        compressed.append(count);
        count=1;
    }
}
return compressed.toString();

}
  
}
