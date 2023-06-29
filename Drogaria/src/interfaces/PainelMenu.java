package interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelMenu extends JPanel implements ActionListener {
	
	JButton btnAdicionar;
	JButton btnPesquisar;
	JButton btnRemover;
	
	public PainelMenu() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(41, 129, 230));
		
		btnAdicionar = new JButton();
		btnAdicionar.setText("Adicionar");
		btnAdicionar.setBounds(50, 25, 100, 50);
		btnAdicionar.setBackground(Color.lightGray);
		btnAdicionar.setVisible(true);
		add(btnAdicionar);
		btnAdicionar.addActionListener(this);
		
		btnPesquisar = new JButton();
		btnPesquisar.setText("Pesquisar");
		btnPesquisar.setBounds(350, 25, 100, 50);
		btnPesquisar.setBackground(Color.lightGray);
		btnPesquisar.setVisible(true);
		add(btnPesquisar);
		btnPesquisar.addActionListener(this);
		
		btnRemover = new JButton();
		btnRemover.setText("Remover");
		btnRemover.setBounds(650, 25, 100, 50);
		btnRemover.setBackground(Color.lightGray);
		btnRemover.setVisible(true);
		add(btnRemover);
		btnRemover.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(btnAdicionar)) {
			btnAdicionar.setBackground(Color.gray);
			btnPesquisar.setBackground(Color.lightGray);
			btnRemover.setBackground(Color.lightGray);
			Janela.getInstance().adicionar.setVisible(true);
			Janela.getInstance().pesquisar.setVisible(false);
			Janela.getInstance().remover.setVisible(false);
		}
		
		if (arg0.getSource().equals(btnPesquisar)) {
			btnAdicionar.setBackground(Color.lightGray);
			btnPesquisar.setBackground(Color.gray);
			btnRemover.setBackground(Color.lightGray);
			Janela.getInstance().adicionar.setVisible(false);
			Janela.getInstance().pesquisar.setVisible(true);
			Janela.getInstance().remover.setVisible(false);
		}
		
		if (arg0.getSource().equals(btnRemover)) {
			btnAdicionar.setBackground(Color.lightGray);
			btnPesquisar.setBackground(Color.lightGray);
			btnRemover.setBackground(Color.gray);
			Janela.getInstance().adicionar.setVisible(false);
			Janela.getInstance().pesquisar.setVisible(false);
			Janela.getInstance().remover.setVisible(true);
		}
	}
}
