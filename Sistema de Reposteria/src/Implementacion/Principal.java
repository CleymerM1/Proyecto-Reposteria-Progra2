package Implementacion;
import java.util.Date;
import java.util.Scanner;

import Clases.*;
import Gestiones.*;
import Util.*;
public class Principal {

	public static void main(String[] args) {
		
	boolean centinela=true, centinelaPostres=true, centinelaCliente=true, centinelaFactura=true, centinelaReservacion=true;
	boolean centinelaBebidas=true, centinelapedido=true, centinelafpago=true, centinelacargo=true, centineladetallef=true, centinelaservicio=true;
	boolean centineladetallep=true, centinelaempleado=true, centinelaingredientes=true, centinelaproveedor=true, centinelapventas=true;
	int opcionPrincipal, opcionPostres, codigoPostres, opcionCliente, codigoCliente, opcionFactura, codigoFactura, opcionproveedor,opcionpventas;
	int  opcionreservacion, opcionbebidas, opcionpedido, opcionEmpleado, opcionfpago, opcioncargo, opciondetallef, opcionservicio, opciondetallep,  opcioningredientes;
	//Declarar la clase scanner necesaria para capturar el ingreso por el usuario
	Scanner sc=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	Scanner sc3=new Scanner(System.in);
	Scanner sc4=new Scanner(System.in);
	Scanner sc5=new Scanner(System.in);
	Scanner sc6=new Scanner(System.in);
	String nombres, apellidos, identidad,  direccion, tamanio, sabor, fecha, descripcion, hora, telefono, nombreEmpresa;
	Date _fecha;
	Detalle_De_Factura Detalle_De_Factura;
	Cargo cargo;
	Empleado empleado;
	double precio, cantidad, sueldo;
	
	
	/*	Para la Factura
	 Codigo(int) autogenerado
	 fecha(String) la fecha del sistema
	 Cliente(cliente) seleccionara
	 LinkedList<Detalle_Factura> seleccionar el postre
	 */
	
	//Estas son las gestiones que solamente se inicializaran
	GestionBebidas gBebidas=new GestionBebidas();
	GestionCargo gCargo=new GestionCargo();
	GestionDetalle_De_Factura gDetalle_De_Factura=new GestionDetalle_De_Factura();
	GestionDetalle_De_Pedido gDetalle_De_Pedido=new 	GestionDetalle_De_Pedido();
	GestionEmpleado gEmpleado=new GestionEmpleado();
	GestionForma_De_Pago gForma=new GestionForma_De_Pago();
	GestionIngredientes gIngredientes=new GestionIngredientes();
	GestionPedido gPedido=new GestionPedido();
	GestionProveedor gProveedor=new GestionProveedor();
	GestionPuntos_De_Venta gPuntos=new GestionPuntos_De_Venta();
	GestionReservacionMesas gReservacion=new GestionReservacionMesas();
	GestionServicio gServicio=new GestionServicio();
	
	GestionCliente gCliente=new GestionCliente();
	GestionPostres gPostres=new GestionPostres();
	GestionFactura gFactura=new GestionFactura();
	
	Bebidas beb1=new Bebidas(1, "Grande", "FrappeOreo", 45, "BebidaFria");
	Bebidas beb2=new Bebidas(2, "Mediano", "TeCanela", 30,"BebidaCaliente_AzucarEspecial");
	gBebidas.Agregar(beb1);
	gBebidas.Agregar(beb2);
	
	Cargo cargo1=new Cargo(1,"Mesero");
	Cargo cargo2=new Cargo(2,"Cocinero");
	Cargo cargo3=new Cargo(3,"Cajero");
	Cargo cargo4=new Cargo(4,"Gerente");
	Cargo cargo5=new Cargo(5,"Repartidor");
	gCargo.Agregar(cargo1);
	gCargo.Agregar(cargo2);
	gCargo.Agregar(cargo3);
	gCargo.Agregar(cargo4);
	gCargo.Agregar(cargo5);
		
	Empleado emp1=new Empleado(1,"Jose", "Rodriguez", "272913", "0703199193222","Danli", 7000,cargo1);
	Empleado emp2=new Empleado(2, "Angie", "Fonseca", "653221", "0801199732234", "TGu", 5000, cargo2);
	Empleado emp3=new Empleado(3, "Humberto", "Mendez", "964231", "0703198936472", "Danli", 8000, cargo3);
	Empleado emp4=new Empleado(4, "Karla", "Torres", "332454","0801197832108","TGU",10000, cargo4);
	Empleado emp5=new Empleado(5, "Victor", "Amador", "27632154", "0703199500243", "Danli", 7500, cargo5);
	gEmpleado.Agregar(emp1);
	gEmpleado.Agregar(emp2);
	gEmpleado.Agregar(emp3);
	gEmpleado.Agregar(emp4);
	gEmpleado.Agregar(emp5);
	
	Forma_De_Pago Forma1=new Forma_De_Pago(1,"Tarjeta de Credito");
	Forma_De_Pago Forma2=new Forma_De_Pago(2,"Tarjeta de Debito");
	Forma_De_Pago Forma3=new Forma_De_Pago(3,"Efectivo");
	gForma.Agregar(Forma1);
	gForma.Agregar(Forma2);
	gForma.Agregar(Forma3);
	
	Ingredientes ingr1=new Ingredientes(1,"Harinas", 40,50); //Precios por libra
	Ingredientes ingr2=new Ingredientes(2,"Leche", 25,30); //Precios por Litro
	Ingredientes ingr3=new Ingredientes(3,"Azucar", 37,45); //Precios por libra
	gIngredientes.agregar(ingr1);
	gIngredientes.agregar(ingr2);
	gIngredientes.agregar(ingr3);
	
	Detalle_De_Pedido dped1=new Detalle_De_Pedido(1, 3, 40, ingr1);
	Detalle_De_Pedido dped2=new Detalle_De_Pedido(2, 7,25,ingr2);
	gDetalle_De_Pedido.Agregar(dped2);
	gDetalle_De_Pedido.Agregar(dped1);

	
	Postres pos1=new Postres(1,"Grande", "Crepas", 100, "DulceLeche");
	Postres pos2=new Postres(2, "Pequenia","TostadasFrancesas",55,"IceCream");
	gPostres.Agregar(pos1);
	gPostres.Agregar(pos2);
        
	Detalle_De_Factura nuevoDetalle1=new Detalle_De_Factura(1,2,55,pos1);
	Detalle_De_Factura nuevoDetalle2=new Detalle_De_Factura(2,6,100,pos2);
	gDetalle_De_Factura.Agregar(nuevoDetalle1);
	gDetalle_De_Factura.Agregar(nuevoDetalle2);
	
	Proveedor prov1=new Proveedor("1","David", "Enriquez","Molinero Harinero Sula", ingr1);
	Proveedor prov2=new Proveedor("2","Carlos", "Gonzalez","Leyde", ingr2);
	Proveedor prov3=new Proveedor("3","Arturo", "Medina","Azucarera Tres Valles", ingr3);
	gProveedor.agregar(prov1);
	gProveedor.agregar(prov2);
	gProveedor.agregar(prov3);
	
	
	Puntos_De_Venta punto1=new Puntos_De_Venta("1","Centro de Danli", "27632154",emp5);
	Puntos_De_Venta punto2=new Puntos_De_Venta("2","Uniplaza Danli", "22287622",emp5);
	gPuntos.Agregar(punto1);
	gPuntos.Agregar(punto2);
	
	Servicio servicio1=new Servicio(1,"Domicilio");
	Servicio servicio2=new Servicio(2,"Consumo Local");
	Servicio servicio3=new Servicio(3,"Para Llevar");
	gServicio.Agregar(servicio1);
	gServicio.Agregar(servicio2);
	gServicio.Agregar(servicio3);
	
	
	Cliente cli1=new Cliente(1, "Juan", "Chavez", "0703197700362","Danli","juan@yahoo.com");
	Cliente cli2=new Cliente(2, "Rosario", "Garcia", "0703198500234","TGU", "rosario@yahoo.com");
	gCliente.agregar(cli1);
	gCliente.agregar(cli2);
	
	
	while(centinela) {
		System.out.println("\nMenu Principal");
		System.out.println("1- Gestion de Cliente");
		System.out.println("2- Gestion de Postres");
		System.out.println("3- Gestion de Factura");
		System.out.println("4- Salir");
		opcionPrincipal=sc.nextInt();
		
		switch(opcionPrincipal) {
		case 1: //Gestion Clientes
			while(centinelaCliente) {
				System.out.println("Gestion Cliente");
				System.out.println("1- Agregar");
				System.out.println("2- Eliminar");
				System.out.println("3- Obtener");
				System.out.println("4- Imprimir");
				System.out.println("5- Salir");
				opcionCliente=sc.nextInt();
				
				switch(opcionCliente) {
				case 1: //Agregar
					/* Pasos
					 * 1. Solicitar los valores al usuario y almacenarlo en variables
					 * 2. Crear la instancia de nuevo objeto(Cliente)
					 * 3. Agregar esta instancia a la gestion
					 */
					
					//Paso1
					System.out.println("Agregar Cliente");
					System.out.println("Ingrese el codigo");
					codigoCliente=sc.nextInt();
					System.out.println("Ingrese los nombres");
					nombres=sc2.nextLine();
					System.out.println("Ingrese los apellidos");
					apellidos=sc2.nextLine();
					System.out.println("Ingrese la direccion");
					direccion=sc2.nextLine();
					System.out.println("Ingrese la identidad");
					identidad=sc2.nextLine();
					
					
					//Paso 2
					Cliente nuevoCliente=new Cliente();
					nuevoCliente.set_codigo(codigoCliente);
					nuevoCliente.set_nombres(nombres);
					nuevoCliente.set_apellidos(apellidos);
					nuevoCliente.set_identidad(identidad);
					nuevoCliente.set_direccion(direccion);
					
					//Paso 3
					if(gCliente.agregar(nuevoCliente)) {
						System.out.println("Cliente agregado correctamente");	
					}else {
						System.out.println("Error al agregar cliente");
					}
				
					break;
				case 2: //Eliminando Cliente
					/*Pasos:
					 * 1. Solicitar el codigo del cliente a eliminar
					 * 2. Buscar el codigo del cliente a eliminar
					 * 3. Si lo encuentra eliminar el cliente de la gestion
					 */
					
					//Paso 1
					int  codigoEliminar;
					int codigoClienteEliminar;
					System.out.println("Eliminar Cliente");
					System.out.println("Ingrese el codigo del Cliente a eliminar:");
					codigoClienteEliminar=sc2.nextInt();
					
					//Paso 2
					
						if(gCliente.eliminarBycodigo(codigoClienteEliminar)) {
							System.out.println("Cliente Eliminado correctamente");
							}else {
								System.out.println("Error al eliminar Cliente");
							}
					
					break;
		
				case 3: //Obtener Cliente
					
					int codigo;
					System.out.println("Seleccione el cliente(ingrese el codigo");
					gCliente.imprimirTodos();
					codigoCliente=sc.nextInt();
					Cliente clienteFactura= gCliente.obtenerCliente(codigoCliente);
					if(clienteFactura==null) { // Cliente no encontrado
						System.out.println("Cliente no encontrado");
					}
					break;
				case 4: //Imprimir Cliente
					gCliente.imprimirTodos();
					break;
				case 5: // Salir
					centinelaCliente=false;
					break;
					default:
						System.out.println("Opcion Incorrecta");
						break;
				}
	
			}
		case 2: //Gestion Postres
			while(centinelaPostres) {
				System.out.println("Gesti�n Postres");
				System.out.println("1- Agregar");
				System.out.println("2- Buscar");
				System.out.println("3- Modificar");
				System.out.println("4- Imprimir todos");
				System.out.println("5- Obtener");
				System.out.println("6- Salir");
				opcionPostres=sc.nextInt();
				
				switch(opcionPostres) {
				case 1: //Agregar
					/* Pasos
					 * 1. Solicitar los valores al usuario y almacenarlo en variables
					 * 2. Crear la instancia de nuevo objeto(Postres)
					 * 3. Agregar esta instancia a la gestion
					 */
					
					//Paso1
					System.out.println("Agregar Postres");
					System.out.println("Ingrese el codigo");
					codigoPostres=sc.nextInt();
					System.out.println("Ingrese el tamanio");
					tamanio=sc2.nextLine();
					System.out.println("Ingrese el sabor");
					sabor=sc2.nextLine();
					System.out.println("Ingrese el precio");
					precio=sc2.nextDouble();
					System.out.println("Ingrese el nombre");
					nombres=sc3.nextLine();
					
					//Seleccion de Postres
					System.out.println("Seleccione el codigo del postre:");
					gPostres.ImprimirTodos();
					codigoPostres=sc.nextInt();
					Postres PostreSeleccionado=null;
					int posicionpostreseleccionado=gPostres.BuscarPorCodigo(codigoPostres);
					
					if(posicionpostreseleccionado==-1) {
						System.out.println("Postre incorrecto");
					}else {
						PostreSeleccionado=gPostres.getElementoPorPosicion(posicionpostreseleccionado);
					}
					//Paso 2
					Postres post1=new Postres();
					post1.set_codigo(codigoPostres);
					post1.set_nombre(nombres);
					post1.set_precio(precio);
					post1.set_sabor(sabor);
					post1.set_tamanio(tamanio);
					
					//Paso 3
					if(gPostres.Agregar(post1)) {
						System.out.println("Postre Agregado Correctamente");
					}else {
						System.out.println("Error al agregar postre");
					}
					break;
				case 2: //Buscar postre
					//Paso 1:
					int codigoPostreBuscar, posicionPostreBuscar;
					System.out.println("Buscar Postre");
					System.out.println("Ingrese el codigo del postre a buscar:");
					codigoPostreBuscar=sc.nextInt();
					
					posicionPostreBuscar=gPostres.BuscarPorCodigo(codigoPostreBuscar);
					
					if(posicionPostreBuscar==-1) {
						System.out.println("El Postre no existe");
					}else {
						Postres postreEncontrado= gPostres.getElementoPorPosicion(posicionPostreBuscar);
						System.out.println(postreEncontrado);
					}
					break;
				case 3://Modificar
					/*Pasos
					1. Buscar el postre a modificar (busqueda por codigo)
					2. Solicitar los nuevos valores al usuario y almacenarlos en variables
					3. Crear la instancia del nuevo objeto (Postres)
					4. Reemplazar esta instancia a la gestion
					*/
					
					//Paso 1:
					int codigoPostreModificar, posicionPostre;
					System.out.println("Modificar Postre");
					System.out.println("Ingrese el codigo del postre a modificar:");
					codigoPostreModificar=sc.nextInt();
					
					posicionPostre=gPostres.BuscarPorCodigo(codigoPostreModificar);
					
					if(posicionPostre==-1) {
						System.out.println("El Postre no existe");
					}else {
						Postres postreEncontrado= gPostres.getElementoPorPosicion(posicionPostre);
						System.out.println(postreEncontrado);
						
						//Paso 2:
						System.out.println("Ingrese el codigo:");
						codigoPostres=sc.nextInt();
						System.out.println("Ingrese el tamanio del postre:");
						tamanio=sc3.nextLine();
						System.out.println("Ingrese el sabor del postre:");
						sabor=sc3.nextLine();
						System.out.println("Ingrese el precio del postre:");
						precio=sc3.nextDouble();
						System.out.println("Ingrese el nombre del postre:");
						nombres=sc3.nextLine();
						
						//Paso 3:
						Postres postreModificado = new Postres(codigoPostres, tamanio, sabor, precio, nombres);
						
						
						//Paso 4
						if(gPostres.Modificar(posicionPostre, postreModificado)) {
							System.out.println("Postre modificado correctamente");
						}else {
							System.out.println("Error al modificar Postre");
						}
					}
					
					break;
				
					case 4: //Imprimir Postre
					gPostres.ImprimirTodos();
					break;
				case 5://Obtener Postre 
					
					int codigo;
					System.out.println("Seleccione el Postre(ingrese el codigo");
					gPostres.ImprimirTodos();
					codigoPostres=sc.nextInt();
					Postres postreFactura= gPostres.obtenerPostres(codigoPostres);
					if(postreFactura==null) { // Postre no encontrado
						System.out.println("Postre no encontrado");
					}
					break;
				
				case 6: // Salir
					centinelaPostres=false;
					break;
					default:
						System.out.println("Opcion Incorrecta");
						break;
				}
				
			}
			
		case 3: //Gestion Factura
			while(centinelaFactura) {
				System.out.println("Gestion Factura");
			System.out.println("1- Agregar");
			System.out.println("2- Imprimir");
			System.out.println("3- Salir");
			opcionFactura=sc.nextInt();
				
			switch(opcionFactura) {
			case 1: //Agregar Factura
				System.out.println("Agregar Factura");
				System.out.println("Ingrese el codigo");
				codigoFactura=sc.nextInt();
				System.out.println("Ingrese la fecha:");
				fecha=sc2.nextLine();
				
				Factura nuevaFactura=new Factura();
				
				gFactura.Agregar(nuevaFactura);
				System.out.println("¿Desea Agregar otra Factura? (1-Si, 0-No)");
				opcionFactura=sc2.nextInt();
				if(opcionFactura==0) {
					centinela=false;
			}
				break;
			case 2: //Imprimir
				gFactura.imprimirTodos();
				break;
			case 3: // Salir
				centinelaFactura=false;
				break;
				default:
					System.out.println("Opcion Incorrecta");
					break;
			}
			}
		 
		
		case 4: //Salir
			centinela=false;
			break;
			default: 
				System.out.println("Opcion Incorrecta");
				break;
			}
		
		}// mientras no se cierre el ciclo no se podra ver la impresion del polimorfismo
		
		
	//Demostracion de que funciona bien las inicializaciones
        ReservacionMesas res1=new ReservacionMesas("Familiar",AdminFechas.getFechaActual(), "Area Verde","1600", cli1);
	ReservacionMesas res2=new ReservacionMesas("Pareja", AdminFechas.getFechaActual(), "Area Techada","1300",cli2);
	gReservacion.Agregar(res1);
	gReservacion.Agregar(res2);
		System.out.println(cli1);
		System.out.println(res1);
		System.out.println(servicio2);
		System.out.println(Forma1);
		/*//Aqui hacemos uso de los metodos creados con la interface
		System.out.println("\nSubtotal de DetalleFactura "+nuevoDetalle1.Subtotal()); 
		System.out.println("Total de DetalleFactura "+nuevoDetalle1.Total());
		System.out.println("\nSubtotal de Pedido "+dped1.Subtotal());
		System.out.println("Total de Pedido "+dped1.Total());
	*/
		//Comportamiento polimorfico mediante interfaz
		PorPagar[] arrayElementos= new PorPagar[4];
		arrayElementos[0]=dped1;
		arrayElementos[1]=dped2;
		arrayElementos[2]=nuevoDetalle1;
		arrayElementos[3]=nuevoDetalle2;
		
		System.out.println("Uso de interfaz");
		for(PorPagar elementos: arrayElementos) {
			System.out.println("\n"+elementos.Subtotal());
			
		}
		for(PorPagar elementos1: arrayElementos) {
			System.out.println("\n"+elementos1.Total());
		}
			
	}
	}


	


		
	
	
	
	
	
	
	

	