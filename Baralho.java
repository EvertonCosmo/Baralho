//package com.cosmo.everton.baralho;

import java.security.SecureRandom;

public class Baralho {
	private Carta[] baralho;
	private int proxima_carta; // indice (0-51);
	private static final int NUMBER_OF_CARDS = 52;
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public Baralho() {
		String[] faces = {
				"As","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Dama","Rei"
			};
		String[] naipes = {	"Copas","Ouro","Paus","Espadas"};
		
		baralho = new Carta[NUMBER_OF_CARDS];
		proxima_carta = 0; // indice 0
		for(int i= 0; i<baralho.length;i++) {
			baralho[i] = new Carta(faces[i%13], naipes[i/13]);
		}
	}
	
	public void embaralha() { // Fisher-Yates Procurar para implementá-lo
		proxima_carta = 0;
		for(int i = 0; i < baralho.length;i++) {
			int c = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			// troca simples de atual com o gerado random 
			// Comparando atual com o gerado
			Carta t = baralho[i];
			baralho[i] = baralho[c];
			baralho[c] = t;
		}
	}
	
	public Carta distribui() {
		// se ainda tiver cartas
		if(proxima_carta < baralho.length) {
			return baralho[proxima_carta++]; // retorna o que está lá 
		}else {
			return null; // sem cartas
		}
	}
}
