import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Tetris");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400, 400);
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}