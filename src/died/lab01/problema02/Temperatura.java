/**
 * 
 */
package died.lab01.problema02;

/**
 * @author juanwigg
 *
 */
public class Temperatura {
	private Double grados;
	private Escala escala;
	
	public Temperatura() {
		grados = 0.0;
		escala = Escala.CELCIUS;
	}
	
	public Temperatura(Double temperatura, Escala escala) {
		this.grados = temperatura;
		this.escala = escala;
	}
	
	
	public String toString() {
		String esc;
		if(this.escala == Escala.CELCIUS)
			esc = "C°";
		else
			esc = "F°";
		
		return this.grados + esc;
	}
	
	public Escala getEscala() {
		return this.escala;
	}
	
	public Double asCelcius() {
		if(this.escala == Escala.CELCIUS)
			return this.grados;
		else
			return ((this.grados - 32) * 5/9);
	}
	
	public Double asFahrenheit() {
		if(this.escala == Escala.FAHRENHEIT)
			return this.grados;
		else
			return (this.grados * 9/5)+32;
	}
	
	public void aumentar(Temperatura temperatura) {
		if(this.escala == Escala.CELCIUS) {
			if(temperatura.asCelcius() > 0) {
				this.grados += temperatura.asCelcius();
			}
		}
		else {
			if(temperatura.asFahrenheit() > 0) {
				this.grados += temperatura.asFahrenheit();
			}
			
		}
	} 
	
	public void disminuir(Temperatura temperatura) {
		if(this.escala == Escala.CELCIUS) {
			if(temperatura.asCelcius() > 0) {
				this.grados -= temperatura.asCelcius();
			}
		}
		else {
			if(temperatura.asFahrenheit() > 0) {
				this.grados -= temperatura.asFahrenheit();
			}
			
		}
	}
}
