// PC - Player Character class

public class PC {
	String name;
	int hp;
	int accuracy;
	int inRoom = 0;
	
	public void look() {
		System.out.println("HP: " + hp);
		System.out.println("Accuracy: " + accuracy);
	}
	
}
