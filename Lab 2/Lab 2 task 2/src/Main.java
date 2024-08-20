public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i;
        int even=0,odd=0;

        for (i=1;i<=100;i++){
            if(i%2==0){

                even=even+i;
            }
            else{
                odd=odd+i;
            }

        }
        System.out.print("Sum of even is :");
        System.out.println(even);
        System.out.print("Sum of odds is :");
        System.out.println(odd);
    }
}