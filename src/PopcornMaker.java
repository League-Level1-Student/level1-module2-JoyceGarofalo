import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String f = JOptionPane.showInputDialog("what popcorn flavor?");
	Popcorn popcorn = new Popcorn(f);
	Microwave microwave = new Microwave();
	String c = JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn?");
	int time = Integer.parseInt(c);
	microwave.setTime(time);
	
}
}
