package code.gui.graphics;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by bruno on 24-04-2017.
 */
public class BasicShapesApp extends JFrame {

    public static void main( String[] args ) {
        BasicShapesApp basicShapesApp = new BasicShapesApp();
        basicShapesApp.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        centreWindow( basicShapesApp );
        basicShapesApp.setVisible(true);
    }

    public BasicShapesApp() {
        this.setTitle( "Basic Shapes Application");
        this.setSize( 800, 600 );
        addWindowListener( new ConfirmOnClose() );
    }

    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
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

    public void paint( Graphics g ) {
        super.paint( g );
        Font font = new Font("Serif", Font.PLAIN, 36);
        g.setFont(font);
        g.setColor( Color.RED );
        g.drawString( "Hello World!", 20, 70 );
        g.setColor( Color.BLACK );

        g.drawLine( 80, 80, 80, 400 );
        g.drawLine( 80, 400, 400, 400 );
        g.drawLine( 400, 400, 400, 80 );
        g.drawLine( 400, 80, 80, 80 );

        Graphics2D g2 = (Graphics2D)g;

        Rectangle2D.Double rect = new Rectangle2D.Double(120, 120, 120, 120);
        g2.draw( rect );
        g2.setColor( Color.CYAN );
        g2.fillRect(120, 120, 120, 120);

        rect.setRect( 150, 150, 120, 120 );
        g2.draw( rect );
        g2.setColor( Color.GREEN );
        g2.fillRect( 150, 150, 120, 120 );

        g2.setColor( Color.BLACK );

        Ellipse2D.Double ellipse = new Ellipse2D.Double( 120, 280, 100, 60 );
        g2.draw( ellipse );

        Ellipse2D.Double circle = new Ellipse2D.Double( 260, 120, 100, 100 );
        g2.draw( circle );

        Arc2D.Double arc = new Arc2D.Double( 260, 240, 100, 50, 0, 180, Arc2D.OPEN );
        g2.draw( arc );






    }

}
