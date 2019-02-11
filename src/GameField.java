import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameField extends JPanel implements ActionListener {


    private Timer timer;
    Image dotImg;
    Dot dot;
    public GameField() {
        setBackground(Color.BLACK);
        loadImages();
        start();



    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(dotImg,dot.dotX,dot.dotY,this);


    }

    public void loadImages(){
        ImageIcon img = new ImageIcon("dot.png");
        dotImg = img.getImage();
    }

    // при запуску програми
    public void start(){
        dot = new Dot(16,16);
        Figure figure = new Figure();
        timer = new Timer(1050, this);
        timer.start();
    }
    public void move(){
        dot.dotY = dot.dotY + 16;
    }

    // оброблюэться при кожному спрацюваннi циклу
    @Override
    public void actionPerformed(ActionEvent e) {
        move();

        repaint();

    }
}
