package orientacaoObj;

public class ObjetoPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.setNome("Newton Thomaz");
		pessoa1.setidade(17);
		pessoa1.setEndereco("Logo ali");
		pessoa1.setProfissao("nulo");
		
		pessoa1.setNome("Flavia Thomaz");
		pessoa1.setidade(9);
		pessoa1.setEndereco("Ali");
		pessoa1.setProfissao("nulo");
		
		System.out.println("------- OBJETO 1 -------");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		
		System.out.println("------- OBJETO 2 -------");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
	}
}