package code.gui.helloworldapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by bruno on 24-04-2017.
 */
public class HelloWorld extends JFrame {

    public static void main( String[] args ) {
        HelloWorld helloWroldFrame = new HelloWorld();
        helloWroldFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        helloWroldFrame.setVisible(true);
    }

    public HelloWorld() {
        this.setTitle( "Hello World Application");
        this.setSize( 500, 400 );
        initializeGUI();
    }

    private void initializeGUI() {
        JPanel content = (JPanel)this.getContentPane();
        content.setLayout( new GridLayout(3,1));
        JLabel label = new JLabel( "Welcome to Hello World Application", SwingConstants.CENTER );
        content.add( label,SwingConstants.CENTER );
        addWindowListener( new ConfirmOnClose() );
    }

    class ConfirmOnClose extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            int confirm = JOptionPane.showConfirmDialog(e.getWindow(), "Are you sure you want exit?");
            if( confirm == 0 ) {
                e.getWindow().dispose();
                System.exit(0);
            }
        }
    }


}
