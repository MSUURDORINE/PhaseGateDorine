public class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Ask for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Step 2: Ask for number of subjects
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = input.nextInt();

        // Step 3: Create a 2D array
        int[][] scores = new int[numberOfStudents][numberOfSubjects];

        // Step 4: Collect students' scores
        for (int student = 0; student < numberOfStudents; student++) {

            System.out.println("\nEnter scores for Student " + (student + 1));

            for (int subject = 0; subject < numberOfSubjects; subject++) {

                System.out.print("Enter score for Subject " + (subject + 1) + ": ");

                int score = input.nextInt();

                // Validate score
                while (score < 0 || score > 100) {

                    System.out.println("Invalid score! Score must be between 0 and 100.");

                    System.out.print("Enter score again: ");
                    score = input.nextInt();
                }

                scores[student][subject] = score;
            }
        }

        // Step 5: Display student summary
        System.out.println("\n========== CLASS SUMMARY ==========");

        int classTotal = 0;

        for (int student = 0; student < numberOfStudents; student++) {

            int studentTotal = 0;

            for (int subject = 0; subject < numberOfSubjects; subject++) {

                studentTotal += scores[student][subject];

            }

            double average = (double) studentTotal / numberOfSubjects;

            classTotal += studentTotal;

            System.out.println("\nStudent " + (student + 1));
            System.out.println("Total Score: " + studentTotal);
            System.out.println("Average Score: " + average);
        }

        // Step 6: Calculate class average
        double classAverage = (double) classTotal /
                (numberOfStudents * numberOfSubjects);

        System.out.println("\n========== OVERALL CLASS SUMMARY ==========");
        System.out.println("Total Students: " + numberOfStudents);
        System.out.println("Total Subjects: " + numberOfSubjects);
        System.out.println("Class Average: " + classAverage);

        input.close();
    }
}

3. Understand the most important part
