import javax.swing.JFrame;
import java.awt.Color;

public class CalculatorTest {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.pack(); 
		calculator.setLocationRelativeTo(null);
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setVisible(true);
		calculator.setSize(200,300);
		
	
	}

}
