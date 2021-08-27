package tienda_de_juguetes;

public class Factura {
	
	public double totalJuguetes;
	public double totalJuguetesBebe;
	public double totalJuguetesLogo;
	public Juguete lista[];
	private int index = 0;
	
	public Factura(Juguete ju) {
		lista[index++] = ju;
	}

	public void mostrarTotales() {
		
	}

}
