package animaiObj;

public class AnimaisObj {

	public static void main(String[] args) {
		Animais animal01 = new Animais();
		Animais animal02 = new Animais();
		Animais animal03 = new Animais();
		Animais animal04 = new Animais();
		
		animal01.setRaca("Holstein-Frísia");
		animal01.setEspecie("Gado bovino");
		animal01.setSexo("Fêmea");
		animal01.setIdade(7);
		//Método
		animal01.setSons("muge");
		animal01.setDormir("4 horas por dia");
		animal01.setCorrer("40 km/h");
		animal01.setCaminhar("4 km/h");
		
		animal02.setRaca("Corriedale");
		animal02.setEspecie("Cordeiro");
		animal02.setSexo("Macho");
		animal02.setIdade(4);
		//Método
		animal02.setSons("Balido");
		animal02.setDormir("2 horas e meia por dia");
		animal02.setCorrer("9 km/h");
		animal02.setCaminhar("2 km/h");
		
		animal03.setRaca("Coelho Rex");
		animal03.setEspecie("Chia");
		animal03.setSexo("Fêmea");
		animal03.setIdade(2);
		//Método
		animal03.setSons("Chia");
		animal03.setDormir("8 horas por dia");
		animal03.setCorrer("6 km/h");
		animal03.setCaminhar("1 km/h");
		
		animal04.setRaca("Plymouth Rock");
		animal04.setEspecie("Cacareja");
		animal04.setSexo("fêmea");
		animal04.setIdade(2);
		//Método
		animal04.setSons("Cacareja");
		animal04.setDormir(" horas por dia");
		animal04.setCorrer("9 km/h");
		animal04.setCaminhar("1 km/h");
		
		System.out.println("------- OBJETO 1 -------");
		System.out.println(animal01.getRaca());
		System.out.println(animal01.getRaca());
		System.out.println(animal01.getSexo());
		System.out.println(animal01.getIdade());
		//Método
		System.out.println(animal01.getSons());
		System.out.println(animal01.getDormir());
		System.out.println(animal01.getCorrer());
		System.out.println(animal01.getCaminhar());
		
		System.out.println("------- OBJETO 2 -------");
		System.out.println(animal02.getRaca());
		System.out.println(animal02.getRaca());
		System.out.println(animal02.getSexo());
		System.out.println(animal02.getIdade());
		//Método
		System.out.println(animal02.getSons());
		System.out.println(animal02.getDormir());
		System.out.println(animal02.getCorrer());
		System.out.println(animal02.getCaminhar());
		
		System.out.println("------- OBJETO 3 -------");
		System.out.println(animal03.getRaca());
		System.out.println(animal03.getRaca());
		System.out.println(animal03.getSexo());
		System.out.println(animal03.getIdade());
		//Método
		System.out.println(animal03.getSons());
		System.out.println(animal03.getDormir());
		System.out.println(animal03.getCorrer());
		System.out.println(animal03.getCaminhar());
		
		System.out.println("------- OBJETO 4 -------");
		System.out.println(animal04.getRaca());
		System.out.println(animal04.getRaca());
		System.out.println(animal04.getSexo());
		System.out.println(animal04.getIdade());
		//Método
		System.out.println(animal04.getSons());
		System.out.println(animal04.getDormir());
		System.out.println(animal04.getCorrer());
		System.out.println(animal04.getCaminhar());
	}
}