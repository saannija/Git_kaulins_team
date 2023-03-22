import java.util.Random;
import java.util.Scanner;

class Cirks {
	static int mestKaulinu(int reizes){
		int skaitlis = 0;
		Random rand = new Random();
		for(int i = 1; i <= reizes; i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
		return skaitlis;
	}
	public static void main(String[] args) {
		int reizes = 0, izvele, pedejais = 0;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("1-Mest kaulinu\n2-Apskatit pedejo\n3-Apturet");
			izvele=scan.nextInt();
		switch(izvele){
			case 1:
				do{
					System.out.println("Cik reizes mest kaulinu?");
					reizes = scan.nextInt();
				}while(reizes < 1);
				pedejais = mestKaulinu(reizes);
			break;
			case 2:
				System.out.println("Pedejais uzmestais ir "+pedejais);
			case 3:
				System.out.println("Programma aptureta!");
			break;
		}
		}while(izvele!=3);
		scan.close();
	}
}
