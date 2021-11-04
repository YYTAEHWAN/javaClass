package Ch14;

import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame {
    public MyFrame2() {
        setTitle("BorderLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel;
        // 패널을 생성하고 배치 관리자를 BorderLayout으로 설정
        panel = new JPanel();
        panel.setLayout(new BorderLayout()); // 프레임은 디폴트로 borderLayout이므로

        // 패널에 버튼을 생성하여 추가
        panel.add(new JButton("Center"), BorderLayout.CENTER);
        panel.add(new JButton("Line Start"), BorderLayout.LINE_START);
        panel.add(new JButton("Line End"), BorderLayout.LINE_END);
        panel.add(new JButton("Page Start"),BorderLayout.PAGE_START);
        panel.add(new JButton("Page End"), BorderLayout.PAGE_END);
        add(panel);
        pack();
        setVisible(true);
    }
}

public class BorderTest {
    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
    }
    
}
