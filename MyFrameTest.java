import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
        setVisible(true);

        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        JButton button2 = new JButton("버튼2");
        this.add(button);
        this.add(button2);
        setVisible(true);
    }
}


public class MyFrameTest {
    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
    }
}
