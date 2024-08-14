package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short goles, byte dorsal) {
		super(nombre,edad,"Portero");
		golesRecibidos=goles;
		this.dorsal=dorsal;
	}
	
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+
				", y juega de "+getPosicion()+" con el dorsal "+dorsal+ ". Le han marcado "
				+golesRecibidos;
	}

	public int compareTo(Object o) {
		Portero p=(Portero) o;
		if (this.golesRecibidos>p.golesRecibidos) {
		      
		      return this.golesRecibidos-p.golesRecibidos;
		    }else if (this.golesRecibidos<p.golesRecibidos) {
		      return p.golesRecibidos-this.golesRecibidos;
		    }else {
		      return 0;
	}
	}


	
	
}
