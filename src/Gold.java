
public class Gold extends Avion implements otrosServicios{
	private boolean wifi;

	public Gold(double capacidadCombustible, int capacidadPasajeros,
			double velocidadMaxima, double costoPorKm, int tarifaFija,
			Propulsion tipoPropulsion, boolean wifi) {
		super(capacidadCombustible, capacidadPasajeros, velocidadMaxima,
				costoPorKm, tarifaFija, tipoPropulsion);
		this.wifi = wifi;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	@Override
	public String toString() {
		return "Gold [wifi=" + wifi + "]";
	}
	
	
	
}
