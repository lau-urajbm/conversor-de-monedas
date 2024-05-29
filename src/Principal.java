import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Scanner teclado = new Scanner(System.in);
        ArrayList<RegistroMonedas> historial = new ArrayList<>();
        int opcion = 0;
        String menu = """
                Elija el número de la opción que corresponde a la conversión que desea hacer:
                1- ARS (Peso argentino) a BOB (Boliviano boliviano)
                2- ARS (Peso argentino) a BRL (Real brasileño)
                3- ARS (Peso argentino) a CLP (Peso chileno)
                4- ARS (Peso argentino) a COP (Peso colombiano)
                5- ARS (Peso argentino) a USD (Dólar estadounidense)
                6- BOB (Boliviano boliviano) a ARS (Peso argentino)
                7- BOB (Boliviano boliviano) a BRL (Real brasileño)
                8- BOB (Boliviano boliviano) a CLP (Peso chileno)
                9- BOB (Boliviano boliviano) a COP (Peso colombiano)
                10-BOB (Boliviano boliviano) a USD (Dólar estadounidense)
                11-BRL (Real brasileño) a ARS (Peso argentino)
                12-BRL (Real brasileño) a BOB (Boliviano boliviano)
                13-BRL (Real brasileño) a CLP (Peso chileno)
                14-BRL (Real brasileño) a COP (Peso colombiano)
                15-BRL (Real brasileño) a USD (Dólar estadounidense)
                16-CLP (Peso chileno) a ARS (Peso argentino)
                17-CLP (Peso chileno) a BOB (Boliviano boliviano)
                18-CLP (Peso chileno) a BRL (Real brasileño)
                19-CLP (Peso chileno) a COP (Peso colombiano)
                20-CLP (Peso chileno) a USD (Dólar estadounidense)
                21-COP (Peso colombiano) a ARS (Peso argentino)
                22-COP (Peso colombiano) a BOB (Boliviano boliviano)
                23-COP (Peso colombiano) a BRL (Real brasileño)
                24-COP (Peso colombiano) a CLP (Peso chileno)
                25-COP (Peso colombiano) a USD (Dólar estadounidense)
                26-USD (Dólar estadounidense) a ARS (Peso argentino)
                27-USD (Dólar estadounidense) a BOB (Boliviano boliviano)
                28-USD (Dólar estadounidense) a BRL (Real brasileño)
                29-USD (Dólar estadounidense) a CLP (Peso chileno)
                30-USD (Dólar estadounidense) a COP (Peso colombiano)
                31-Ver historial de conversiones
                32-Salir
                """;

        while (opcion != 32) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: {
                    Moneda tasa = conversor.obtenerValor("ARS", "BOB");
//                    System.out.println("Escriba la cifra que desea convertir: ");
//                    cifra= teclado.nextDouble();
//                    System.out.println(conversor.hacerConversion(tasa, cifra));
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }

                case 2: {
                    Moneda tasa = conversor.obtenerValor("ARS", "BLR");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 3: {
                    Moneda tasa = conversor.obtenerValor("ARS", "CLP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 4: {
                    Moneda tasa = conversor.obtenerValor("ARS", "COP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 5: {
                    Moneda tasa = conversor.obtenerValor("ARS", "USD");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 6: {
                    Moneda tasa = conversor.obtenerValor("BOB", "ARS");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 7: {
                    Moneda tasa = conversor.obtenerValor("BOB", "BRL");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 8: {
                    Moneda tasa = conversor.obtenerValor("BOB", "CLP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 9: {
                    Moneda tasa = conversor.obtenerValor("BOB", "COP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 10: {
                    Moneda tasa = conversor.obtenerValor("BOB", "USD");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 11: {
                    Moneda tasa = conversor.obtenerValor("BRL", "ARS");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 12: {
                    Moneda tasa = conversor.obtenerValor("BRL", "BOB");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 13: {
                    Moneda tasa = conversor.obtenerValor("BRL", "CLP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 14: {
                    Moneda tasa = conversor.obtenerValor("BRL", "COP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 15: {
                    Moneda tasa = conversor.obtenerValor("BRL", "USD");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 16: {
                    Moneda tasa = conversor.obtenerValor("CLP", "ARS");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 17: {
                    Moneda tasa = conversor.obtenerValor("CLP", "BOB");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 18: {
                    Moneda tasa = conversor.obtenerValor("CLP", "BRL");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 19: {
                    Moneda tasa = conversor.obtenerValor("CLP", "COP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 20: {
                    Moneda tasa = conversor.obtenerValor("CLP", "USD");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 21: {
                    Moneda tasa = conversor.obtenerValor("COP", "ARS");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 22: {
                    Moneda tasa = conversor.obtenerValor("COP", "BOB");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 23: {
                    Moneda tasa = conversor.obtenerValor("COP", "BRL");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 24: {
                    Moneda tasa = conversor.obtenerValor("COP", "CLP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 25: {
                    Moneda tasa = conversor.obtenerValor("COP", "USD");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 26: {
                    Moneda tasa = conversor.obtenerValor("USD", "ARS");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 27: {
                    Moneda tasa = conversor.obtenerValor("USD", "BOB");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 28: {
                    Moneda tasa = conversor.obtenerValor("USD", "BLR");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 29: {
                    Moneda tasa = conversor.obtenerValor("USD", "CLP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 30: {
                    Moneda tasa = conversor.obtenerValor("USD", "COP");
                    conversor.hacerConversion(tasa);
                    historial.add(conversor.registroMonedas);
                    break;
                }
                case 31: {
                    System.out.println("*** Historial de conversiones***");
                    for(RegistroMonedas moneda : historial){
                        System.out.println("- Conversión: "+ moneda.getBase_code()+" a "
                                +moneda.getTarget_code());
                        System.out.println("Tu valor: "+moneda.getCifraInicial());
                        System.out.println("Resultado: "+ moneda.getConversion());
                        System.out.println("**************************************");

                    }
                    break;
                }

                case 32:
                    System.out.println("El programa será finalizado.");
                    break;

                default:
                    System.out.println("Ha ocurrido un error inesperado, verifica que hayas digitado una opción disponible.");


            }
        }
    }
}
