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
import javax.swing.JTextField;

import remedios.Remedio;

public class PainelAdicionar extends JPanel implements ActionListener, KeyListener {
	JLabel lblNome;
	JLabel lblMiligrama;
	JTextField txfNome;
	JTextField txfMiligrama;
	JButton btnCadastrar;

	public PainelAdicionar() {
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
		
		btnCadastrar = new JButton();
		btnCadastrar.setText("Cadastrar");
		btnCadastrar.setFont(new Font("Courier", Font.BOLD, 17));
		btnCadastrar.setBounds(310, 170, 180, 40);
		btnCadastrar.setBackground(Color.lightGray);
		btnCadastrar.setVisible(true);
		add(btnCadastrar);
		btnCadastrar.addActionListener(this);
		
		repaint();
		revalidate();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(btnCadastrar)) {
	        for (Remedio remedio : Janela.getInstance().listaRemedios) {
	            if (remedio.getNome().equals(txfNome.getText()) && Integer.toString(remedio.getMiligrama()).equals(txfMiligrama.getText())) {
	                JOptionPane.showMessageDialog(null, "CADASTRO INTERROMPIDO. \n\n  A lista já possui o remédio.");
	                
	                txfNome.setText(null);
	    			txfMiligrama.setText(null);
	    			
	                return;
	            }
	        }
	        
			Remedio remedio = new Remedio();
			remedio.setNome(txfNome.getText());
			remedio.setMiligrama(Integer.parseInt(txfMiligrama.getText()));
			
			Janela.getInstance().listaRemedios.add(remedio);
			
			txfNome.setText(null);
			txfMiligrama.setText(null);
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
