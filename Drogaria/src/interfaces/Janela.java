package interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

import remedios.Remedio;

public class Janela extends JFrame {
	
	public PainelMenu menu;
	public PainelAdicionar adicionar;
	public PainelPesquisar pesquisar;
	public PainelRemover remover;
	public static Janela instance;
	
	public List<Remedio> listaRemedios = new ArrayList<>();
	
	//Constructor
	public Janela() {
		super("Drogaria");
		this.setSize(815, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.criarJanela();
	}
	
	public void criarJanela() {
		menu = new PainelMenu();
		menu.setBounds(0, 0, 800, 100);
		menu.setVisible(true);
		this.getContentPane().add(menu);
		
		adicionar = new PainelAdicionar();
		adicionar.setBounds(0, 100, 800, 500);
		adicionar.setVisible(true);
		this.getContentPane().add(adicionar);
		
		pesquisar = new PainelPesquisar();
		pesquisar.setBounds(0, 100, 800, 500);
		pesquisar.setVisible(false);
		this.getContentPane().add(pesquisar);
		
		remover = new PainelRemover();
		remover.setBounds(0, 100, 800, 500);
		remover.setVisible(false);
		this.getContentPane().add(remover);
		
		repaint();
		revalidate();
	}
	
	//Only one Window on Monitor
	public static Janela getInstance() {
		if (instance == null) {
			instance = new Janela();
			return instance;
		} else {
			return instance;
		}
	}
	
}
