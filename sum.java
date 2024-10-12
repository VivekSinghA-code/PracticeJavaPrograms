import java.util.Scanner;
public class sum {


    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNum=scanner.nextInt();
        System.out.println("Enter the second number");
        int secNum=scanner.nextInt();
        int addtion=sum(firstNum,secNum);
        System.out.println("The sum of the numbers is "+ addtion);  
        scanner.close();
    }

    public static int sum(int num1, int num2){
        int sumOfnums= num1+num2;
        return sumOfnums;
    }

    
}
