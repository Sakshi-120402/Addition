import java.util.Scanner;

public class Addition2
{    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter num1:");
    int num1=sc.nextInt();

    System.out.println("Enter num2:");
    int num2=sc.nextInt();

    int sum= num1+num2;
    System.out.println("sum="+sum);

    int avg=sum/2;
    System.out.println(avg);
    }
}
