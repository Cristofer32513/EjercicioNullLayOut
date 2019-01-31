import javax.swing.*;
import java.awt.*;

class VentanaPrincipal extends JFrame {
	public VentanaPrincipal(){
		//getContentPane().setLayout(new FlowLayout());//Layout del JFrame
		getContentPane().setLayout(null);
		setSize(1355, 756);
		setTitle("Formulario de Registro");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JLabel label1=new JLabel("<html> <body>The <b>Classic Form</b> Includes all visible fields for this list. </body></html>");
		label1.setBounds(10, 10, 360, 40);
		label1.setFont(new Font("Times New Roman", 5, 18));
		add(label1);
	
		JLabel label2=new JLabel("<html> <body><b>Form Options</b></body></html>");
		label2.setBounds(10, 60, 120, 40);
		label2.setFont(new Font("Arial", 5, 18));
		add(label2);
		
		JLabel label3=new JLabel("Include the following:");
		label3.setBounds(10, 100, 160, 30);
		label3.setFont(new Font("Times New Roman", 5, 18));
		add(label3);
		
		JCheckBox checkBox1=new JCheckBox("A title for your form");
		checkBox1.setBounds(7, 125, 175, 30);
		checkBox1.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox1);
		
		JTextField txtCaja1=new JTextField("Subscribe to our mailing list");
		txtCaja1.setBounds(10, 155, 340, 30);
		txtCaja1.setFont(new Font("Times New Roman", 5, 18));
		add(txtCaja1);
	}
}

public class Prueba {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
				
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaPrincipal();
			}
		});
		
		System.gc();
	}
}