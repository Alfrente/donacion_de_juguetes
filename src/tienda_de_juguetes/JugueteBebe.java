package tienda_de_juguetes;

public class JugueteBebe extends Juguete {
	public final String MATERIAL = "";
	public String material;
	private double precioJugueteBebe = 0;
	
	public JugueteBebe() {
		
	}

	public JugueteBebe(String material) {
		//Juguete jsd= new Juguete(material);
		//this.material = material;
	}
	
	public JugueteBebe(String marca, String paisOrigen, double precioBase, String  material) {
		Juguete jsd= new Juguete(marca, paisOrigen, precioBase);
		//this.material = material;
		this.precioJugueteBebe=+precioBase;
	}
	
	public double calcularPrecio() {
		
		return precioJugueteBebe;
	}

}
