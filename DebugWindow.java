import javax.swing.*;
import java.awt.*;

public class DebugWindow {

    private static final JFrame frame = new JFrame("Debug Console");
    private static final JTextArea console = new JTextArea();

    static {
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        console.setEditable(false);
        console.setFont(new Font("Monospaced", Font.PLAIN, 14));

        frame.add(new JScrollPane(console));
        frame.setVisible(true);
    }

    public static void addLog(String message) {
        console.append(message + "\n");
        console.setCaretPosition(console.getDocument().getLength());
    }
}