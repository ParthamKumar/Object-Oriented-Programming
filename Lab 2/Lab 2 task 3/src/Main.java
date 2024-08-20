import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        int i;
        int table;
        int print;

        System.out.println("Enter the number");
        table =sc.nextInt();

        for (i=1;i<=10;i++){
            print=table*i;
            System.out.println(print);

        }

    }
}