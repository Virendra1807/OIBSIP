package OnlineExamination;
import java.util.Scanner;

public class Main {
    

    public static void quizfun() {
            // quiz options
            Scanner sc2 = new Scanner(System.in);
            QuizClass QC = new QuizClass();
            System.out.println("========================================");
            System.out.println("1 - Math Quiz");
            System.out.println("2 - Java Quiz");
            System.out.print("Select Quiz : ");
            int select = sc2.nextInt();
            if(select==1){
                int totalScore = QC.mathQuiz();
                System.out.println("You Score "+totalScore+" Out of 5");
                System.out.println("---------------------------------");

            }
            else if(select==2){
                int totalScore = QC.javaQuiz();
                System.out.println("You Score "+totalScore+" Out of 5");
                System.out.println("---------------------------------");
            }
            else{
                System.out.println("You Entered invalid option \n Try Again..!");
                System.exit(0);
            }
            
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudInformation SI = new StudInformation();
    
        SI.setLoginId(12345);
        SI.setPassword(101010);
        System.out.println("========================================");
        System.out.println("Login Id :"+SI.getLoginId());
        System.out.println("Password : "+SI.getPassword());
        System.out.println("========================================");
        while(true){
            System.out.println("1 - Login");
            System.out.println("2 - Update password");
            System.out.println("3 - Exit");
            System.out.print("Select an Option : ");
            int opt = sc.nextInt();
            switch(opt){
                case 1: 
                        //login logic
                        System.out.print("Enter Login Id : ");
                        int a = sc.nextInt();
                        System.out.print("Enter Password : ");
                        int b = sc.nextInt();

                        if(a==SI.getLoginId() && b==SI.getPassword()){
                            //login Successful
                            System.out.println("Login Successfully");
                            quizfun();
                        }
                        else{
                            System.out.println("You Entered Wrong Login Id or Password \n Try Again..!");
                        }
                        break;
                
                case 2:
                    //Update password Logic
                    System.out.print("Enter Login Id : ");
                    int c = sc.nextInt();
                    System.out.print("Enter Password : ");
                    int d = sc.nextInt();

                    if(c==SI.getLoginId() && d==SI.getPassword()){
                        //login Successful
                        System.out.print("Enter New Password : ");
                        int newPassword = sc.nextInt();
                        SI.setPassword(newPassword);
                        System.out.println("Password Changed Successfully");
                    }
                    else{
                        System.out.println("You Entered Wrong Login Id or Password \n Try Again..!");
                    }
                    break;

                default : 
                        System.gc();
                        System.exit(0);
            }
        }
    }
}
