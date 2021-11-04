
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

class MyFrame extends JFrame {

    Scanner scn;

    public MyFrame() {
        scn = new Scanner(System.in);
    }
    
    public int Menu() {
        System.out.println("--------------------");
        System.out.println("<MENU>");
        System.out.println("--------------------"); 
        System.out.println("1. FlowLayout");
        System.out.println("2. BorderLayout");
        System.out.println("3. BoxLayout");
        System.out.println("4. GridLayout");
        System.out.println("5. CardLayout");
        System.out.println("6. Absolute Layout");

        System.out.println("0. Exit");
        System.out.println("--------------------"); 

        int sel = scn.nextInt(); scn.nextLine();
        return sel;
    }

    public void Flow() {
        setTitle("FlowLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel;
        // 패널을 생성하고 배치 관리자를 FlowLayout으로 설정
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        // 패널에 버튼을 생성하여 추가
        panel.add(new JButton("Button1"));
        panel.add(new JButton("Button2"));
        panel.add(new JButton("Button3"));
        panel.add(new JButton("B4"));
        panel.add(new JButton("Long Button5"));
        add(panel);
        pack();
        setVisible(true);
    }

    public void Border() {
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

    public void Absolute() {
        setTitle("Absolute Position Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);

        JPanel p = new JPanel();
        p.setLayout(null); // 파일의 배치 관리자 제거

        JButton b1 = new JButton("Button #1");
        p.add(b1);
        JButton b2 = new JButton("Button #2");
        p.add(b2);
        JButton b3 = new JButton("Button #3");
        p.add(b3);

        b1.setBounds(20,5,95,30);
        b2.setBounds(55,45,105,70);
        b3.setBounds(180,15,105,90);
        add(p);
        setVisible(true);
    }

    
}

public class Qz14 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        
        while(true) {
            switch(f.Menu()) {
                case 1:
                f.Flow();
                break;

                case 2:
                f.Border();
                break;

                case 3:

                break;

                case 4:

                break;

                case 5:

                break;

                case 6:
                f.Absolute();
                break;

                case 0:
                return;
            }
        }
    }
}