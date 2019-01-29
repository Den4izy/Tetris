import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {

    private Image dot;
    private Timer timer;

    public GameField() {
        setBackground(Color.BLACK);
        loadImages();
    }
    //загрузка картинок
    public void loadImages(){
        ImageIcon img = new ImageIcon("dot.png");
        dot = img.getImage();
    }
}
