import java.util.Scanner;

/**
* Meu primeiro programa Java
*  
* 
*
*
*/


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Olá! Tudo bem?");
		
		Scanner in = new Scanner (System.in);
		
		String nome = in.nextLine();
		
		System.out.println(nome);
		in.close();
	}
	

}
