/**
 * 
 */
package died.lab01.problema03;

import died.lab01.problema02.Temperatura;

/**
 * @author juanwigg
 *
 */
public class Registro {
	private String ciudad;
	private Temperatura[] historico;
	private int cantTemperaturas;
	public static int MAX_TEMPERATURAS = 50;
	
	public Registro() {
		super();
		this.ciudad = "-";
		this.cantTemperaturas = 0;
		
	}
	
	public Registro(String ciudad) {
		super();
		this.ciudad = ciudad;
		this.cantTemperaturas = 0;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN: " + this.ciudad);
		for(int i=0; i<this.cantTemperaturas; i++) {
			System.out.println(i+1 + " - " + historico[i].toString());
		}
	}
	
	public void agregar(Temperatura t){
		if(historico == null)
			historico = new Temperatura[MAX_TEMPERATURAS];
		if(this.cantTemperaturas  < MAX_TEMPERATURAS) {
		this.historico[cantTemperaturas ] = t;
		cantTemperaturas ++;
		}
		else
		System.out.println("Error, registro lleno");
	}
	
	public Double mediaAsCelcius() {
		Double promedio = 0.0;
		for(int i=0; i<cantTemperaturas; i++) {
			promedio += historico[i].asCelcius();
		}
		
		return promedio/this.cantTemperaturas;	
	}
	
	public Double mediaAsFahrenheit() {
		Double promedio = 0.0;
		for(int i=0; i<cantTemperaturas; i++) {
			promedio += historico[i].asFahrenheit();
		}
		
		return promedio/this.cantTemperaturas;	
	}
	
	public Temperatura maximo() {
		return maxTemp(this.historico, 1, this.historico[0]);
	}
	
	private Temperatura maxTemp(Temperatura []temps, int indice, Temperatura max) {
		if(indice != cantTemperaturas) {
			if(temps[indice].asCelcius() > max.asCelcius()) {
				max = maxTemp(temps, indice+1, temps[indice]);
			}
			else {
				max = maxTemp(temps, indice+1, max);
			}
		}
		
		return max;
	}
}
