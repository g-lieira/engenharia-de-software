package src.main.br.edu.zoo.model;

public abstract class person {

	private String nome;
	private String cpf;
	private String dataNascimento;
	private String sexo;

	private address Address;

//----------------------- Metodos Construtores-----------------------
	//Polimorfismo por Sobrecarga
	public person () {
		nome = "";
		cpf = "";
		dataNascimento = "";
		sexo = "";
		Address = new address();
	}

	//Polimorfismo por Sobrecarga
	public person (String nome, String cpf, String dataNascimento, String sexo, address Address) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.Address = Address;
	}
	
	
//----------------------- Getters -----------------------
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public address getAddress(){
		return Address;
	}

////----------------------- Setters -----------------------
	
	public final void setNome(String nome){
		this.nome = nome;
	}
	
	public final void setCpf(String cpf){
		this.cpf = cpf;
	}

	public final void setDataNascimento(String dataNascimento){
		this.dataNascimento = dataNascimento;
	}

	public final void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public final void setEndereco(address Address){
		this.Address = Address;
	}

}
