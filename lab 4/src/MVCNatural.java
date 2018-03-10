import Controller.NaturalCtrl;
import Model.NaturalModel;
import View.NaturalView;
public class MVCNatural {

	public static void main(String [] args) {
		NaturalView theView=new NaturalView();
		NaturalModel theModel=new NaturalModel();
		NaturalCtrl theCtrl=new NaturalCtrl(theView,theModel);
		
		theView.setVisible(true);
	}
}
