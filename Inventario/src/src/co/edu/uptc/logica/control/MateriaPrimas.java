package src.co.edu.uptc.logica.control;

import java.util.ArrayList;
import java.util.Iterator;

import src.co.edu.uptc.logica.modelo.Caracteristica;
import src.co.edu.uptc.persistencia.CaracteristicasDatos;

public class MateriaPrimas {
private ArrayList<Caracteristica> ListaCaracteristicas;
public MateriaPrimas() {
	ListaCaracteristicas=new ArrayList<>();
	CaracteristicasInicial();
}
private Caracteristica crearCaracteristica(String nom,String uni,float valor) {
	Caracteristica nuevaCaracteristica=new Caracteristica();
	nuevaCaracteristica.setNombre(nom);
	nuevaCaracteristica.setUnidad(uni);
	nuevaCaracteristica.setValor(valor);
	ListaCaracteristicas.add(nuevaCaracteristica);
	return nuevaCaracteristica;
}
public ArrayList<Caracteristica> crearCaracteristicas(){
	Caracteristica c=new Caracteristica();
	return null;
}
public ArrayList<Caracteristica> getListaCaracteristicas() {
	return ListaCaracteristicas;
}
public void setListaCaracteristicas(ArrayList<Caracteristica> listaCaracteristicas) {
	ListaCaracteristicas = listaCaracteristicas;
}
private  void CaracteristicasInicial() {
	CaracteristicasDatos []Datos=CaracteristicasDatos.values();
	for (int i = 0; i < Datos.length; i++) {

		String []fila=Datos[i].toString().split("_");
		crearCaracteristica(fila[0], fila[1], Float.parseFloat(fila[2]));
	}
}
public void filtro(int opcion) {
	if (opcion==1) {
		
	}
}
}
