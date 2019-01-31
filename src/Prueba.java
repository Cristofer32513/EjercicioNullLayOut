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
		
		JLabel label1=new JLabel("<html> <body>The <b>Classic Form</b> Includes all visible fields for this list</body></html>");
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
		
		ButtonGroup bg=new ButtonGroup();
		JRadioButton rb1=new JRadioButton("   Only required fields");
		rb1.setBounds(10, 210, 340, 30);
		rb1.setFont(new Font("Times New Roman", 5, 18));
		bg.add(rb1);
		add(rb1);
		JRadioButton rb2=new JRadioButton("   All fields");
		rb2.setBounds(10, 235, 340, 30);
		rb2.setFont(new Font("Times New Roman", 5, 18));
		bg.add(rb2);
		add(rb2);
		
		//INCOMPLETO
		JLabel label4=new JLabel("<html> <body>(edit required fields in <b>the form builder</b>)</body></html>");
		label4.setBounds(30, 265, 200, 30);
		label4.setFont(new Font("Times New Roman", 5, 12));
		add(label4);
		
		JCheckBox checkBox2=new JCheckBox("Interest group fields");
		checkBox2.setBounds(7, 320, 175, 30);
		checkBox2.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox2);
		JCheckBox checkBox3=new JCheckBox("Required fields indicators");
		checkBox3.setBounds(7, 350, 210, 30);
		checkBox3.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox3);
		
		JLabel label5=new JLabel("Set form width:");
		label5.setBounds(10, 420, 160, 30);
		label5.setFont(new Font("Times New Roman", 5, 18));
		add(label5);
		
		JTextField txtCaja2=new JTextField();
		txtCaja2.setBounds(10, 450, 340, 30);
		txtCaja2.setFont(new Font("Times New Roman", 5, 18));
		add(txtCaja2);
		
		JLabel label6=new JLabel("Enhance your form");
		label6.setBounds(10, 500, 160, 30);
		label6.setFont(new Font("Times New Roman", 5, 18));
		add(label6);
		
		//INCOMPLETO
		JCheckBox checkBox4=new JCheckBox("<html> <body>Enable <b>evil</b> popup mode</body></html>");
		checkBox4.setBounds(7, 525, 220, 30);
		checkBox4.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox4);
		
		//INCOMPLETO
		JCheckBox checkBox5=new JCheckBox("<html> <body>Disable all <b>JavaScript</b></body></html>");
		checkBox5.setBounds(7, 550, 220, 30);
		checkBox5.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox5);
		
		//INCOMPLETO
		JCheckBox checkBox6=new JCheckBox("Include archive link");
		checkBox6.setBounds(7, 575, 200, 30);
		checkBox6.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox6);
		
		//INCOMPLETO
		JCheckBox checkBox7=new JCheckBox("<html> <body>Include <b>MonkeyRewards link</b></body></html>");
		checkBox7.setBounds(7, 600, 250, 30);
		checkBox7.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox7);
		
		JLabel label7=new JLabel("Preview");
		label7.setBounds(380, 10, 160, 30);
		label7.setFont(new Font("Arial", 5	, 24));
		add(label7);
		
		JPanel panel1=new JPanel(null);
			panel1.setBorder(BorderFactory.createTitledBorder(""));
			panel1.setBounds(380, 40, 800, 300);
			
	
			
			
		add(panel1);
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