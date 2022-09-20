package ExercicioCaneta;

public class Caneta {
	
	//atributos
	public String marca;
	public float ponta;
	public boolean tampada;
	public String cor;
	
	//construtor
	
	public Caneta() {
		this.marca = "Faber Castell";
		this.cor = "Preta";
		this.rabiscar();
	}
	
	//métodos
	public void rabiscar() {
		
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public String setMarca(String marca){
		return this.marca = marca;
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public float setPonta(float ponta) {
		return this.ponta = ponta;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void status() {
		System.out.println("*****INFORMAÇÕES DA CANETA*****");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Sou da cor: " + this.cor);
		System.out.println("Minha ponta é: " + this.ponta);
		System.out.println("Tampada: " + this.tampada);
		if(this.tampada == false) {
			System.out.println("Estou destampada. Posso rabiscar!");
		} else {
			System.out.println("Estou tampada. Não posso rabiscar!");

		}
	}
}