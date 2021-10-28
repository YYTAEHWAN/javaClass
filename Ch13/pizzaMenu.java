package Ch13;
import javax.swing.*;
import java.awt.*;

class MyFramePizza extends JFrame {
    public MyFramePizza () {
        setSize(450,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("피자 선택");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();


        JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다 피자의 종류를 선택하세요");
        panelA.add(label);

        JButton b1 = new JButton("콤보피자");
        JButton b2 = new JButton("포테이토 피자");
        JButton b3 = new JButton(); b3.setText("볼고기 피자");
        panelB.add(b1);
        panelB.add(b2);
        panelB.add(b3);

        panel.add(panelA);
        panel.add(panelB);

        add(panel);
        setVisible(true);
    }
}

public class pizzaMenu {
    public static void main(String[] args) {
        MyFramePizza p = new MyFramePizza();
    }
}
