package controladores;

import java.util.ArrayList;
import java.util.List;

import entidades.Usuario;
import servicios.ImplementacionLectura;
import servicios.InterfazLectura;

public class Principal {

	public static void main(String[] args) {
         List <Usuario> Usuarios = new ArrayList <Usuario>();
         InterfazLectura interfaz = new ImplementacionLectura();
         interfaz.LecturaFichero("C:\\Users\\Isidro Camacho\\Desktop\\ficheros\\clasePersona.txt", Usuarios);
         interfaz.MostrarUsurios(Usuarios);

	}

}
