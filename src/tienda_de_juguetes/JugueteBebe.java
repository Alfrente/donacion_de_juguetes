package tienda_de_juguetes;

public class JugueteBebe extends Juguete {
	public final String MATERIAL = "";
	public String material;
	
	public JugueteBebe() {
		super();
	}

	public JugueteBebe(String material) {
		super();
		this.material = material;
	}
	
	public JugueteBebe(String material, String paisOrigen, double precioBase, String marca) {
		super();
		this.material = material;
	}
	
	public double calcularPrecio() {
		
		return 5.5;
	}

}
