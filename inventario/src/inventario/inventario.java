package inventario;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class inventario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> ListaElementos = new ArrayList <>();
		ArrayList <Integer> cantProducto = new ArrayList <>();
		
		// en esta parte comenzamos a hacer el menu de opciones de el codigo
		
		while (true) {
			
			String opcion = JOptionPane.showInputDialog("Selecciones lo que desea  hacer: \n" 
					+ "1. Agregar producto \n"
					+ "2. Buscar producto por nombre \n"
					+ "3. Actualizar cantidad del producto \n"
					+ "4. eliminar un produto \n"
					+ "5. mostrar inventario \n"
					+ "6. salir");
			
			switch (opcion) {
			case "1":
			
			
			   while(true) {
				   String nombreElementos = JOptionPane.showInputDialog("Ingrese el nombre del elemento que desea ingresar (O 'salir') para terminar:");
				   if 	(nombreElementos.equalsIgnoreCase("Salir")) {
					   break;
				   }
				   
				   if (ListaElementos.contains(nombreElementos)) {
					   JOptionPane.showMessageDialog(null, "el profesor ya esta registrado");
				   } else {
					   ListaElementos.add(nombreElementos);
				   }
			   }
			break;
			
			
			case "2":
			
			   while (true) {
				   JOptionPane.showMessageDialog(null, "productos ingresados" + ListaElementos);
				   break;
			   }
			   
			   break;
			   
			case "3":
				// aca el codigo explota ya que si no digo producto ahi falla todo abajo, pero si lo digo falla el caso en general xd
				if(ListaElementos.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Ingrese la cantidad para un producto" + producto);
					ArrayList<Integer> Listaproducto= new ArrayList<>();
					int cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de un producto"));
					
					for (int j = 0; j < cant; j++) {
						while (true) {
							String nombreProducto = JOptionPane.showInputDialog("nombre del producto" + (j + 1));
							Integer nombreProd;
							if (Listaproducto.contains(nombreProd)) {
								JOptionPane.showMessageDialog(null, "la cantidad ya esta registrada para este producto.");
							} else {
								Listaproducto.add(nombreProd);
								break;
							}
						}
					} 
					
				     cantProducto.addAll(Listaproducto);
				} 
			}
			break;
			
			
			case "5";
				 while (true) {
					   JOptionPane.showMessageDialog(null, "productos y cantidad: " + cantProducto);
					   break;
		}

	}

}
