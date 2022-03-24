package programa_leitura;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, idade, pais;
		
		System.out.println("Digite seu nome na linha abaixo");
		nome = sc.nextLine();
		
		System.out.println("Digite sua idade na linha abaixo");
		idade = sc.nextLine();
		
		System.out.println("Digite o seu pais na linha abaixo");
		pais = sc.nextLine();
		
		System.out.println("___________");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("País: "+pais);
		System.out.println("___________");
	
	}
}
