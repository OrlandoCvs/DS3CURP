
import java.util.Scanner;
import java.util.regex.Pattern;
public class CURP {
    public static void main(String[] args) {
        String curp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una curp válida ");
       curp = sc.next();
        System.out.println(curpcheck(curp));
    }

    public static boolean curpcheck(String curp) {

        String regex = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}" +

                        "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" +

                        "[HM]{1}" +

                        "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)" +

                        "[B-DF-HJ-NP-TV-Z]{3}" +

                        "[0-9A-Z]{1}[0-9]{1}$";


        Pattern patron = Pattern.compile(regex);
        if (!patron.matcher(curp).matches()) {
            System.out.println("CURP inválida. ");
            return false;

        } else {
            System.out.println("CURP válida. ");
            return true;


        }
}}
