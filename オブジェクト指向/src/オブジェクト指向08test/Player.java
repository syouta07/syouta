package オブジェクト指向08test;

public class Player {			//勇者アカウント
						//**//戦う{素手、剣、槍、銃}
						//**//防御{素手、盾}
						//**//回復{眠る、魔法}
						//**//アイテム{回復薬、薬、解毒薬}
	String name;
	int hp;  int mp;
	int st;  int damage;
	int hit; int Level;
	int EXP; int speed;
			//**////**////**////**////**////**////**////**////**//
			//**//    	    								//**//
			//**//		ノーマル攻撃判定クリーンヒット2%	//**//
			//**//											//**//
			//**////**////**////**////**////**////**////**////**//
	public int damage(String a,int b) {
		int no = new java.util.Random().nextInt(7);
		int no2= new java.util.Random().nextInt(7);
		b -= this.damage;
		Time.TLDA80(this.name+"は"+a+"に"+this.damage+"を与えた\n\n",a+"の残りHPは"+b+"\n\n");
		return b;
	}
	public int damage(String a,int b, String c,int d) {
		Time.TLDA80("どちらに攻撃しますか？\n\n1:"+a+"2:"+b);
		int  choose =new java.util.Scanner(System.in).nextInt()-1;
		if(choose==0) {
			b -=this.damage;
			Time.TLDA80(this.name+"は"+a+"に"+this.damage+"を与えた\n\n",a+"の残りHPは"+b+"です\n\n");
			return b;
		}else {
			d-=this.damage;
			Time.TLDA80(this.name+"は"+c+"に"+this.damage+"を与えた\n\n",c+"の残りHPは"+d+"です\n\n");
		}return d;
	}
	public int damage(String a,int b, String c,int d,String e,int f) {
		Time.TLDA80("どちらに攻撃しますか？\n\n1:"+a+"2:"+b);
		int  choose =new java.util.Scanner(System.in).nextInt()-1;
		if(choose==0) {
			b -=this.damage;
			Time.TLDA80(this.name+"は"+a+"に"+this.damage+"を与えた\n\n",a+"の残りHPは"+b+"です\n\n");
			return d;
		}else if(choose==1){
			d-=this.damage;
			Time.TLDA80(this.name+"は"+c+"に"+this.damage+"を与えた\n\n",c+"の残りHPは"+d+"です\n\n");
			return d;
		}else {
			f-=this.damage;
			Time.TLDA80(this.name+"は"+e+"に"+this.damage+"を与えた\n\n",e+"の残りHPは"+f+"です\n\n");
			return f;
		}
	}
	public int damage(String a,int b, String c,int d,String e,int f,String g,int h) {
		Time.TLDA80("どちらに攻撃しますか？\n\n1:"+a+"2:"+b);
		int  choose =new java.util.Scanner(System.in).nextInt()-1;
		if(choose==0) {
			b -=this.damage;
			Time.TLDA80(this.name+"は"+a+"に"+this.damage+"を与えた\n\n",a+"の残りHPは"+b+"です\n\n");
			return d;
		}else if(choose==1){
			d-=this.damage;
			Time.TLDA80(this.name+"は"+c+"に"+this.damage+"を与えた\n\n",c+"の残りHPは"+d+"です\n\n");
			return d;
		}else if(choose==2){
			f-=this.damage;
			Time.TLDA80(this.name+"は"+e+"に"+this.damage+"を与えた\n\n",e+"の残りHPは"+f+"です\n\n");
			return f;
		}else {
			h-=this.damage;
			Time.TLDA80(this.name+"は"+g+"に"+this.damage+"を与えた\n\n",g+"の残りHPは"+h+"です\n\n");
			return h;
		}
	}
	public int sleep(String a,int b) {
		b += this.hp * (2/3);
		Time.TLDA80(this.name+"は眠った。HPが"+b+"になった");
		return b;
	}
		//**////**////**////**////**////**////**////**////**//
		//**//    	    								//**//
		//**//		       逃げる場合確率16%			//**//
		//**//											//**//
		//**////**////**////**////**////**////**////**////**//
	
	public void run() {
		int probability1 = new java.util.Random().nextInt();
		int probability2 = new java.util.Random().nextInt();
		if(probability1==probability2) {
			Time.TLDA80(this.name+"は逃げ切れた！");
		}else {
		Time.TLDA80("逃げ切れなかった");///***///バトルに引き戻される場合
		}
	}
}
