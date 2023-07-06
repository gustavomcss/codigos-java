package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import pessoas.Pessoa;

public class PainelRemover extends JPanel implements ActionListener, ListSelectionListener {

	JLabel lblNome;
	JTextField txfNome;
	JButton btnRemover;
	JButton btnPesquisar;
	JScrollPane scrollPane;
	
	JTable tabela;
	DefaultTableModel modelo;
	
	public PainelRemover() {
		super();
		this.setLayout(null);
		this.setBackground(new Color(151, 253, 13));
		
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
		
		btnPesquisar = new JButton();
		btnPesquisar.setText("Pesquisar");
		btnPesquisar.setFont(new Font("Courier", Font.BOLD, 17));
		btnPesquisar.setBounds(200, 150, 180, 40);
		btnPesquisar.setVisible(true);
		add(btnPesquisar);
		btnPesquisar.addActionListener(this);
		
		btnRemover = new JButton();
		btnRemover.setText("Remover");
		btnRemover.setFont(new Font("Courier", Font.BOLD, 17));
		btnRemover.setBounds(200, 320, 180, 40);
		btnRemover.setVisible(true);
		add(btnRemover);
		btnRemover.addActionListener(this);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		
		tabela = new JTable(modelo);
		scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(20, 200, 500, 100);
		add(scrollPane);
		
		repaint();
		revalidate();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(btnPesquisar)) {
			
			modelo.setRowCount(0);
			for (Pessoa pessoa : Janela.getInstance().listaPessoas) {
				if (pessoa.getNome().toLowerCase().contains(txfNome.getText().toLowerCase())) {
					modelo.addRow(new Object[] {pessoa.getNome()});
				}
			}
		}
		
		if (arg0.getSource().equals(btnRemover)) {
			int linhaSelecionada = tabela.getSelectedRow();
			String valor = (String) tabela.getValueAt(linhaSelecionada, 0);
			
			modelo.setRowCount(0);
			for (int i = 0; i < Janela.getInstance().listaPessoas.size(); i++) {
				if (valor.equals(Janela.getInstance().listaPessoas.get(i).getNome())) {
					Janela.getInstance().listaPessoas.remove(i);
				}
			}
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
