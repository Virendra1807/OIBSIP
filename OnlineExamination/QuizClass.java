package OnlineExamination;
import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

public class QuizClass {
    
    Scanner sc = new Scanner(System.in);
    public int mathQuiz(){
        int score = 0;
        System.out.println("Q1) What is the value of PI ?");
        System.out.println("a)4.12  b)9.8  c)3.14  d)6.62");
        System.out.print("Your Ans : ");
        double ans = sc.nextDouble();
        if(ans==3.14){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }

        System.out.println("Q2) 100 + 250 = ?");
        System.out.println("a)250  b)100  c)150  d)350");
        System.out.print("Your Ans : ");
        int ans2 = sc.nextInt();
        if(ans2==350){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }

        System.out.println("Q3) 500 * 3 = ?");
        System.out.println("a)1200  b)1500  c)1700  d)2000");
        System.out.print("Your Ans : ");
        int ans3 = sc.nextInt();
        if(ans3==1500){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }

        System.out.println("Q4) 999 / 3 = ?");
        System.out.println("a)33  b)133  c)333  d)331");
        System.out.print("Your Ans : ");
        int ans4 = sc.nextInt();
        if(ans4==333){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }
    
        System.out.println("Q5) 2+3-3 = ?");
        System.out.println("a)5  b)3  c)2  d)NA");
        System.out.print("Your Ans : ");
        int ans5 = sc.nextInt();
        if(ans5==2){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }

        return score;
    }

    public int javaQuiz(){
        int score = 0;

        System.out.println("Q1) Java is fully OOP language ?");
        System.out.println("1)No  2)Yes 3)Don't know  4)NA");
        System.out.print("Your Ans : ");
        int ans = sc.nextInt();
        if(ans==1){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }

        System.out.println("Q2)Java is short for JavaScript");
        System.out.println("1)True  2)False 3)Don't know  4)NA");
        System.out.print("Your Ans : ");
        int ans2 = sc.nextInt();
        if(ans2==2){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }

        System.out.println("Q3)How do you insert COMMENTS in Java code?");
        System.out.println("1)$  2)# 3)//  4)NA");
        System.out.print("Your Ans : ");
        int ans3 = sc.nextInt();
        if(ans3==3){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }

        System.out.println("Q4)Which data type is used to create a variable that should store text?");
        System.out.println("1)String  2)char 3)text  4)myString");
        System.out.print("Your Ans : ");
        int ans4 = sc.nextInt();
        if(ans4==1){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }
    
        System.out.println("Q5)How do you create a variable with the numeric value 5 ?");
        System.out.println("1)num = 5  2)float = 5  3)int num = 5  4)int = 5");
        System.out.print("Your Ans : ");
        int ans5 = sc.nextInt();
        if(ans5==3){
            System.out.println("Right Answer");
            score++;
        }
        else{
            System.out.println("Wrong Answer ");
        }
        return score;
    }
}
