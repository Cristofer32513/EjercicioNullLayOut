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
		label1.setFont(new Font("Arial", 5, 18));
		add(label1);
	
	
	
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