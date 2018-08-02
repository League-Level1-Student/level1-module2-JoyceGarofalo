import javax.swing.JOptionPane;

public class Vault {
	private int code;
	public Vault(int c) {
		code = c;
		
	}
	public boolean tryCode(int g) {
		if (g == code) {
			return true;
			
		}
		else {
		return false;
		}
		
	}
	public static void main(String[] args) {
		Vault vault = new Vault(54768);
		//vault.tryCode(125);
		James james = new James();
		System.out.println(james.findCode(vault));
	}
	
}
class James{
	public int findCode(Vault code) {
		for (int i = 0; i < 1000001; i++) {	
			if(code.tryCode(i)) {
				return i;
			}

		}
		return -1;
	}
	
	
}
	