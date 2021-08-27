package tienda_de_juguetes;

public class Juguete {
	public static final String MARCA = "";
	public static final String PAIS_ORIGEN = "";
	public static final double PRECIO_BASE = 0;
	private String marca;
	private String paisOrigen;
	private double precioBase;
	
	public Juguete() {
		super();
	}

	public Juguete(String marca) {
		super();
		this.marca = marca;
	}

	public Juguete(String marca, String paisOrigen, double precioBase) {
		super();
		this.marca = marca;
		this.paisOrigen = paisOrigen;
		this.precioBase = precioBase;
	}
	
	public double calcularPrecio() {
		
		return 5.5;
	}
	
	

}
