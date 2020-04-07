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

        ArrayOrganizer arrayorg = new ArrayOrganizer();
        ArrayList4 = arrayorg.concatAndSort(ArrayList1,ArrayList2,ArrayList3);
        System.out.println(ArrayList4);

    }

}
