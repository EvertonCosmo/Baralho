//package com.cosmo.everton.baralho;

public class EmbDistribuindo {

	public static void main(String[] args) {
		Baralho baralinho = new Baralho();
		baralinho.embaralha();
		
		for(int i = 1; i<= 52;i++) {
			System.out.printf("%-19s",baralinho.distribui());
		
		if(i % 4 == 0) {
			System.out.println();
		}
	}
	}

}
