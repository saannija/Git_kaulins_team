import java.util.Random;
import java.util.Scanner;

class Cirks {
	static void mestKaulinu(int reizes){
		int skaitlis;
		Random rand = new Random();
		for(int i = 1; i <= reizes; i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
	}
	public static void main(String[] args) {
		int reizes = 0, izvele;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("1-Mest kaulinu\n2-Apturet");
			izvele=scan.nextInt();
			switch(izvele){
			case 1:
		do{
		System.out.println("Cik reizes mest kaulinu?");
		reizes = scan.nextInt();
		}while(reizes < 1);
		break;
			case 2:
				System.out.println("Programma aptureta!");
		break;
		}
		}while(izvele!=2);
		mestKaulinu(reizes);
		scan.close();
	}
}
