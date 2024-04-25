import java.util.Scanner;

public class ConsoleUtils {
    public static int leerEntero(){
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }catch (Exception e){
            return -1;
        }
    }

    public static String leerMonto(){
        Scanner scanner = new Scanner(System.in);
        String monto = scanner.nextLine();
        try {
            Double amount = Double.valueOf(monto);
            return monto;
        }catch ( Exception e){
            return "";
        }
    }

    public static void continuar(){
        Scanner sc = new Scanner(System.in);
        sc.next().charAt(0);;
    }
}
