package PacoteJava;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int n1, n2, n3 ;
		
		System.out.print("Digite um numero inteiro");
		n1=leia.nextInt();
		
		System.out.print("Digite o segundo número inteiro");
		n2=leia.nextInt();
		
		System.out.print("Digite o terceiro número inteiro");
		n3=leia.nextInt();
		
		if (n1>=n2 && n1>=n3)
		{
			System.out.println("O maior numero é:" +n1);
		}
		
		else if (n2>=n1 && n2<=n3)
		{
			System.out.println("O maior numero é:" +n2);
		}
		
		else
		{
			System.out.println("O maior numero é:" +n3);
		}

	}

}
