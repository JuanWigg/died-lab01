/**
 * 
 */
package died.lab01.problema01;

/**
 * @author juanwigg
 *
 */
public class Recta {
	private float pendiente;
	private float ordenada;
	
	public Recta(Punto p1, Punto p2) {
		super();
		this.pendiente = (p1.getY() - p2.getY())/(p1.getX()-p2.getX());
		this.ordenada =(this.pendiente*p2.getX()) + p2.getY();
		
	}
	
	public Recta() {
		super();
	}
	
	public float getPendiente() {
		return this.pendiente;
	}
	
	public float getOrdenada() {
		return this.ordenada;
	}
	
	
	public boolean paralelas(Recta otraRecta) {
		if(otraRecta.getPendiente() == this.pendiente)
			return true;
		else
			return false;	
	}
	
	public boolean equals(Recta otraRecta) {
		if(otraRecta.getOrdenada() == this.ordenada && otraRecta.getPendiente() == this.pendiente)
			return true;
		else
			return false;
	}
	
}
