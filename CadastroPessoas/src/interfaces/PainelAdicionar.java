package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pessoas.Pessoa;

public class PainelAdicionar extends JPanel implements ActionListener {
	JLabel lblNome;
	JTextField txfNome;
	JButton btnCadastrar;

	public PainelAdicionar() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(11, 227, 94));
		
		lblNome = new JLabel();
		lblNome.setText("Nome da Pessoa: ");
		lblNome.setFont(new Font("Courier", Font.BOLD, 17));
		lblNome.setBounds(30, 100, 200, 20);
		lblNome.setVisible(true);
		add(lblNome);
		
		txfNome = new JTextField();
		txfNome.setFont(new Font("Courier", Font.BOLD, 17));
		txfNome.setBounds(200, 100, 200, 20);
		txfNome.setVisible(true);
		add(txfNome);
		
		btnCadastrar = new JButton();
		btnCadastrar.setText("Cadastrar");
		btnCadastrar.setFont(new Font("Courier", Font.BOLD, 17));
		btnCadastrar.setBounds(200, 150, 180, 40);
		btnCadastrar.setVisible(true);
		add(btnCadastrar);
		btnCadastrar.addActionListener(this);
		
		repaint();
		revalidate();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(btnCadastrar)) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(txfNome.getText());
			
			Janela.getInstance().listaPessoas.add(pessoa);
			//JOptionPane.showMessageDialog(this, "Cadastrado com Sucesso!");
			
			txfNome.setText(null);
			
			/* for (Pessoa i : Janela.getInstance().listaPessoas) {
				System.out.println("Nome: " + i.getNome());
			}
			
			System.out.println("\n\n\n"); */
		}
	}
}
