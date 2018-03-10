package View;
import java.awt.event.ActionListener;
import javax.swing.*;
import Domain.Natural;

public class NaturalView extends JFrame{
	
	private JTextField firstNumber=new JTextField(10);
	private JTextField secondNumber=new JTextField(10);
	private JButton addButton=new JButton("+");
	private JButton subButton=new JButton("-");
	private JButton multButton=new JButton("*");
	private JButton divButton=new JButton("/");
	private JButton powButton=new JButton("^");
	private JButton radButton=new JButton("√");
	private JButton modButton=new JButton("%");
	private JButton primButton=new JButton("prim");
	private JTextField Solution= new JTextField(10);
	private JLabel egal=new JLabel("=");
	private JLabel primul=new JLabel("Primul numar:");
	private JLabel aldoilea=new JLabel("Al doilea numar:");
	
	public NaturalView(){
		JPanel Fereastra=new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,400);
		
		Fereastra.add(primul);
		Fereastra.add(firstNumber);
		Fereastra.add(aldoilea);
		Fereastra.add(secondNumber);
		Fereastra.add(egal);
		Fereastra.add(Solution);
		Fereastra.add(addButton);
		Fereastra.add(subButton);
		Fereastra.add(multButton);
		Fereastra.add(divButton);
		Fereastra.add(powButton);
		Fereastra.add(radButton);
		Fereastra.add(modButton);
		Fereastra.add(primButton);
		
		this.add(Fereastra);
	}
	
	
	public Natural getfirstNumber() {
		Natural nr=new Natural(firstNumber.getText());
		return nr;
	}
	
	public Natural getsecondNumber() {
		Natural nr=new Natural(secondNumber.getText());
		return nr;
	}
	
	public Natural getSolution() {
		Natural nr=new Natural(Solution.getText());
		return nr;
	}
	
	public void setSolution(Natural nr) {
		String s="";
		for(int i=nr.getLung()-1;i>=0;i--) {
			s=s+Integer.toString(nr.getCifpoz(i));
		}
		Solution.setText(s);
	}
	
	public void addListener(ActionListener listenForaddButton) {
		addButton.addActionListener(listenForaddButton);
	}
	
	public void subListener(ActionListener listenForsubButton) {
		subButton.addActionListener(listenForsubButton);
	}
	
	public void multListener(ActionListener listenFormultButton) {
		multButton.addActionListener(listenFormultButton);
	}
	
	public void divListener(ActionListener listenFordivButton) {
		divButton.addActionListener(listenFordivButton);
	}
	
	public void powListener(ActionListener listenForpowButton) {
		powButton.addActionListener(listenForpowButton);
	}
	
	public void radListener(ActionListener listenForradButton) {
		radButton.addActionListener(listenForradButton);
	}
	
	public void modListener(ActionListener listenFormodButton) {
		modButton.addActionListener(listenFormodButton);
	}
	
	public void primListener(ActionListener listenForprimButton) {
		primButton.addActionListener(listenForprimButton);
	}
	
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
