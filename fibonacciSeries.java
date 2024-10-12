import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int inputNumber=scanner.nextInt();
        fibonacciSeries(inputNumber);
        scanner.close();
    }
    public static void fibonacciSeries(int n){
        int firstNum=0;int secNum=1; int next;

        for(int i=1;i<=n;i++){
System.out.println(firstNum+" ");
            next=firstNum+secNum;
firstNum=secNum;
secNum=next;

        }
    }
    
}
