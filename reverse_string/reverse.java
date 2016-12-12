import java.util.Scanner;

class Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Variablen
		String eingabe, zwischen = "";
		int i = 0;

		System.out.print("Bitte geben Sie einen String ein ::> ");
		eingabe = sc.nextLine();
		

		while(i < eingabe.length()){
			zwischen = zwischen + eingabe.charAt(eingabe.length() - i -1);
			i++;
		}

		System.out.println(zwischen);

	}
}