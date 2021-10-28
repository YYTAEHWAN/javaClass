import javax.swing.*;
import java.awt.*;


class MyFrame2 extends JFrame {
    public MyFrame2() {
        // 현재 화면의 크기를 얻는다
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        setSize(300,200);
        // 프레임의 위치를 현재 화면 중앙으로
        setLocation(screenSize.width/2, screenSize.height / 2);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        this.add(button);
        setVisible(true);

    }
}