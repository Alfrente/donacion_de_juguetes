package tienda_de_juguetes;

public class JugueteLogo extends Juguete{
	public final static int NUMERO_FICHAS = 0;
	private int numero_ficha;
	
	public JugueteLogo() {
		super();
	}

	public JugueteLogo(int numero_ficha) {
		super();
		this.numero_ficha = numero_ficha;
	}
	
	public JugueteLogo(int numero_ficha, String paisOrigen, double precioBase, String marca) {
		super();
		this.numero_ficha = numero_ficha;

	}
	
	public double calcularPrecio() {
		
		return 5.5;
	}

}
