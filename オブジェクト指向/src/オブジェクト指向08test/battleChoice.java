package オブジェクト指向08test;

public class battleChoice {

	public void choice() {														//攻撃選択
		System.out.println("敵が現れた‼ 0:戦う 1:防御する 2:回復する 3:逃げる");//	行動の選択
		int ac = new java.util.Scanner(System.in).nextInt();
		String [] action = {"戦う","防御する","回復する","逃げる"};

		String [] attack = {"パンチ","キック","切りかかる"};//戦いになった
		int punch = new java.util.Random().nextInt(4)+2;	//攻撃のヒットポイント
		int kick = new java.util.Random().nextInt(4)+4;
		int sword = new java.util.Random().nextInt(4)+6;
		int [] damagepoint= {punch,kick,sword};


									//戦う選択をした

		switch(ac) {
		case 0:
			int at = new java.util.Scanner(System.in).nextInt();
			if(at == 0) {
				this.st-=1;
				System.out.println(this.name+"は"+attack[at]+"した"+damagepoint[at]+"ダメージを与えたスタミナは残り"+st);
			}else if (at==1) {
				this.st-=2;
				System.out.println(this.name+"は"+attack[at]+"した"+damagepoint[at]+"ダメージを与えたスタミナは残り"+st);
			}else {
				this.st-=3;
				System.out.println(this.name+"は"+attack[at]+"った"+damagepoint[at]+"ダメージを与えたスタミナは残り"+st);
			}
			break;
									//防御を選んだ
		case 1:
			System.out.println("防御を選択しました");
			System.out.println("防御 0:ガード 1:エアシールド 2:絶対防御");
			String [] se = {"ガード"+"エアシールド"+"絶対防御"};
			int defense = new java.util.Scanner(System.in).nextInt();
			switch(defense) {
			case 0:
				System.out.println("ガードをした。");

				break;
			}
		case 2:						//回復
			sit();
			break;
		case 3:						//逃げる
			run();
			break;
		}
	}
	public void sleep() {
		this.hp = this.hpMax;
		System.out.println(this.name+"のHPが"+this.hpMax+"に回復した。");
	}
	public void run() {
		st-=1;
		System.out.println("勇者は逃げ出した。stが-1され"+st+"となった。");
	}
	public  void sit(){
		System.out.println(this.name+"は回復を行った。");
		recoverHp();
		recoverMp();
		recoverSt();
	}
	public void recoverHp() {								//sitでHP回復
		int hpUp = new java.util.Random().nextInt(5)+2;
		int recov = Math.min(this.hpMax-this.hp, hpUp);
		this.hp += recov;
		System.out.println("HPを"+hpUp+"回復した");
	}

	public void recoverMp() {								//sitでMP回復
		int mpUp = new java.util.Random().nextInt(3)+2;
		int recov = Math.min(this.hpMax-this.hp, mpUp);
		this.mp += recov;
		System.out.println("MPを"+mpUp+"回復した");
	}

	public void recoverSt() {								//sitでST回復
		int stUp = new java.util.Random().nextInt(6)+4;
		int recov = Math.min(this.hpMax-this.hp, stUp);
		this.st += recov;
		System.out.println("STを"+stUp+"回復した");
	}

}
