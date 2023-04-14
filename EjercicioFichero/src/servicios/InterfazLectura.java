package servicios;

import java.util.List;

import entidades.Usuario;

public interface InterfazLectura {
	
	public void LecturaFichero(String ruta,List <Usuario> lista);
	
	public void MostrarUsurios(List <Usuario> lista);

}
