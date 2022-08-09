//Opponents - non playable

public class NPC {
	String name;
	String id = "NPC";
	String desc;
	int hp;
	int accuracy;
	int inRoom;
	public void look() {
		
		System.out.println(name);
		
		System.out.println("Accuracy: " + accuracy);
		System.out.println("HP " + hp);
	}
	

}
