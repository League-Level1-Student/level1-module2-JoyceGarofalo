import javax.swing.JOptionPane;

public class Vault {
	private int code = 1269;
	public boolean tryCode(int code) {
		String guess = JOptionPane.showInputDialog("Guess the four digit code");
		int g = Integer.parseInt(guess);
		if (g == code) {
			return true;
		}
		else {
		return false;
		}
	}
	public static void main(String[] args) {
		Vault vault = new Vault();
		vault.tryCode(1269);
	}
public class James{
	public int findCode(int code) {
		
	}
}
	
	
}
