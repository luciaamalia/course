package application;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * tratamento de exceções
 */

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		String[] vect = sc.nextLine().split("");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		} 
		catch(ArrayIndexOutOfBoundsException e) { //acessar o array fora do limite 
			System.out.println("Invalid position");
		}
		catch(InputMismatchException e ) { //digita um valor invalido
			System.out.println("error");
		}
		sc.close();
		

	}

}
