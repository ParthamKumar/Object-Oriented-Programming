import java.util.Scanner;

// User name is  (22k4079)
// Password is (pk420)
public class Main {
    public static void menu(){

        Scanner input = new Scanner(System.in);
        int choice;
        char select;

        System.out.println("**Welcome to bank of Pakistan**");
        System.out.println("1 Deposit Money");
        System.out.println("2 Withdraw Amount");
        System.out.println("3 Account Status");

        choice = input.nextInt();
        switch(choice) {

            case 1:
                System.out.println("Deposit Money");
                break;
            case 2:
                System.out.println("Withdraw Amount");
                break;
            case 3:
                System.out.println("Account Status");
                break;
        }
        System.out.println("Do you want to continue yes[Y or y] ");
        select = input.next().charAt(0);
        if ('y' == select || 'Y'==select){
            menu();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world");

        // User name is  (22k4079)
        // Password is (pk420)

        String username, password;


        System.out.println("Enter username");
        username = input.nextLine();



        if(username.compareTo("22k4079")==0){

            System.out.println("Enter password");
            password = input.nextLine();

        if (password.compareTo("pk420")==0){



            System.out.println("\nWhat do you want to perform");
            menu();
        }else {
            System.out.println("Wrong password");
        }

        }else {
            System.out.println("Wrong Username ");
        }


    }
}