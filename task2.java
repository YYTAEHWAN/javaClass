import java.awt.*;
import javax.swing.*;

class MyFrame6 extends JFrame {
    public MyFrame6() {
        setTitle("Welcome to the Hotel java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);

        JPanel panel0 = new JPanel(); // 최종 패널
        JPanel panel1 = new JPanel(); // 라벨 & 텍스트 패널
        JPanel panel2 = new JPanel(); // 버튼 패널

        // panel1
        panel1.setLayout(new BorderLayout(10,10)); // BorderLayout이 디폴트 배치관리자이므로 사실은 불필요
        JLabel l1 = new JLabel("We in java Hotel Welcome you");
        JLabel l2 = new JLabel("Your name please  ");
        JTextField text = new JTextField(15);
        JLabel l3 = new JLabel("How many nights are you going to stay?");
        panel1.add(l1, BorderLayout.PAGE_START);
        panel1.add(l2, BorderLayout.CENTER);
        panel1.add(text, BorderLayout.CENTER);
        panel1.add(l3, BorderLayout.PAGE_END);

        // panel2
        //panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
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
        panel0.setLayout(new BorderLayout());
        panel0.add(panel1, BorderLayout.PAGE_START);
        panel0.add(panel2, BorderLayout.PAGE_END);

        // 컨테이너에 최종 패널 추가
        this.add(panel0);
        pack();

        setVisible(true);
    }
}

public class task2 {
    public static void main(String[] args) {
        MyFrame6 f = new MyFrame6();
    }
}
