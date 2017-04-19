package code.conditions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bruno on 18-04-2017.
 */
public class GradeScores {
    public static void main(String[] args) {
        System.out.println("This program will grade scores");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input;
        try {
            System.out.println("Input your score: ");
            input = br.readLine();
            float score = Float.parseFloat(input);
            String grade = "F";
            if (score >= 90){
                grade = "A+";
            }else if (score >= 80 && score < 90){
                grade = "A";
            }else if (score >= 70 && score < 80){
                grade = "A-";
            }else if (score >= 60 && score < 70){
                grade = "B+";
            }else if (score >= 50 && score < 60){
                grade = "B";
            }else if (score >= 40 && score < 50){
                grade = "B-";
            }else{
                grade = "F";
            }
            System.out.println("Score: " + score + " Grade: " + grade);

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
