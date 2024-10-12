import java.util.Scanner;
public class starPattern {

    public static void main(String args[]){

Scanner scanner= new Scanner(System.in);
System.out.println("Enter the number");
 int number=scanner.nextInt();
 generateStar(number);
 scanner.close();
    }

 public static void generateStar(int n){

 for (int i=1;i<=n;i++){
    for (int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println(" ");
 }
    }
    

   



}
