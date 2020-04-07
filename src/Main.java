import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayList3 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayList4 = new ArrayList<Integer>();
        ArrayList1.add(100);
        ArrayList1.add(500);
        ArrayList1.add(900);
        ArrayList2.add(800);
        ArrayList2.add(600);
        ArrayList2.add(300);
        ArrayList3.add(400);
        ArrayList3.add(700);
        ArrayList3.add(200);

        Player p1 = new Player("Tom");
        Player p2 = new Player("John");
        Player p3 = new Player("James");
        Player p4 = new Player("Henry");
        Die die1 =new Die();

        for(int i = 1; i <= 5 ; i++){
            p1.addScore(die1.rollDie());
            p2.addScore(die1.rollDie());
            p3.addScore(die1.rollDie());
            p4.addScore(die1.rollDie());
        }



        ArrayOrganizer arrayorg = new ArrayOrganizer();
        ArrayList4 = arrayorg.concatAndSort(ArrayList1,ArrayList2,ArrayList3);
        System.out.println(ArrayList4);

        System.out.println("----------------------");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }

}
