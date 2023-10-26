package TresEnRaya.TresEnRaya;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class TableroPartida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1_2;
	private JButton btnNewButton_1_1_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_1_3;
	private JButton btnNewButton_1_1_2;
	
	private JButton btnNewButton_4;
	
	private Tablero tablero = new Tablero();
	private String currentPlayer="";

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroPartida frame = new TableroPartida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TableroPartida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("");
		btnNewButton.setBounds(31, 39, 128, 125);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(btn0Push);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(31, 167, 128, 125);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(btn1Push);
		
		btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBounds(31, 296, 128, 125);
		contentPane.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(btn1_1Push);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(163, 39, 128, 125);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(btn_2Push);
		
		btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setBounds(163, 167, 128, 125);
		contentPane.add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(btn_1_2Push);
		
		btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setBounds(163, 296, 128, 125);
		contentPane.add(btnNewButton_1_1_1);
		btnNewButton_1_1_1.addActionListener(btn_1_1_1Push);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(296, 39, 128, 125);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(btn_3Push);
		
		btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setBounds(296, 167, 128, 125);
		contentPane.add(btnNewButton_1_3);
		btnNewButton_1_3.addActionListener(btn_1_3Push);
		
		btnNewButton_1_1_2 = new JButton("");
		btnNewButton_1_1_2.setBounds(296, 296, 128, 125);
		contentPane.add(btnNewButton_1_1_2);
		btnNewButton_1_1_2.addActionListener(btn_1_1_2Push);
		
		btnNewButton_4 = new JButton("Nueva Partida");
		btnNewButton_4.addActionListener(btn_4Push);
	
		btnNewButton_4.setBounds(530, 11, 169, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Turno de jugador 1");
		lblNewLabel.setBounds(468, 60, 199, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jugador 1");
		lblNewLabel_1.setBounds(468, 117, 151, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(530, 142, 166, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setBounds(468, 142, 151, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Humano");
		rdbtnNewRadioButton.setBounds(468, 181, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnCpu = new JRadioButton("CPU");
		rdbtnCpu.setBounds(590, 181, 109, 23);
		contentPane.add(rdbtnCpu);
		
		JLabel lblNewLabel_1_2 = new JLabel("Jugador 2");
		lblNewLabel_1_2.setBounds(465, 283, 151, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1_1.setBounds(465, 308, 151, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(527, 308, 166, 20);
		contentPane.add(textField_1);
		
		JRadioButton rdbtnCpu_1 = new JRadioButton("CPU");
		rdbtnCpu_1.setBounds(587, 347, 109, 23);
		contentPane.add(rdbtnCpu_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Humano");
		rdbtnNewRadioButton_1.setBounds(465, 347, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	}
	
	ActionListener btn0Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tablero.comprobarCasilla(0,0)) {
				tablero.insertarMovimiento(0,0,"X");
				btnNewButton.setText("X");
			}
		}
	};
	
	ActionListener btn1Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tablero.comprobarCasilla(0,1)) {
				tablero.insertarMovimiento(0,1, "X");
				btnNewButton_1.setText("X");
			}
		}
	};
	
	ActionListener btn1_1Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tablero.comprobarCasilla(0,2)) {
				tablero.insertarMovimiento(0,2, "X");
				btnNewButton_1_1.setText("X");
			}
		}
	};
	
	ActionListener btn_2Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tablero.comprobarCasilla(1,0)) {
				tablero.insertarMovimiento(1,0, "X");
				btnNewButton_2.setText("X");
			}
		}
	};
	
	ActionListener btn_1_2Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tablero.comprobarCasilla(1,1)) {
				tablero.insertarMovimiento(1,1, "X");
				btnNewButton_1_2.setText("X");
			}
		}
	};
	
	ActionListener btn_1_1_1Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tablero.comprobarCasilla(1,2)) {
				tablero.insertarMovimiento(1,2, "X");
				btnNewButton_1_1_1.setText("X");

			}
		}
	};
	
	ActionListener btn_3Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tablero.comprobarCasilla(2,0)) {
				tablero.insertarMovimiento(2,0, "X");
				btnNewButton_3.setText("X");

			}
		}
	};
	
	ActionListener btn_1_3Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tablero.comprobarCasilla(2,1)) {
				tablero.insertarMovimiento(2,1, "X");
				btnNewButton_1_3.setText("X");

			}
		}
	};
	
	ActionListener btn_1_1_2Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tablero.comprobarCasilla(2,2)) {
				tablero.insertarMovimiento(2,2, "X");
				btnNewButton_1_1_2.setText("X");
			}
		}
	};
	
	ActionListener btn_4Push = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			tablero.reiniciarTablero();
			btnNewButton.setText("");
			btnNewButton_1.setText("");
			btnNewButton_1_1.setText("");
			btnNewButton_2.setText("");
			btnNewButton_1_2.setText("");
			btnNewButton_1_1_1.setText("");
			btnNewButton_3.setText("");
			btnNewButton_1_3.setText("");
			btnNewButton_1_1_2.setText("");
		}
	};
}
