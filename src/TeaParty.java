
public class TeaParty {
	private String name;
	private Boolean isWoman;
	private Boolean isKnighted;
public String welcome(String name, boolean isWoman, boolean isKnighted){
		this.name = name;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
		if(isKnighted == true && isWoman == false) {
			System.out.println("Hello Sir " + name);
			return "Hello Sir " + name;
		}
		else if(isKnighted == false && isWoman == false) {
			System.out.println("Hello Mr. " + name);
			return "Hello Mr. " + name;
		}
		else if(isKnighted == true && isWoman == true) {
			System.out.println("Hello Lady " + name);
			return "Hello Lady " + name;
		}
		else {
			System.out.println("Hello Ms. " + name);
			return "Hello Ms. " + name;
		}
		
	}
}
