
public class BrisaSuarezMusica {


	private String titulocancion;
	private String genero;
	private String nombreHobby;
	
public BrisaSuarezMusica(String titulocancion , String genero, String nombreHobby) {
		super();
		this.setTitulocancion(titulocancion);
		this.setGenero(genero);
		this.setNombreHobby(nombreHobby);
}

public String getTitulocancion() {
	return titulocancion;
}

public void setTitulocancion(String titulocancion) {
	this.titulocancion = titulocancion;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public String getNombreHobby() {
	return nombreHobby;
}

}
