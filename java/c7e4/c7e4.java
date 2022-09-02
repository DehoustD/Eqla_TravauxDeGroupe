import java.util.Scanner;

public class c7e4 {

    static Scanner input = new Scanner(System.in);
    
    static void question(int score){
        System.out.println("question 1");
        String r1=input.nextLine();
        String rc1="";
        if (r1.equals(rc1)) {
            score+=3;
            System.out.println("Vous gagnez 3 points.");
        }
        else {
            System.out.println("Réponse incorecte!\nProchaine question...");
        }
    }

    public static void main(String[] args) {
        
    }
}