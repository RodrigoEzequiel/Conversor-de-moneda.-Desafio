public class ConsultaMonedas {
    private ClienteApi cliente = new ClienteApi();

    public void pesosADolares (String monto){
         DatosDeMonedas resultado = cliente.getAmount("ARS","USD", monto);
         if(resultado != null){
             System.out.println( monto + "$ Argentinos son: " + resultado.conversion_result() + " Dolares");
             System.out.println(" Un peso Argentino es igual a: " + resultado.conversion_rate() + " Dolares");
         }
    }
    public void dolaresAPesos (String monto){
        DatosDeMonedas resultado = cliente.getAmount("USD","ARS", monto);
        if(resultado != null){
            System.out.println( monto + "$ Dolares son: " + resultado.conversion_result() + " Pesos Argentinos");
            System.out.println(" Un dolar es igual a: " + resultado.conversion_rate() + " Pesos Argentinos");
        }
    }
    public void pesosAEuros (String monto) {
        DatosDeMonedas resultado = cliente.getAmount("ARS", "EUR", monto);
        if (resultado != null) {
            System.out.println(monto + "$ Argentinos son: " + resultado.conversion_result() + " Euros");
            System.out.println(" Un peso Argentino es igual a: " + resultado.conversion_rate() + " Euros");
        }
    }
    public void eurosAPesos (String monto) {
        DatosDeMonedas resultado = cliente.getAmount("EUR", "ARS", monto);
        if (resultado != null) {
            System.out.println(monto + " Euros son: " + resultado.conversion_result() + " Pesos Argentinos");
            System.out.println(" Un Euro es igual a: " + resultado.conversion_rate() + " Pesos Argentinos");
        }
    }
    public void dolaresAEuros (String monto) {
        DatosDeMonedas resultado = cliente.getAmount("USD", "EUR", monto);
        if (resultado != null) {
            System.out.println(monto + " dolares son: " + resultado.conversion_result() + " Euros");
            System.out.println(" Un dolar es igual a: " + resultado.conversion_rate() + "Euros");
        }
    }
    public void eurosADolares (String monto) {
        DatosDeMonedas resultado = cliente.getAmount("EUR", "USD", monto);
        if (resultado != null) {
            System.out.println(monto + " Euros son: " + resultado.conversion_result() + " dolares");
            System.out.println(" Un Euro es igual a: " + resultado.conversion_rate() + " dolares");
        }
    }

    public static void main(String[] args) {
        ConsultaMonedas cm = new ConsultaMonedas();
        //cm.pesosADolares("400");
        //cm.dolaresAPesos("100");
        cm.dolaresAEuros("300");
    }

}

