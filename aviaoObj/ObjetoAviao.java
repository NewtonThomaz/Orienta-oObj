package aviaoObj;

public class ObjetoAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		Aviao aviao4 = new Aviao();
		
		aviao1.setCompanhia("Gol");
		aviao1.setModelo("Boeing 737");
		aviao1.setCapacidadea(189);
		aviao1.setValor(527000000);
		//Método
		aviao1.setVoar("Voando");
		aviao1.setTremDePouso("não");
		aviao1.setViraDireita("sim");
		aviao1.setViraDireita("não");
		
		aviao2.setCompanhia("Latam");
		aviao2.setModelo("Airbus A320");
		aviao2.setCapacidadea(165);
		aviao2.setValor(100000000);
		//Método
		aviao2.setVoar("Não Voando");
		aviao2.setTremDePouso("sim");
		aviao2.setViraDireita("não");
		aviao2.setViraDireita("não");
		
		aviao3.setCompanhia("Azul");
		aviao3.setModelo("Boeing 737-b");
		aviao3.setCapacidadea(178);
		aviao3.setValor(518000000);
		//Método
		aviao3.setVoar("Voando");
		aviao3.setTremDePouso("não");
		aviao3.setViraDireita("não");
		aviao3.setViraDireita("sim");
		
		aviao4.setCompanhia("Passaredo");
		aviao4.setModelo("Airbus A320");
		aviao4.setCapacidadea(165);
		aviao4.setValor(100000000);
		//Método
		aviao4.setVoar("Não Voando");
		aviao4.setTremDePouso("sim");
		aviao4.setViraDireita("não");
		aviao4.setViraDireita("não");
		
		System.out.println("------- OBJETO 1 -------");
		System.out.println(aviao1.getCompanhia());
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getCapacidade());
		System.out.println(aviao1.getValor());
		//Método
		System.out.println(aviao1.getVoar());
		System.out.println(aviao1.getTremDePouso());
		System.out.println(aviao1.getViraDireita());
		System.out.println(aviao1.getViraEsquerda());
		
		System.out.println("------- OBJETO 2 -------");
		System.out.println(aviao2.getCompanhia());
		System.out.println(aviao2.getModelo());
		System.out.println(aviao2.getCapacidade());
		System.out.println(aviao2.getValor());
		//Método
		System.out.println(aviao2.getVoar());
		System.out.println(aviao2.getTremDePouso());
		System.out.println(aviao2.getViraDireita());
		System.out.println(aviao2.getViraEsquerda());
		
		System.out.println("------- OBJETO 3 -------");
		System.out.println(aviao3.getCompanhia());
		System.out.println(aviao3.getModelo());
		System.out.println(aviao3.getCapacidade());
		System.out.println(aviao3.getValor());
		//Método
		System.out.println(aviao3.getVoar());
		System.out.println(aviao3.getTremDePouso());
		System.out.println(aviao3.getViraDireita());
		System.out.println(aviao3.getViraEsquerda());
		
		System.out.println("------- OBJETO 4 -------");
		System.out.println(aviao4.getCompanhia());
		System.out.println(aviao4.getModelo());
		System.out.println(aviao4.getCapacidade());
		System.out.println(aviao4.getValor());
		//Método
		System.out.println(aviao4.getVoar());
		System.out.println(aviao4.getTremDePouso());
		System.out.println(aviao4.getViraDireita());
		System.out.println(aviao4.getViraEsquerda());
	}
}