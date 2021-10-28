import javax.swing.*;
import java.awt.*;

class MyFrame5 extends JFrame {
    // 생성자
    public MyFrame5() {
        setSize(500,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame5");

        JPanel panel = new JPanel();
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        // 해당 텍스트 상자는 입력 금지 설정
        t2.setEditable(false);

        panel.add(t1);
        panel.add(t2);
        this.add(panel);
        setVisible(true);

    }
}

public class MyFrameTest5 {
    public static void main(String args[]) {
        MyFrame5 f = new MyFrame5();
    }
}
