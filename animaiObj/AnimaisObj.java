package animaiObj;

public class AnimaisObj {

	public static void main(String[] args) {
		Animais animal01 = new Animais();
		Animais animal02 = new Animais();
		Animais animal03 = new Animais();
		Animais animal04 = new Animais();
		
		animal01.setNome("Nutella");
		animal01.setRaca("Vira-lata");
		animal01.setSexo("Fêmea");
		animal01.setIdade(7);
		//Método
		animal01.setSons("Latir");
		animal01.setDormir("11 horas por dia");
		animal01.setCorrer("18 km/h");
		animal01.setCaminhar("4 km/h");
		
		animal02.setNome("Thor");
		animal02.setRaca("Pastor-alemão");
		animal02.setSexo("Macho");
		animal02.setIdade(4);
		//Método
		animal02.setSons("Latir");
		animal02.setDormir("14 horas por dia");
		animal02.setCorrer("24 km/h");
		animal02.setCaminhar("6 km/h");
		
		animal03.setNome("Samanta");
		animal03.setRaca("Buldogue francês");
		animal03.setSexo("Fêmea");
		animal03.setIdade(3);
		//Método
		animal03.setSons("Latir");
		animal03.setDormir("16 horas por dia");
		animal03.setCorrer("12 km/h");
		animal03.setCaminhar("2 km/h");
		
		animal04.setNome("Rex");
		animal04.setRaca("Husky siberiano");
		animal04.setSexo("Macho");
		animal04.setIdade(2);
		//Método
		animal04.setSons("Latir");
		animal04.setDormir("13 horas por dia");
		animal04.setCorrer("25 km/h");
		animal04.setCaminhar("7 km/h");
		
		System.out.println("------- OBJETO 1 -------");
		System.out.println(animal01.getNome());
		System.out.println(animal01.getRaca());
		System.out.println(animal01.getSexo());
		System.out.println(animal01.getIdade());
		//Método
		System.out.println(animal01.getSons());
		System.out.println(animal01.getDormir());
		System.out.println(animal01.getCorrer());
		System.out.println(animal01.getCaminhar());
		
		System.out.println("------- OBJETO 2 -------");
		System.out.println(animal02.getNome());
		System.out.println(animal02.getRaca());
		System.out.println(animal02.getSexo());
		System.out.println(animal02.getIdade());
		//Método
		System.out.println(animal02.getSons());
		System.out.println(animal02.getDormir());
		System.out.println(animal02.getCorrer());
		System.out.println(animal02.getCaminhar());
		
		System.out.println("------- OBJETO 3 -------");
		System.out.println(animal03.getNome());
		System.out.println(animal03.getRaca());
		System.out.println(animal03.getSexo());
		System.out.println(animal03.getIdade());
		//Método
		System.out.println(animal03.getSons());
		System.out.println(animal03.getDormir());
		System.out.println(animal03.getCorrer());
		System.out.println(animal03.getCaminhar());
		
		System.out.println("------- OBJETO 4 -------");
		System.out.println(animal04.getNome());
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