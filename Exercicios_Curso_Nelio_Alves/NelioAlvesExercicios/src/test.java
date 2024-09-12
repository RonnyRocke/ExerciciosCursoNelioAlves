import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("TESTE APERTANDO 0: ");
			int aperte = sc.nextInt();
		
		if(aperte == 0) {
			System.out.println("FUNCIONANDO...");
		}
		else {
			System.out.println("0 NÃO FOI DENIFIDO");
		}
		sc.close();
	}

}
