package br.com.pedro.beloprojeto;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Ovo ovo = new Ovo(10);
		int tempoFritar = 0;
		
		
		quebrarOvo();
		ovo.quebrar();
		
		

		

		System.out.println("E quanto tempo você deseja fritar o ovo?");
		tempoFritar = s.nextInt();


		for(int i = 0; i < tempoFritar; i++ ) {
			ovo.fritar();
		}

		System.out.println(ovo.getStatus());

	}
	
	static void quebrarOvo () {
		String quebrarOvo = "";
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("digite QUEBRAR para quebrar o ovo!");
			quebrarOvo = s.next();
		}while(!quebrarOvo.equalsIgnoreCase("QUEBRAR"));
	}
	
	static void fritar() {
		
		
		//System.out.println("E quanto tempo você deseja fritar o ovo?");
		//tempoFritar = s.nextInt();


		//for(int i = 0; i < tempoFritar; i++ ) {
			//ovo.fritar();
		}

	}
	
	
	
	

