package Practica.herencia;

public class AparatoElectrico {
	
	private boolean ocupaEnergia = true;
	private String tipoDeFuente;
	private float potencia;
	private String materialCables;
	private String fabricante;
	
	public AparatoElectrico() {
		super();
	}

	public AparatoElectrico(boolean ocupaEnergia, String tipoDeFuente, float potencia, String materialCables,
			String fabricante) {
		super();
		this.ocupaEnergia = ocupaEnergia;
		this.tipoDeFuente = tipoDeFuente;
		this.potencia = potencia;
		this.materialCables = materialCables;
		this.fabricante = fabricante;
	}

	public boolean isOcupaEnergia() {
		return ocupaEnergia;
	}

	public void setOcupaEnergia(boolean ocupaEnergia) {
		this.ocupaEnergia = ocupaEnergia;
	}

	public String getTipoDeFuente() {
		return tipoDeFuente;
	}

	public void setTipoDeFuente(String tipoDeFuente) {
		this.tipoDeFuente = tipoDeFuente;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public String getMaterialCables() {
		return materialCables;
	}

	public void setMaterialCables(String materialCables) {
		this.materialCables = materialCables;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "AparatoElectrico [ocupaEnergia=" + ocupaEnergia + ", tipoDeFuente=" + tipoDeFuente + ", potencia="
				+ potencia + ", materialCables=" + materialCables + ", fabricante=" + fabricante + "]";
	}
	
}
