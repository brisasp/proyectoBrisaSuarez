
public class BrisaSuarezMusica {


	private String titulocancion;
	private String genero;
	private String nombreHobby;
	
	

private static void main(String[] args) {
	System.out.println("La zona ");                                                            
    int numero=1;
    
    while(numero<=1000) { 
        System.out.println("La zona"); 
        numero++;
    }
	
}
	
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

public void setNombreHobby(String nombreHobby) {
	this.nombreHobby = nombreHobby;
}

}
