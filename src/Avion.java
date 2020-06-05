
public abstract class Avion {
	enum Propulsion{
		REACCION,
		HELICE,
		PISTONES;
	}
	private double capacidadCombustible;
	private int capacidadPasajeros;
	private double velocidadMaxima;
	private double costoPorKm;
	private int tarifaFija;
	private Propulsion tipoPropulsion;
	
	public Avion(double capacidadCombustible, int capacidadPasajeros,
			double velocidadMaxima, double costoPorKm, int tarifaFija,
			Propulsion tipoPropulsion) {
		super();
		this.capacidadCombustible = capacidadCombustible;
		this.capacidadPasajeros = capacidadPasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.costoPorKm = costoPorKm;
		this.tarifaFija = tarifaFija;
		this.tipoPropulsion = tipoPropulsion;
	}

	public double getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(double capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public double getCostoPorKm() {
		return costoPorKm;
	}

	public void setCostoPorKm(double costoPorKm) {
		this.costoPorKm = costoPorKm;
	}

	public int getTarifaFija() {
		return tarifaFija;
	}

	public void setTarifaFija(int tarifaFija) {
		this.tarifaFija = tarifaFija;
	}

	public Propulsion getTipoPropulsion() {
		return tipoPropulsion;
	}

	public void setTipoPropulsion(Propulsion tipoPropulsion) {
		this.tipoPropulsion = tipoPropulsion;
	}

	@Override
	public String toString() {
		return "Avion [capacidadCombustible=" + capacidadCombustible
				+ ", capacidadPasajeros=" + capacidadPasajeros
				+ ", velocidadMaxima=" + velocidadMaxima + ", costoPorKm="
				+ costoPorKm + ", tarifaFija=" + tarifaFija
				+ ", tipoPropulsion=" + tipoPropulsion + "]";
	}
	
	
	
}
