package vetores;

public class Carro {

	private String marca;
	private String modelo;
	private long ano;
	private long maxVelo;
	
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, long ano, long maxVelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.maxVelo = maxVelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public long getAno() {
		return ano;
	}
	
	public void setAno(long ano) {
		this.ano = ano;
	}

	public long getMaxVelo() {
		return maxVelo;
	}

	public void setMaxVelo(long maxVelo) {
		this.maxVelo = maxVelo;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", maxVelo=" + maxVelo + "]";
	}
	
	
	
}
