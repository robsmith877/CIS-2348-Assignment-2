import java.util.Scanner;
public class Assignment2 {
    public static void main(String [] args){
       int numOfStudents;
       System.out.print("How many students data do you want to enter: ");
       Scanner input = new Scanner(System.in);
       numOfStudents = input.nextInt();

       Student [] studObject = new Student[numOfStudents];
       for(int i = 0; i<numOfStudents;i++){
           studObject[i] = new Student();

           studObject[i].getInfo();
           studObject[i].displayInfo();
       }


    }
}
