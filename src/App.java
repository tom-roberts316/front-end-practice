import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("My Application");
        window.setSize(420, 420);
        window.setLocation(300, 300);
        final JTextArea textArea = new JTextArea(10, 40);
        window.getContentPane().add(BorderLayout.CENTER, textArea);
        final JButton button = new JButton("Click");
        window.getContentPane().add(BorderLayout.SOUTH, button);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea.append("Button was clicked");
            }
        });

        window.setVisible(true);

    }


}
