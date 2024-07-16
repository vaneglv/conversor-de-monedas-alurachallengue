import java.util.Scanner;

public class principal{
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        ConsumoAPI consulta = new ConsumoAPI();

        int opcion=0;
        while (opcion != 8){
            System.out.println("-----------------------------------------------\n" +
                    "Bienvenidos al Conversor de Monedas\n\n" +
                    "Ingresa la Conversion que deseas realizar\n\n" +
                    "1. Dollar a Peso Mexicano\n" +
                    "2. Peso Mexicano a Dollar\n" +
                    "3. Dollar a Peso Colombiano\n" +
                    "4. Peso Colombiano a Dollar\n" +
                    "5. Dollar a Real Brasilero\n" +
                    "6. Real Brasilero a Dollar\n" +
                    "7. Convertir otra moneda\n " +
                    "8. Salir\n" +
                    "------------------------------------------------------\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvercionMoneda.convertir("USD", "MXN", consulta, lectura);
                    break;
                case 2:
                    ConvercionMoneda.convertir("MXN", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvercionMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 4:
                    ConvercionMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvercionMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 6:
                    ConvercionMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvercionMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo del Convertidor");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
}
