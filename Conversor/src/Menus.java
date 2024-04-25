public class Menus {
    public static void menuPrincipal(){
        int opcion = -1;
        while (opcion < 0 || opcion > 6){
            System.out.println("Elija la opcion deseada.");
            System.out.println("*******************");
            System.out.println("1: Convertir pesos a Dolares.");
            System.out.println("2: Convertir pesos a Euros.");
            System.out.println("3: Convertir Dolares a Pesos.");
            System.out.println("4: Convertir Dolares a Euros.");
            System.out.println("5: Convertir Euros a Pesos.");
            System.out.println("6: Convertir Euros a Dolares.");
            System.out.println("0: Salir");
            System.out.println("*******************");
            System.out.print("Ingrese opcion: ");
            opcion = ConsoleUtils.leerEntero();
            if(opcion == 0) break;
            if(opcion <0 || opcion >6) {
                System.out.println("Opcion Incorrecta.");
            }else{
                String monto = "";
                while(monto.equals("")) {
                    System.out.println("Por favor ingrese monto que desea convertir:");
                    System.out.println("si el monto es decimal, usar PUNTO y no COMA");
                    monto = ConsoleUtils.leerMonto();
                    if (monto.equals("")) {
                        System.out.println("Monto incorrecto");
                    }
                }
                ConsultaMonedas cm = new ConsultaMonedas();
                switch (opcion){
                    case 1:
                        cm.pesosADolares(monto);
                        break;
                    case 2:
                        cm.pesosAEuros(monto);
                        break;
                    case 3:
                        cm.dolaresAPesos(monto);
                        break;
                    case 4:
                        cm.dolaresAEuros(monto);
                        break;
                    case 5:
                        cm.eurosAPesos(monto);
                        break;
                    case 6:
                        cm.eurosADolares(monto);
                        break;
                }
                System.out.println("presione una tecla para continuar...");
                ConsoleUtils.continuar();
                opcion = -1;
            }
        }
        System.out.println("Muchas gracias por usar nuestros servicios");
    }

}
