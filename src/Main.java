import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's score: ");
        int score = sc.nextInt();

        String result = calculateGrade(score);
        System.out.println("Grade: " + result);
    }

    public static String calculateGrade(int score){
            if (score <0 || score >100){
    return "Error";
        }
            if (score >= 90){
                return "A";
            } else if (score >= 80){
                return "B";
            }else if (score >= 70){
                return "C";
            }else if (score >= 60){
                return "D";
            }else{
                return "F";
            }
    }
}