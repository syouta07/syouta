package オブジェクト指向08test;

public class Matango {
	public void appearance(){
		String name;
		int hp = 20;
		int mp = 10;
		int at;
	}
	public void action(){
		String [] action = {"様子をうかがっている","急に襲ってきた","逃げようとしている","眠っている"};
		int mata= new java.util.Random().nextInt(4);
		String comment= "キノコが現れたキノコは"+action[mata];

		switch(mata) {
		case 0:
			System.out.println(comment);

		}
		System.out.println("相手は");
	}
	public void attack1(){
		int at=new java.util.Random().nextInt(6);
		System.out.println();
	}
}
