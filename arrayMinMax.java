import java.util.Arrays;
import java.util.Scanner;
public class arrayMinMax{

public static void main(String args[]){
    System.out.println("Enter the length of array");
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int[] array= new int[n];
    System.out.println("Enter the values of array");
    for(int i=0;i<n;i++){
        array[i]=scanner.nextInt();
    }
int maximum=max(array);
System.out.println("The maximum value is "+maximum);
int minimum=min(array);
System.out.println("The minimum value is "+minimum);
}
public static int max(int[] array1){
    int max=array1[0];
    for(int num:array1){
        if(num>max){
            max=num;
        }
    }
    return max;

}

public static int min(int[] array2){
    int min=array2[0];
    for(int num2:array2){
        if(num2<min){
            min=num2;
        }
    }
    return min;
}
    
}
