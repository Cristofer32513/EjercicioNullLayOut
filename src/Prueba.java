import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

class VentanaPrincipal extends JFrame {
	public VentanaPrincipal(){
		getContentPane().setLayout(null);
		setSize(1000, 650);
		setTitle("Formulario");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		JLabel label1=new JLabel("<html> <body>The <b>Classic Form</b> Includes all visible fields for this list</body></html>");
			label1.setBounds(10, 10, 360, 40);
			label1.setFont(new Font("Times New Roman", 5, 18));
		add(label1);
	
		
		JLabel label2=new JLabel("<html> <body><b>Form Options</b></body></html>");
			label2.setBounds(10, 70, 120, 40);
			label2.setFont(new Font("Arial", 5, 18));
		add(label2);
		
		
		JLabel label3=new JLabel("Include the following:");
			label3.setBounds(10, 100, 160, 30);
			label3.setFont(new Font("Times New Roman", 5, 18));
		add(label3);
		
		
		JCheckBox checkBox1=new JCheckBox("A title for your form");
			checkBox1.setBounds(7, 130, 175, 30);
			checkBox1.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox1);
		
		
		JTextField txtCaja1=new JTextField("Subscribe to our mailing list");
			txtCaja1.setBounds(10, 165, 340, 30);
			txtCaja1.setFont(new Font("Times New Roman", 5, 18));
			txtCaja1.setBackground(new Color(240, 240, 240));
		add(txtCaja1);
		
		
		ButtonGroup bg=new ButtonGroup();
			JRadioButton rb1=new JRadioButton("   Only required fields");
				rb1.setBounds(10, 225, 340, 30);
				rb1.setFont(new Font("Times New Roman", 5, 18));
				bg.add(rb1);
			add(rb1);
			JRadioButton rb2=new JRadioButton("   All fields");
				rb2.setBounds(10, 255, 340, 30);
				rb2.setFont(new Font("Times New Roman", 5, 18));
				bg.add(rb2);
				add(rb2);
				
				
		JLabel label4=new JLabel("<html><body>(edit required fields in <font color=blue>the form builder</font>)</body></html>");
			label4.setBounds(30, 280, 230, 30);
			label4.setFont(new Font("Times New Roman", 5, 14));
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
			label5.setBounds(10, 400, 160, 30);
			label5.setFont(new Font("Times New Roman", 5, 18));
		add(label5);
		
		
		JTextField txtCaja2=new JTextField();
			txtCaja2.setBounds(10, 430, 340, 30);
			txtCaja2.setFont(new Font("Times New Roman", 5, 18));
			txtCaja2.setBackground(new Color(240, 240, 240));
		add(txtCaja2);
		
		
		JLabel label6=new JLabel("Enhance your form");
			label6.setBounds(10, 480, 160, 30);
			label6.setFont(new Font("Times New Roman", 5, 18));
		add(label6);
		
		
		JCheckBox checkBox4=new JCheckBox("<html><body>Enable <b>evil</b> popup mode</body></html>");
			checkBox4.setBounds(7, 500, 220, 30);
			checkBox4.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox4);
		
		
		JCheckBox checkBox5=new JCheckBox("<html><body>Disable all <b>JavaScript</b></body></html>");
			checkBox5.setBounds(7, 530, 220, 30);
			checkBox5.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox5);
		
		
		JCheckBox checkBox6=new JCheckBox("Include archive link");
			checkBox6.setBounds(7, 560, 200, 30);
			checkBox6.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox6);
		
		
		JCheckBox checkBox7=new JCheckBox("<html><body>Include <font color=blue>MonkeyRewards link</font></body></html>");
			checkBox7.setBounds(7, 590, 250, 30);
			checkBox7.setFont(new Font("Times New Roman", 5, 18));
		add(checkBox7);
		
		
		JLabel label7=new JLabel("Preview");
			label7.setBounds(380, 10, 160, 30);
			label7.setFont(new Font("Arial", 5	, 24));
		add(label7);
		
		
		JPanel panel1=new JPanel(null);
			panel1.setBounds(380, 40, 610, 260);
			panel1.setBorder(BorderFactory.createTitledBorder(""));
			
			
			JLabel label8=new JLabel("<html><body><font color=red>* </font>Inidcates required</body></html>");
				label8.setBounds(470, -5, 260, 30);
				label8.setFont(new Font("Times New Roman", 5	, 14));
			panel1.add(label8);
			
			
			JLabel label9=new JLabel("<html><body>Email Address <font color=red>* </font></body></html>");
				label9.setBounds(10, 10, 160, 30);
				label9.setFont(new Font("Times New Roman", 5, 18));
			panel1.add(label9);
			
			
			MaskFormatter mask = null;
	        try {
	            mask = new MaskFormatter("?????????#####@gmail.com");
	            mask.setPlaceholderCharacter('*');
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        JFormattedTextField fTxtCaja3 = new JFormattedTextField(mask);
		        //fTxtCaja3.setHorizontalAlignment(JTextField.RIGHT);// ¿Es realmente necesario?
				//fTxtCaja3.setForeground(Color.RED); //LO QUITE POR QUE ME PONIA TODO EN ROJO
		        fTxtCaja3.setBounds(10, 35, 590, 35);
		        fTxtCaja3.setFont(new Font("Times New Roman", 5, 18));
				fTxtCaja3.setBackground(new Color(240, 240, 240));
	        panel1.add(fTxtCaja3);
			
	        
			JLabel label10=new JLabel("First Name");
				label10.setBounds(10, 75, 160, 30);
				label10.setFont(new Font("Times New Roman", 5, 18));
			panel1.add(label10);
			
			
			JTextField txtCaja4=new JTextField();
				txtCaja4.setBounds(10, 100, 590, 35);
				txtCaja4.setFont(new Font("Times New Roman", 5, 18));
				txtCaja4.setBackground(new Color(240, 240, 240));
			panel1.add(txtCaja4);
			
			
			JLabel label11=new JLabel("Last Name");
				label11.setBounds(10, 140, 160, 30);
				label11.setFont(new Font("Times New Roman", 5, 18));
			panel1.add(label11);
			
			
			JTextField txtCaja5=new JTextField();
				txtCaja5.setBounds(10, 165, 590, 35);
				txtCaja5.setFont(new Font("Times New Roman", 5, 18));
				txtCaja5.setBackground(new Color(240, 240, 240));
			panel1.add(txtCaja5);
			
			
			ImageIcon imagen=new ImageIcon("./src/images.jpeg");
			ImageIcon imagenRed=new ImageIcon(imagen.getImage().getScaledInstance(160, 60, Image.SCALE_REPLICATE));
			JButton btn1=new JButton(imagenRed);
				btn1.setBounds(10, 205, 130, 40);
			panel1.add(btn1);
		
			
		add(panel1);
		
		
		JLabel label12 = new JLabel("Copy/past Onto your site");
			label12.setBounds(380, 320, 300, 30);
			label12.setFont(new Font("Arial", 5	, 24));
		add(label12);
		
		
		JTextArea txtCaja7=new JTextArea();
			txtCaja7.setText("<html>\n\n<head>\n<title>El primer documento HTML</title>\n</head>"
					+ "\n\n<body>\n<p>El lenguaje HTML es <strong>tan sencillo</strong> que"
					+ "prácticamente se entiende sin estudiar el significadode sus etiquetas"
					+ "principales.</p>\n</body>\n\n</html>");
			txtCaja7.setFont(new Font("Times New Roman", 5, 16));
			txtCaja7.setBackground(new Color(230, 230, 230));
			txtCaja7.setEditable(false);
			txtCaja7.setLineWrap(true);
			txtCaja7.setWrapStyleWord(true);
		JScrollPane scrollPane1 = new JScrollPane(txtCaja7);
			scrollPane1.setBounds(380, 360, 610, 210);
			scrollPane1.setBorder(BorderFactory.createTitledBorder(""));
		add(scrollPane1);
	}
}

public class Prueba {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
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