package tienda_de_juguetes;

public class JugueteLogo extends Juguete {
	public final static int NUMERO_FICHAS = 0;
	private int numero_ficha;
	private double precioJugueteLogo = 0;

	public JugueteLogo() {
	}

	public JugueteLogo(int numero_ficha) {
		//this.numero_ficha = numero_ficha;
	}

	public JugueteLogo(String paisOrigen, double precioBase, String marca, int numero_ficha) {
		//this.numero_ficha = numero_ficha;
		Juguete jsd= new Juguete(marca, paisOrigen, precioBase);
		this.precioJugueteLogo = precioBase;
	}

	public double calcularPrecio() {

		return precioJugueteLogo;
	}

}
