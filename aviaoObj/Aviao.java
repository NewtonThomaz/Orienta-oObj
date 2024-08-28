package aviaoObj;

public class Aviao {
	String companhia,modelo,voar,viraDireita,viraEsquerda,tremDePouso;
	int valor, capacidade;
	
	public String getCompanhia() {
		return companhia;
	}public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}public String getModelo() {
		return modelo;
	}public void setModelo(String modelo) {
		this.modelo = modelo;
	}public int getCapacidade() {
		return capacidade;
	}public void setCapacidadea(int capacidade) {
		this.capacidade = capacidade;
	}public int getValor() {
		return valor;
	}public void setValor(int valor) {
		this.valor = valor;
	}
	//Métodos
	public String getVoar() {
		return voar;
	}public void setVoar(String voar) {
		this.voar = voar;
	}public String getViraDireita() {
		return viraDireita;
	}public void setViraDireita(String viraDireita) {
		this.viraDireita = viraDireita;
	}public String getViraEsquerda() {
		return viraEsquerda;
	}public void setViraEsquerda(String viraEsquerda) {
		this.viraEsquerda = viraEsquerda;
	}public String getTremDePouso() {
		return tremDePouso;
	}public void setTremDePouso(String tremDePouso) {
		this.tremDePouso = tremDePouso;
	}
}