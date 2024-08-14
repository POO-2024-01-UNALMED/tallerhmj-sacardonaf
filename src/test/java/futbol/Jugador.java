package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short goles, byte dorsal) {
		super(nombre,edad,posicion);
		golesMarcados=goles;
		this.dorsal=dorsal;
	}
	
	public Jugador() {
		super();
		golesMarcados=289;
		dorsal=7;
	}
	
	public int compareTo(Futbolista f) {
	    
	    if (this.getEdad()>f.getEdad()) {
	      
	      return this.getEdad()-f.getEdad();
	    }else if (this.getEdad()<f.getEdad()) {
	      return f.getEdad()-this.getEdad();
	    }else {
	      return 0;}
	    }
	
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+ 
				", y juega de "+getPosicion()+" con el dorsal "+dorsal+ ". Ha marcado "+golesMarcados;
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	
}
