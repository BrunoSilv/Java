package code.gui.multiplicationtable;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by bruno on 24-04-2017.
 */
public class MultiplicationTableApp  extends JFrame {

    JTextField numFld;
    TableModel tableModel;

    public static void main( String[] args ) {
        MultiplicationTableApp multApp = new MultiplicationTableApp();
        multApp.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        centreWindow( multApp );
        multApp.setVisible(true);
    }

    public MultiplicationTableApp() {
        this.setTitle( "Multiplication Table Application");
        this.setSize( 500, 400 );
        initializeGUI();
    }

    private void initializeGUI() {
        addWindowListener( new ConfirmOnClose() );
        JPanel content = (JPanel)this.getContentPane();
        content.setLayout( new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(2,2,2,2);
        c.gridx = 0;    //0th column
        c.gridy = 0;    //0th Row
        c.gridwidth = 2;  // Title spans two columns
        JLabel label = new JLabel( "Multiplication Tables", SwingConstants.CENTER );
        content.add( label,c );

        c.gridx = 0;    //0th Column
        c.gridy = 4;    //1st Row
        c.gridwidth = 1;
        label = new JLabel( "Enter a Number", SwingConstants.LEFT );
        content.add( label, c );

        c.gridx = 1;    //1st Row
        c.gridy = 4;    //1st Column
        c.gridwidth = 1;
        numFld = new JTextField( "", 4);
        content.add( numFld, c );

        c.gridx = 0;    //0th Column
        c.gridy = 5;    //1st Row
        c.gridwidth = 2;
        JButton button = new JButton( "CreateMultiplicationTable" );
        button.setActionCommand( "createmultitable" );
        button.addActionListener( new ButtonActions() );
        content.add( button, c );

        c.gridx = 1;    //1st Row
        c.gridy = 2;    //1st Column


        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 2;
        String[] tempmultitable = new String[10];
        String[] header = { "Multiplication Table"};

        tableModel = new TableModel( tempmultitable, header );
        JTable table = new JTable( tableModel );
        JPanel tablepanel = new JPanel( new BorderLayout() );
        tablepanel.add( new JScrollPane(table));


        TableColumnModel colModel = table.getColumnModel();
        TableColumn col = colModel.getColumn( 0 );
        col.setPreferredWidth( 200 );
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        content.add( tablepanel, c );
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

    class ButtonActions implements ActionListener {
        public void actionPerformed( ActionEvent evt ){
            if ( evt.getActionCommand().equalsIgnoreCase( "createmultitable" ) ){
                String numText = numFld.getText();
                int num = Integer.parseInt( numText );
                tableModel.removeAll();
                String data;
                for( int count = 1; count <=10; count++ ) {
                    data = num + " * " + count + " = " + (num*count);
                    tableModel.add( data );
                }

            }
        }
    }
}
