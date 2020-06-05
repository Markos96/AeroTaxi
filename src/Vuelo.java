import java.util.Date;


public class Vuelo {
	
	enum Ruta{
		BSAS_COR("BuenosAiresaCordoba",695),
		BSAS_STGO("BuenosAiresaSantiago",1400),
		BSAS_MTV("BuenosAiresaMontevideo",950),
		COR_MTV("CordobaaMontevideo",1190),
		COR_STGO("CordobaaSantiago",1050),
		MTV_STGO("MontevideoaSantiago",2100);
		
		private String nombre;
		private int distancia;
		
		private Ruta(String nombre, int distancia) {
			this.nombre = nombre;
			this.distancia = distancia;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getDistancia() {
			return distancia;
		}

		public void setDistancia(int distancia) {
			this.distancia = distancia;
		}
		
		

			}
	
		
		private Date fecha;
		private int cantidadDePasajeros;
		private boolean reservado;
		private Ruta ruta;
		private Usuario usuario;
		private Avion avion;
		
		private Vuelo(Date fecha, int cantidadDePasajeros, boolean reservado,
				Ruta ruta, Usuario usuario, Avion avion) {
			super();
			this.fecha = fecha;
			this.cantidadDePasajeros = cantidadDePasajeros;
			this.reservado = reservado;
			this.ruta = ruta;
			this.usuario = usuario;
			this.avion = avion;
			
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public int getCantidadDePasajeros() {
			return cantidadDePasajeros;
		}

		public void setCantidadDePasajeros(int cantidadDePasajeros) {
			this.cantidadDePasajeros = cantidadDePasajeros;
		}

		public boolean isReservado() {
			return reservado;
		}

		public void setReservado(boolean reservado) {
			this.reservado = reservado;
		}

		public Ruta getRuta() {
			return ruta;
		}

		public void setRuta(Ruta ruta) {
			this.ruta = ruta;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Avion getAvion() {
			return avion;
		}

		public void setAvion(Avion avion) {
			this.avion = avion;
		}

		@Override
		public String toString() {
			return "Vuelo [fecha=" + fecha + ", cantidadDePasajeros="
					+ cantidadDePasajeros + ", reservado=" + reservado
					+ ", ruta=" + ruta + ", usuario=" + usuario + ", avion="
					+ avion + "]";
		}
		
		

	
}
