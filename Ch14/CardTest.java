package Ch14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
class MyFrame3 extends JFrame implements ActionListener {
    JPanel panel;
    Cards cards;
    public MyFrame3() {
        setTitle("BorderLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);

        panel = new JPanel(new GridLayout(0,5,10,0));
        addButton("<<",panel);
        addButton("<",panel);
        addButton(">",panel);
        addButton(">>", panel);
        addButton("종료",panel);
        add(panel, "North");

        cards = new Cards();
        add(cards, "Center");

    }

    void addButton(String str, Container target) {
        JButton button = new JButton(str);
        button.addActionListener(this);
        target.add(button);
    }
    private class Cards extends JPanel {
        CardLayout layout;
    }
}
public class CardTest {
    
}
*/