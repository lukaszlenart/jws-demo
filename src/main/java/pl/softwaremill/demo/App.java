package pl.softwaremill.demo;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final JFrame frame = new JFrame("Hello World");
        frame.setSize(480, 320);

        JButton button = new JButton("Close");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
            }
        });
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

}
