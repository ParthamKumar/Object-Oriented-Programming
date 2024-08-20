import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        int num;
        int i,p=0,f=0,total=0,avg=0;
        System.out.println("Enter the number of students");
        num = scanf.nextInt();

       // String[] students = new String[num];
        int[] marks = new int[num];


        for(i=0;i<num;i++){
            System.out.println("Enter the students marks");
            marks[i] = scanf.nextInt();
            total=total+marks[i];

            if(marks[i]>=60){
                p=p+1;
            }
            else{
                f=f+1;
            }
          }

        avg=total/num;
        System.out.printf("Avg is =");
        System.out.println(avg);
        System.out.printf("Number of students that pass =");
        System.out.println(p);
        System.out.printf("Number of students that fail =");
        System.out.println(f);


    }
}