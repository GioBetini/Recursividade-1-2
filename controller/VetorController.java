package controller;

public class VetorController {

	public VetorController() {
		super();
	}
	public int menor (int[] vetor , int size) {
		if (size==0) { //Condição de parada quando o tamanho do vetor for 0 (primeira posição)
			return vetor[size];
		}
		int min = menor(vetor, size-1);
			
		if(min<vetor[size]) {
			return min;
			}
			return vetor[size];
		}
		
	}


