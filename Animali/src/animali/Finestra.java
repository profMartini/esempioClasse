package animali;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Finestra extends JFrame implements ActionListener {
	private JLabel lbl_nome;
	private JTextField txt_nome;
	private JLabel lbl_numeroUova;
	private JTextField txt_numeroUova;
	private JLabel lbl_numeroCuccioli;
	private JTextField txt_numeroCuccioli;
	private JButton btn_seleziona;
	private JLabel lbl_risultato;
	
	private void initComponent() {
		lbl_nome=new JLabel("Nome: ");
		txt_nome=new JTextField(15);
		lbl_numeroUova=new JLabel("Numero uova: ");
		txt_numeroUova=new JTextField(15);
		lbl_numeroCuccioli=new JLabel("Numero cuccioli: ");
		txt_numeroCuccioli=new JTextField(15);
		
		this.setLayout(new FlowLayout());
		this.add(lbl_nome);
		this.add(txt_nome);
		this.add(lbl_numeroUova);
		this.add(txt_numeroUova);
		this.add(lbl_numeroCuccioli);
		this.add(txt_numeroCuccioli);
		
		btn_seleziona=new JButton("Schiacciami!");
		btn_seleziona.addActionListener(this);
		this.add(btn_seleziona);
		
		lbl_risultato=new JLabel("Il risultato saarà qui!");
		this.add(lbl_risultato);
		
	}
	
	public Finestra() {
		initComponent();
		setSize(800,600);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn_seleziona)) {
			if(txt_numeroCuccioli.getText().equals("")) {
				lbl_risultato.setText("Fa le uova");
			}else {
				lbl_risultato.setText("Non fa le uova");
			}
		}
			
	}
	
}
