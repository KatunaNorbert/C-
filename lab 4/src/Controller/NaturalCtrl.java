package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Domain.Natural;
import Model.NaturalModel;
import View.NaturalView;
public class NaturalCtrl {
	
	private NaturalView theView;
	private NaturalModel theModel;
	
	public NaturalCtrl(NaturalView theView,NaturalModel theModel) {
		this.theView=theView;
		this.theModel=theModel;
		
		this.theView.addListener(new NaturalListener());
		this.theView.subListener(new NaturalListener1());
		this.theView.multListener(new NaturalListener2());
		this.theView.divListener(new NaturalListener3());
		this.theView.powListener(new NaturalListener4());
		this.theView.radListener(new NaturalListener5());
		this.theView.modListener(new NaturalListener6());
		this.theView.primListener(new NaturalListener7());
	}
	
	
	class NaturalListener implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Natural firstNumber=new Natural();
			Natural secondNumber=new Natural();
			
			try {
				firstNumber.copiaza(theView.getfirstNumber());
				secondNumber.copiaza(theView.getsecondNumber());
				
				theModel.Rezultat.Aduna(firstNumber, secondNumber);
				theView.setSolution(theModel.getRezultat());
			}
			
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Introduceti 2 nr intregi");
			}
			
		}
	}
	class NaturalListener1 implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Natural firstNumber=new Natural();
			Natural secondNumber=new Natural();
			
			try {
				firstNumber.copiaza(theView.getfirstNumber());
				secondNumber.copiaza(theView.getsecondNumber());
				
				theModel.Rezultat.Scade(firstNumber, secondNumber);
				theView.setSolution(theModel.getRezultat());
			}
			
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Introduceti 2 nr intregi");
			}
			
		}
	}
	
	class NaturalListener2 implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Natural firstNumber=new Natural();
			Natural secondNumber=new Natural();
			
			try {
				firstNumber.copiaza(theView.getfirstNumber());
				secondNumber.copiaza(theView.getsecondNumber());
				
				theModel.Rezultat.Multiply(firstNumber, secondNumber);
				theView.setSolution(theModel.getRezultat());
			}
			
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Introduceti 2 nr intregi");
			}
			
		}
	}
	
	class NaturalListener3 implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Natural firstNumber=new Natural();
			Natural secondNumber=new Natural();
			
			try {
				firstNumber.copiaza(theView.getfirstNumber());
				secondNumber.copiaza(theView.getsecondNumber());
				
				theModel.Rezultat.Imparte(firstNumber, secondNumber);
				theView.setSolution(theModel.getRezultat());
			}
			
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Introduceti 2 nr intregi");
			}
			
		}
	}
	
	class NaturalListener4 implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Natural firstNumber=new Natural();
			Natural secondNumber=new Natural();
			
			try {
				firstNumber.copiaza(theView.getfirstNumber());
				secondNumber.copiaza(theView.getsecondNumber());
				
				theModel.Rezultat.Putere(firstNumber, secondNumber);
				theView.setSolution(theModel.getRezultat());
			}
			
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Introduceti 2 nr intregi");
			}
			
		}
	}
	
	class NaturalListener5 implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Natural firstNumber=new Natural();
			
			try {
				firstNumber.copiaza(theView.getfirstNumber());
				
				theModel.Rezultat.copiaza(firstNumber);
				theModel.Rezultat.Radical();
				theView.setSolution(theModel.getRezultat());
			}
			
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Introduceti 2 nr intregi");
			}
			
		}
	}
	
	class NaturalListener6 implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Natural firstNumber=new Natural();
			Natural secondNumber=new Natural();
			
			try {
				firstNumber.copiaza(theView.getfirstNumber());
				secondNumber.copiaza(theView.getsecondNumber());
				
				theModel.Rezultat.modulo(firstNumber, secondNumber);
				theView.setSolution(theModel.getRezultat());
			}
			
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Introduceti 2 nr intregi");
			}
			
		}
	}
	
	class NaturalListener7 implements ActionListener{	

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Natural firstNumber=new Natural();
			
			try {
				firstNumber.copiaza(theView.getfirstNumber());
				Natural unu=new Natural("1");
				Natural zero=new Natural();
				if(firstNumber.Prim()==true)
					theModel.Rezultat.copiaza(unu);
				else
					theModel.Rezultat.copiaza(zero);
				theView.setSolution(theModel.getRezultat());
			}
			
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Introduceti 2 nr intregi");
			}
			
		}
	}
}
