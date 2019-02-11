import java.util.ArrayList;
import java.util.Random;

public class Figure {
    int position;
    ArrayList<Dot> arrDot = new ArrayList<Dot>();



    Random random = new Random();


    Figure (){
        //position = 36 + random.nextInt(5 - 1);
        position = 1;
        if (position == 1){
            arrDot.add(new Dot(16,16));
            arrDot.add(new Dot(16,32));
            arrDot.add(new Dot(32,32));
            arrDot.add(new Dot(48,32));

        }
    }
    public void down(Figure figurem){
        for( int i = 0; i < arrDot.size(); i++){
            arrDot.get(i).dotY = arrDot.get(i).dotY + 16;
        }
    }


}
