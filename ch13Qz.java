import java.awt.*;
import javax.swing.*;

class MyFrame8 extends JFrame {
    public MyFrame8() {
        setTitle("Welcome to the Hotel java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);

        JPanel panel0 = new JPanel(); // 최종 패널
        JPanel panel1 = new JPanel(); 
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        // panel1
        JLabel l1 = new JLabel("We in java Hotel Welcome you");
        panel1.add(l1);

        // panel2
        JLabel l2 = new JLabel("Your name please  ");
        JTextField text = new JTextField(15);
        panel2.add(l2);
        panel2.add(text);

        // panel3
        JLabel l3 = new JLabel("How many nights are you going to stay?");
        panel3.add(l3);

        // panel4
        JButton b1 = new JButton("1 night");
        JButton b2 = new JButton("2 nights");
        JButton b3 = new JButton("3 nights");
        JButton b4 = new JButton("4 nights");
        JButton b5 = new JButton("5 nights");
        panel4.add(b1);
        panel4.add(b2);
        panel4.add(b3);
        panel4.add(b4);
        panel4.add(b5);

        // 최종 판넬에 추가
        panel0.setLayout(new BoxLayout(panel0, BoxLayout.Y_AXIS));
        panel1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel3.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel4.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel0.add(panel1);
        panel0.add(panel2);
        panel0.add(panel3);
        panel0.add(panel4);

        // 컨테이너에 최종 패널 추가
        this.add(panel0);
        pack();

        setVisible(true);
    }
}

public class ch13Qz {
    public static void main(String[] args) {
        MyFrame8 f = new MyFrame8();
       
    }
}
