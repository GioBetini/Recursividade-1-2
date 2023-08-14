package view;

import controller.VetorController;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = { 1, 6, 3, 9, 5 };
		VetorController vc = new VetorController();
		int size = vetor.length - 1;
		int tamanhoVetor = vc.menor(vetor, size);
		System.out.println("O menor valor do vetor é" + tamanhoVetor);
	}

}
