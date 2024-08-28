package pooAula01;

public class ObjetoPessoa {

	public static void main(String[] args) {
		Pessoa02 pessoa1 = new Pessoa02();
		Pessoa02 pessoa2 = new Pessoa02();

		pessoa1.setNome("Newton Thomaz");
		pessoa1.setRG("testeDoRG01");
		pessoa1.setCPF(12345678910l);
		pessoa1.setidade(17);
		pessoa1.setEndereco("Logo ali");
		pessoa1.setProfissao("nulo");

		pessoa2.setNome("Flavia Thomaz");
		pessoa2.setRG("testeDoRG02");
		pessoa2.setCPF(12345678910l);
		pessoa2.setidade(9);
		pessoa2.setEndereco("Ali");
		pessoa2.setProfissao("nulo");

		System.out.println("------- OBJETO 1 -------");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getRG());
		System.out.println(pessoa1.getCPF());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());

		System.out.println("------- OBJETO 2 -------");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getRG());
		System.out.println(pessoa2.getCPF());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
	}
}