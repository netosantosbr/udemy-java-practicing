package secaoDez;

import java.util.Scanner;

public class ExercicioSobreVetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1º Exercício
		
//		System.out.print("Quantos números você vai digitar?! ");
//		int qtdVezes = sc.nextInt();
//		
//		
//		int[] numerosInteiros = new int[qtdVezes];
//		for(int i = 0; i < qtdVezes; i++) {
//			System.out.print("Digite um número: ");
//			numerosInteiros[i] = sc.nextInt();
//		}
//		
//		System.out.println("");
//		System.out.println("Números negativos:");
//		for(int n : numerosInteiros) { 
//			if(n < 0) {
//				System.out.println(n);
//			}
//		}
		
		System.out.print("Quantos números você vai digitar?! ");
		int qtdVezes = sc.nextInt();
		double[] numerosReais = new double[qtdVezes];
		for(int i = 0; i < qtdVezes; i++) {
			System.out.print("Digite um número: ");
			numerosReais[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		System.out.print("VALORES = ");
		for(Double d : numerosReais) {
			System.out.print(d + " ");
		}
		System.out.println();
		for(Double d : numerosReais) {
			soma += d;
		}
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + soma/numerosReais.length);
		
	}
}
