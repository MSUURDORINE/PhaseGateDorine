import java.util.Scanner;
public class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("How many Students do you have: ");
        int numberOfStudents = input.nextInt();
        
        System.out.print("How many Subjects do you offer: ");
        int numberOfSubjects = input.nextInt();
        
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved Successfully");
        
        for (int index = 1; index <= numberOfStudents; index++) {
            System.out.println("Entering scores for students " + index + " : ");
        
            for (int count = 1; count <= numberOfSubjects; count++) {
                System.out.println("Entering scores for Subject " + (count) + " ");
                int score = input.nextInt();
                if(score < 0 || score > 100){
                System.out.println("Invalid score! Score must be between 0 and 100.");

            }    
        }        
                
        int[][] scores = new int[numberOfStudents][numberOfSubjects];
        int[]total = new int[numberOfStudents];
        int[]position =  new int[numberOfStudents];
        
        
        System.out.println("=======================================================================");
        System.out.println(   "STUDENT + SUB1\t +  SUB2\t +   SUB3\t  +  TOTAL + AVE + POS");
        System.out.println("========================================================================");
      }
    
    }
    
}
              
