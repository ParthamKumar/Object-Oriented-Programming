import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        String name;
        int price;
        double total=0;
        char choice;
        int discount;
        double disamt;
        double tax,exact;

        do {
            System.out.println("Enter item");
            name=sc.nextLine();
            System.out.println("Enter price");
            price= sc.nextInt();
            System.out.println("Do you want to continue Y or N");
            choice = sc.next().charAt(0);
            total=total+price;

        }while (choice=='y');
       // System.out.println(total);
        System.out.println("How much discount you want to give");
        discount = sc.nextInt();
        disamt=total*discount;
        System.out.println(disamt);
        total=total-disamt;
        System.out.println("How much is the sales tax");
        tax = sc.nextInt();
        exact =  total +((tax/100)*total);
        System.out.println("Your final bill is :");
        System.out.println(exact);

    }
}