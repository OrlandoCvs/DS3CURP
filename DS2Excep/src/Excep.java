import java.util.*;

public class Excep {
    public static void main(String[] args) {
       String code;
        int n = 7;
        Scanner lectTeclado = new Scanner(System.in);
        System.out.println("Ingresa una cadena: ");
        code = lectTeclado.next();
        caracterEn(code, n-1);

    }

    public static void caracterEn(String code, int n) {
        try {
            if (n >= 0 && n <= code.length())
                System.out.println(code.charAt(n));
        }catch (Exception e){
        }
        }
    }