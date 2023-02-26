package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
		
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public static int getNumTV() { //
		return numTV;
	}
	
	public static void setNumTV(int numTV) {//
		TV.numTV = numTV;
	}

	public void  turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;	
	}

	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() { 
		if (estado == true){
			if(canal > 0 || canal <= 120) {
				canal ++;					
			}
		}
	}
	
	public void canalDown() {
		if (estado == true){
			if(canal > 0 || canal <= 120) {
				canal --;					
			}
		}	
	}
	
	public void volumenUp() {
		if (estado == true){
			if(volumen >= 0 || volumen <= 7) {
				volumen ++;					
			}
		}
		
	}
	
	public void volumenDown() {
		if (estado == true){
			if(volumen >= 0 || volumen <= 7) {
				volumen --;					
			}
		}
		
	}

	
	
}
