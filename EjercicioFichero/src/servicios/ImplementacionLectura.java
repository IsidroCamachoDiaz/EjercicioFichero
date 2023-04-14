package servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import entidades.Usuario;

public class ImplementacionLectura implements InterfazLectura {

	@Override
	public void LecturaFichero(String ruta, List<Usuario> lista) {
		File fichero = null;
	     FileReader fr = null;
	     BufferedReader br = null;
	     try {
	    	 fichero = new File (ruta);
	         fr = new FileReader (fichero);
	         br = new BufferedReader(fr);
	         String linea;
	         int contador=0;
	         while((linea=br.readLine())!=null) {
	            String [] partes;
	            partes=linea.split(";");
	            if(contador!=0) {
	            Usuario u = new Usuario(partes[0],partes[1],Integer.parseInt(partes[2]));
	            lista.add(u);
	            }
	            contador++;
	         }
	      }		
	      catch(Exception e1){
			  System.out.print("[ERROR]: \n" +e1); 
	      }finally{ 
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (IOException ioe2){ 
	        	 System.out.print("[ERROR]: NO PUDO CERRAR EL FICHERO: " +"\n" + ioe2);
	         }
	      }

	}

	@Override
	public void MostrarUsurios(List<Usuario> lista) {
		for(int e=0;e<lista.size();e++) {
			System.out.println(lista.get(e).toString());
		}

	}

}
