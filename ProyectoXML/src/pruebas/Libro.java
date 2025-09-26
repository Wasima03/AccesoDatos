package pruebas;

public class Libro {
	String titulo;
	String autor;
	String editorial;
	int paginas;
	int anPublicacion;
	public Libro(String titulo, String autor, String editorial, int paginas, int anPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.paginas = paginas;
		this.anPublicacion = anPublicacion;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", paginas=" + paginas
				+ ", anPublicacion=" + anPublicacion + "]";
	}
	
	

}
