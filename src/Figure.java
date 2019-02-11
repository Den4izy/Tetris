import java.util.ArrayList;
import java.util.Random;

public class Figure {
    int position;

    Random random = new Random();


    Figure (){
        position = 36 + random.nextInt(5 - 1);
        ArrayList<Dot> arrDot;
    }

}
