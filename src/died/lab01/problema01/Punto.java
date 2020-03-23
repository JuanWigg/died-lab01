/**
 * 
 */
package died.lab01.problema01;

/**
 * @author juanwigg
 *
 */
public class Punto {
	private float x;
	private float y;
	
	Punto(float x, float y){
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
	public boolean equals(Punto punto) {
		
		if(punto.getX() == this.x && punto.getY()==this.y)
			return true;
		else
			return false;
			
	}
	
	
	
	
	
	
}
