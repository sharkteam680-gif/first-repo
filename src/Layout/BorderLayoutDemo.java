package Layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    JFrame Frame;
    JLabel TitleLabel;
    JPanel WestPanel;
    JTextArea TextArea;
    JScrollPane ScrollPane;
    JButton SubmitButton;

    public BorderLayoutDemo() {
        this.CreateBorderFrame();
    }

    public JFrame CreateBorderFrame() {
        Frame = new JFrame("Border Layout Demo");
        Frame.setSize(600, 400);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Frame.setLayout(new BorderLayout());
        Frame.setVisible(true);
        return Frame;
    }
}