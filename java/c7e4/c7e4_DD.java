import java.util.Scanner;

public class c7e4_DD {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int score = 0;

        // score = Qmult("combien de pattes ont les chats ?", 3, ("4", "2","3","4"));

    }

    // cette fonction va poser une question, la question est en paramètre.
    // la réponse à la question est également un paramètre.
    // les question à choix multiple sont composée de 4 propositions

    static int Qmult(String _Question, int _responce, String[] _case) {

        String _r = "";

        System.out.println("question ?\n[" + _case[0] + "]\n[" + _case[1] + "]\n[" + _case[2] + "]\n[" + _case[3] + "]\n");

        if (_r == "") {
            return 2;
        } else {
            return 0;
        }

    }
}