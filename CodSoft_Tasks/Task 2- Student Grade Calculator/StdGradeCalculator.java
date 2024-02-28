import java.util.Scanner;
public class StdGradeCalculator 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of Subjects: ");
        int nS = scanner.nextInt();

        int[] marks = new int[nS];
        int totalMarks = 0;

        for (int i = 0; i < nS; i++)
        {
            System.out.print("Enter marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / (nS * 100) * 100;

        System.out.println("Here is Your Result:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
    public static String calculateGrade(double percentage)
    {
        if (percentage >= 95) 
        {
            return "A";
        }
        else if (percentage >= 85)
        {
            return "B";
        }
        else if (percentage >= 75)
        {
            return "C";
        }
        else if (percentage >= 55)
        {
            return "D";
        } 
        else if (percentage >= 35) 
        {
            return "E";
        } 
        else 
        {
            return "F";
        }
    }
}