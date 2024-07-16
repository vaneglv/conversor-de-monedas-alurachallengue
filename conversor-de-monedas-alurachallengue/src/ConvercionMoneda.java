import java.util.Scanner;

public class ConvercionMoneda {


    public static void convertir(String monedaBase, String monedaTarget, ConsumoAPI consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La Tasa de Conversion para hoy\n1 " + monedaBase + " = " + monedas.conversion_rate() + " " + monedaTarget);
        System.out.println("Ingrese la Cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());
    }
        public static void convertirOtraMoneda(ConsumoAPI consulta, Scanner lectura){
            System.out.println("Ingrese el codigo de la Moneda Base:");
            String monedaBase = lectura.nextLine().toUpperCase();
            System.out.println("Ingrese la Moneda Objetivo:");
            String monedaObjetivo = lectura.nextLine().toUpperCase();
            convertir(monedaBase, monedaObjetivo, consulta, lectura);
        }
    }
