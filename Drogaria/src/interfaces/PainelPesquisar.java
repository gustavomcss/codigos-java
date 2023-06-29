package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import remedios.Remedio;

public class PainelPesquisar extends JPanel implements ActionListener, KeyListener {
	
	JLabel lblNome;
	JLabel lblMiligrama;
	JTextField txfNome;
	JTextField txfMiligrama;
	JButton btnPesquisar;
	JButton btnLimpar;
	JScrollPane scrollPane;
	
	JTable tabela;
	DefaultTableModel modelo;

	public PainelPesquisar() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(112, 169, 234));
		
		lblNome = new JLabel();
		lblNome.setText("Remédio: ");
		lblNome.setFont(new Font("Courier", Font.BOLD, 17));
		lblNome.setBounds(240, 60, 200, 20);
		lblNome.setVisible(true);
		add(lblNome);
		
		txfNome = new JTextField();
		txfNome.setFont(new Font("Courier", Font.BOLD, 17));
		txfNome.setBounds(350, 60, 200, 20);
		txfNome.setVisible(true);
		add(txfNome);
		
		lblMiligrama = new JLabel();
		lblMiligrama.setText("Miligrama: ");
		lblMiligrama.setFont(new Font("Courier", Font.BOLD, 17));
		lblMiligrama.setBounds(240, 110, 200, 20);
		lblMiligrama.setVisible(true);
		add(lblMiligrama);
		
		txfMiligrama = new JTextField();
		txfMiligrama.setFont(new Font("Courier", Font.BOLD, 17));
		txfMiligrama.setBounds(350, 110, 200, 20);
		txfMiligrama.setVisible(true);
		add(txfMiligrama);
		txfMiligrama.addKeyListener(this);
		
		btnPesquisar = new JButton();
		btnPesquisar.setText("Pesquisar");
		btnPesquisar.setFont(new Font("Courier", Font.BOLD, 17));
		btnPesquisar.setBounds(210, 170, 180, 40);
		btnPesquisar.setBackground(Color.lightGray);
		btnPesquisar.setVisible(true);
		add(btnPesquisar);
		btnPesquisar.addActionListener(this);
		
		btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setFont(new Font("Courier", Font.BOLD, 17));
		btnLimpar.setBounds(410, 170, 180, 40);
		btnLimpar.setBackground(Color.lightGray);
		btnLimpar.setVisible(true);
		add(btnLimpar);
		btnLimpar.addActionListener(this);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Miligrama");
		
		tabela = new JTable(modelo);
		scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(150, 230, 500, 100);
		add(scrollPane);
		
		repaint();
		revalidate();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(btnPesquisar)) {
			modelo.setRowCount(0);
			
			for (Remedio remedio : Janela.getInstance().listaRemedios) {
				if (remedio.getNome().toLowerCase().contains(txfNome.getText().toLowerCase())) {
					if (Integer.toString(remedio.getMiligrama()).contains(txfMiligrama.getText())) {
						modelo.addRow(new Object[] {remedio.getNome(), remedio.getMiligrama()});
					}
				}
			}
		}
		
		if (arg0.getSource().equals(btnLimpar)) {
			txfNome.setText(null);
			txfMiligrama.setText(null);
			
			modelo.setRowCount(0);			
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		if (arg0.getSource().equals(txfMiligrama)) {
			if (!Character.isDigit(arg0.getKeyChar())) {
				arg0.consume();
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
