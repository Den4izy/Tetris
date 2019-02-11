import javax.swing.*;
import java.awt.*;

public class Dot {

    int dotX;
    int dotY;


    public Dot(int x, int y){
        dotX = x;
        dotY = y;


    }
    public Dot createDot(int x, int y){
        Dot dot = new Dot(x, y);

        return dot;
    }
}
