import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Grades : ");
        int nums = sc.nextInt();

        double[] grades = new double[nums];
        double sum = 0;

        for(int i = 0 ; i < nums ; i++){
            System.out.print("Enter Grade "+(i+1)+ " : ");
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }

        double average = sum / nums;
        System.out.print("Average of the Grades : " + average);
    }
}
