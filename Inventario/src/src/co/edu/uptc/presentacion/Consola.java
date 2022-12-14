package src.co.edu.uptc.presentacion;


import java.util.Scanner;

import src.co.edu.uptc.logica.control.MateriaPrimas;

public class Consola {
	private Scanner sc;
	private MateriaPrimas Panaderia;

	public Consola() {
		sc = new Scanner(System.in);
		Panaderia = new MateriaPrimas();
	}

	public void menuConsola() {
		int opc = 1;
		while (opc != 0) {
			System.out.println("""
						Elija la Opción
						1.que unidad no quiere mostrar
						2.mostrar 
						0.salir

					""");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				
				
				break;
			case 2:
				System.out.printf("tam: %d\n", Panaderia.getListaCaracteristicas().size());
				mostrarDatos();
				var cosa=0;
				while(cosa!=1||cosa!=2) {
				System.out.println("""
						que unidad no quiere mostrar
						1.ml
						2.gr
						""");
				cosa=sc.nextInt();
				if(cosa!=1||cosa!=2) {
					System.out.println("error marque otra vaina que si este programada");
				}
				}
				
				mostrarDatos();
				break;
			case 0:
				System.out.println("bye");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);
			}
		}
	}
private void mostrarDatos() {
	for (int i = 0; i < Panaderia.getListaCaracteristicas().size(); i++) {
		System.out.printf("nombre: %s\n", Panaderia.getListaCaracteristicas().get(i).getNombre());
		System.out.printf("nombre: %s\n", Panaderia.getListaCaracteristicas().get(i).getUnidad());
		System.out.printf("nombre: %f\n", Panaderia.getListaCaracteristicas().get(i).getValor());
	}
	
}
	// date y local date diferencia de versiones

}
