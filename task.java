import java.awt.*;
import javax.swing.*;

class MyFrame5 extends JFrame { // 실패본
    public MyFrame5() {
        setTitle("Welcome to the Hotel java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);

        JPanel panel0 = new JPanel(); // 최종 패널
        JPanel panel1 = new JPanel(); // 라벨 & 텍스트 패널
        JPanel panel2 = new JPanel(); // 버튼 패널

        // panel1
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        JLabel l1 = new JLabel("We in java Hotel Welcome you");
        l1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel l2 = new JLabel("Your name please  ");
        l2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField text = new JTextField();
        text.setAlignmentX(Component.CENTER_ALIGNMENT);
        JLabel l3 = new JLabel("How many nights are you going to stay?");
        l3.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel1.add(l1);
        panel1.add(l2);
        panel1.add(text);
        panel1.add(l3);

        // panel2
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton b1 = new JButton("1 night");
        JButton b2 = new JButton("2 nights");
        JButton b3 = new JButton("3 nights");
        JButton b4 = new JButton("4 nights");
        JButton b5 = new JButton("5 nights");
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);

        // 최종 판넬에 추가
        panel0.setLayout(new BoxLayout(panel0, BoxLayout.Y_AXIS));
        panel0.add(panel1);
        panel0.add(panel2);

        // 컨테이너에 최종 패널 추가
        this.add(panel0);
        pack();

        setVisible(true);
    }
}

public class task {
    public static void main(String[] args) {
        MyFrame5 f = new MyFrame5();
        // 알게된 점 
        // BoxLayout은 완전 다닥다닥 붙어있게 되어 보기 별로임
    }
}
