import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */

            int grade[] = new int[grades.length];
         for(int i=0;i<grades.length;i++)
         {
             int temp = grades[i]%5;
             int new_grade=0;
             System.out.println(5-temp);
             if(5-temp<3 && grades[i]>=38)
             {
                 
                 new_grade = 5-temp+grades[i];
             }
             else
             {
                 new_grade = grades[i];
             }

             grade[i]=new_grade;
         }

        return grade;
        

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
