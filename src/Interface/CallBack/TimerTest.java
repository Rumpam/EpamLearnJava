package Interface.CallBack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new javax.swing.Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Завершить программу?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        Date now = new Date();
        System.out.println("Звонок, время" + now);
        Toolkit.getDefaultToolkit().beep();
    }
}
