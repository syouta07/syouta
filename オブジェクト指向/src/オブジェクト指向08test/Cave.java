package オブジェクト指向08test;

public class Cave {

						//ギルドから洞窟に来た

	public static void fastAction() {
		action();
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			System.out.println("何もないようだ");
			fastAction();
		}else if(a==1){
			System.out.println("何もないようだ");
			fastAction();
		}else if(a==2) {
			System.out.println("何もないようだ");
			fastAction();
		}else if (a==3) {
			System.out.println("ギルドに戻ります");
			Guild.comeBackGreetin();
		}
	}

					//ギルド以外から洞窟に来た時


	public static void selectGuild() throws InterruptedException {
		action();
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			System.out.println("何もないようだ");
			fastAction();
		}else if(a==1){
			System.out.println("何もないようだ");
			fastAction();
		}else if(a==2) {
			System.out.println("何もないようだ");
			fastAction();
		}else if (a==3) {
			AllAction.moveToAnother();
		}
	}
	public static void action() {
		System.out.println("洞窟についた");
		System.out.println("さて何をしようか");
		System.out.println("1:うろうろする 2:薬草を探す 3:モンスターを探す 4:戻る");

	}

	}
