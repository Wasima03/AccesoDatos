package pruebas;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class PruebaXstream {
	public static void main(String[] args) {
		Libro elQuijote = new Libro("El Quijote", "Miguel de Cervantes","Nisu",233,1605);
		Libro elProblemaDeLosTresCuerpos = new Libro("El Problema De Los Tres Cuerpos", "Cixin Liu","Nova",354,2021);
		
		XStream xstream1 = new XStream(new DomDriver());
		xstream1.addPermission(AnyTypePermission.ANY);
		
		List<Libro> mislibros = new ArrayList<Libro>();
		mislibros.add(elProblemaDeLosTresCuerpos);
		mislibros.add(elQuijote);
		
		String xml = xstream1.toXML(elProblemaDeLosTresCuerpos);
		
		Libro libro = (Libro) xstream1.fromXML(xml);
		System.out.println(libro);
		
		mislibros =(List<Libro>) xstream1.fromXML(xml);
		System.out.println(mislibros.toString().replaceAll("][","\n"));
	
	
	
	}
	

}
