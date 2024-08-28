package diagramaObj;

public class DiagramaPessoaObj {

	public static void main(String[] args) {
		DiagramaPessoa diagramaPessoa01 = new DiagramaPessoa();
		DiagramaPessoa diagramaPessoa02 = new DiagramaPessoa();
		DiagramaPessoa diagramaPessoa03 = new DiagramaPessoa();
		DiagramaPessoa diagramaPessoa04 = new DiagramaPessoa();
		
		diagramaPessoa01.setNome("Newton Thomaz");
		diagramaPessoa01.setRG("testeDoRG01");
		diagramaPessoa01.setCPF(12345678910l);
		diagramaPessoa01.setTelefone(123456789);
		diagramaPessoa01.setId(01);
		//Método
		diagramaPessoa01.setDormir("Não");
		diagramaPessoa01.setCorrer("Nâo");
		diagramaPessoa01.setComer("Não");
		diagramaPessoa01.setBeber("Não");
		
		diagramaPessoa02.setNome("Daniel Antunes");
		diagramaPessoa02.setRG("testeDoRG02");
		diagramaPessoa02.setCPF(12345678910l);
		diagramaPessoa02.setTelefone(123456789);
		diagramaPessoa02.setId(02);
		//Método
		diagramaPessoa02.setDormir("Sim");
		diagramaPessoa02.setCorrer("Nâo");
		diagramaPessoa02.setComer("Não");
		diagramaPessoa02.setBeber("Não");
		
		diagramaPessoa03.setNome("Pedro Sonoda");
		diagramaPessoa03.setRG("testeDoRG03");
		diagramaPessoa03.setCPF(12345678910l);
		diagramaPessoa03.setTelefone(123456789);
		diagramaPessoa03.setId(03);
		//Método
		diagramaPessoa03.setDormir("Não");
		diagramaPessoa03.setCorrer("Sim");
		diagramaPessoa03.setComer("Não");
		diagramaPessoa03.setBeber("Não");
		
		diagramaPessoa04.setNome("Kaique Souza");
		diagramaPessoa04.setRG("testeDoRG04");
		diagramaPessoa04.setCPF(12345678910l);
		diagramaPessoa04.setTelefone(123456789);
		diagramaPessoa04.setId(04);
		//Método
		diagramaPessoa04.setDormir("Sim");
		diagramaPessoa04.setCorrer("Nâo");
		diagramaPessoa04.setComer("Não");
		diagramaPessoa04.setBeber("Não");
		
		System.out.println("------- OBJETO 1 -------");
		System.out.println(diagramaPessoa01.getNome());
		System.out.println(diagramaPessoa01.getRG());
		System.out.println(diagramaPessoa01.getCPF());
		System.out.println(diagramaPessoa01.getTelefone());
		System.out.println(diagramaPessoa01.getId());
		//Método
		System.out.println(diagramaPessoa01.getDormir());
		System.out.println(diagramaPessoa01.getCorrer());
		System.out.println(diagramaPessoa01.getComer());
		System.out.println(diagramaPessoa01.getBeber());
		
		System.out.println("------- OBJETO 2 -------");
		System.out.println(diagramaPessoa02.getNome());
		System.out.println(diagramaPessoa02.getRG());
		System.out.println(diagramaPessoa02.getCPF());
		System.out.println(diagramaPessoa02.getTelefone());
		System.out.println(diagramaPessoa02.getId());
		//Método
		System.out.println(diagramaPessoa02.getDormir());
		System.out.println(diagramaPessoa02.getCorrer());
		System.out.println(diagramaPessoa02.getComer());
		System.out.println(diagramaPessoa02.getBeber());
		
		System.out.println("------- OBJETO 3 -------");
		System.out.println(diagramaPessoa03.getNome());
		System.out.println(diagramaPessoa03.getRG());
		System.out.println(diagramaPessoa03.getCPF());
		System.out.println(diagramaPessoa03.getTelefone());
		System.out.println(diagramaPessoa03.getId());
		//Método
		System.out.println(diagramaPessoa03.getDormir());
		System.out.println(diagramaPessoa03.getCorrer());
		System.out.println(diagramaPessoa03.getComer());
		System.out.println(diagramaPessoa03.getBeber());
		
		System.out.println("------- OBJETO 2 -------");
		System.out.println(diagramaPessoa04.getNome());
		System.out.println(diagramaPessoa04.getRG());
		System.out.println(diagramaPessoa04.getCPF());
		System.out.println(diagramaPessoa04.getTelefone());
		System.out.println(diagramaPessoa04.getId());
		//Método
		System.out.println(diagramaPessoa04.getDormir());
		System.out.println(diagramaPessoa04.getCorrer());
		System.out.println(diagramaPessoa04.getComer());
		System.out.println(diagramaPessoa04.getBeber());
	}
}