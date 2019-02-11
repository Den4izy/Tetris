import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameField extends JPanel implements ActionListener {


    private Timer timer;
    Image dotImg;
    Dot dot;
    Figure figure = new Figure();
    public GameField() {
        setBackground(Color.BLACK);
        loadImages();
        start();



    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(16,16,160,320);
        for(int i = 0; i < figure.arrDot.size(); i++ ){
            g.drawImage(dotImg, figure.arrDot.get(i).dotX, figure.arrDot.get(i).dotY,this);
        }




    }

    public void loadImages(){
        ImageIcon img = new ImageIcon("dot.png");
        dotImg = img.getImage();
    }

    // при запуску програми
    public void start(){
        //dot = new Dot(16,16);
        figure = new Figure();
        timer = new Timer(1050, this);
        timer.start();
    }
    public void move(){
        figure.down(figure);
    }

    // оброблюэться при кожному спрацюваннi циклу
    @Override
    public void actionPerformed(ActionEvent e) {
        move();

        repaint();

    }
}
