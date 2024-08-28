package carrosObj;

public class ObjetoCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		
		carro1.setNome("Lancer");
		carro1.setMarca("Mitsubishi");
		carro1.setValor(62980);
		carro1.setCor("Amarelo");
		//Método
		carro1.setAcelerar("70 km/h");
		carro1.setFarol("Alto");
		carro1.setViraDireita("sim");
		carro1.setViraEsquerda("não");
		
		carro2.setNome("Camaro");
		carro2.setMarca("Chevrolet");
		carro2.setValor(507850);
		carro2.setCor("Vermelho");
		//Método
		carro2.setAcelerar("100 km/h");
		carro2.setFarol("Baixo");
		carro2.setViraDireita("não");
		carro2.setViraEsquerda("sim");
		
		carro3.setNome("Lancer");
		carro3.setMarca("Mitsubishi");
		carro3.setValor(64230);
		carro3.setCor("Verde");
		//Método
		carro3.setAcelerar("51 km/h");
		carro3.setFarol("Alto");
		carro3.setViraDireita("não");
		carro3.setViraEsquerda("sim");
		
		carro4.setNome("Camaro");
		carro4.setMarca("Chevrolet");
		carro4.setValor(512980);
		carro4.setCor("Roxo");
		//Método
		carro4.setAcelerar("120 km/h");
		carro4.setFarol("Baixo");
		carro4.setViraDireita("não");
		carro4.setViraEsquerda("sim");
		
		System.out.println("------- OBJETO 1 -------");
		System.out.println(carro1.getNome());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getValor());
		System.out.println(carro1.getCor());
		//Método
		System.out.println(carro1.getAcelerar());
		System.out.println(carro1.getFarol());
		System.out.println(carro1.getViraDireita());
		System.out.println(carro1.getViraEsquerda());
		
		System.out.println("------- OBJETO 2 -------");
		System.out.println(carro2.getNome());
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getValor());
		System.out.println(carro2.getCor());
		//Método
		System.out.println(carro2.getAcelerar());
		System.out.println(carro2.getFarol());
		System.out.println(carro2.getViraDireita());
		System.out.println(carro2.getViraEsquerda());
		
		System.out.println("------- OBJETO 3 -------");
		System.out.println(carro3.getNome());
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getValor());
		System.out.println(carro3.getCor());
		//Método
		System.out.println(carro3.getAcelerar());
		System.out.println(carro3.getFarol());
		System.out.println(carro3.getViraDireita());
		System.out.println(carro3.getViraEsquerda());
		
		System.out.println("------- OBJETO 4 -------");
		System.out.println(carro4.getNome());
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getValor());
		System.out.println(carro4.getCor());
		//Método
		System.out.println(carro4.getAcelerar());
		System.out.println(carro4.getFarol());
		System.out.println(carro4.getViraDireita());
		System.out.println(carro4.getViraEsquerda());
	}
}