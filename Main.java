/** @author david*/
/** @version 3-2.0*/


public class Main {																			/** Clase Main*/
	/** @version 3-2.0*/

    public static void main(String[] args) {												/** Método Main*/
        CCuenta miCuenta;
        double saldoActual;																	/** @param saldo*/

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );								/** @return saldo actual*/

        try {																				/** Método retirar*/
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {																				/** Método ingresar*/
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
