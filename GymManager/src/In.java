

//VAR=In.String or In.Int ktlp gia eisodo apo keyboard
import java.io.*;

    
public class In { //Class gia eisagogi dedomenwn apo to pliktrologio
    public static String String() { //Methodos gia eisagogi String
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line=br.readLine();
        return line;
        }
        catch(Exception e) {
            return "Exception - Lathos";
        }
    }
    public static int Int() { //Methodos gia eisagogi Integer
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line=br.readLine();
            int i=Integer.parseInt(line);
            return i;
        }
        catch(Exception e) {
            return -1;
        }
    }
    public static short Short() { //Methodos gia eisagogi short
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line = br.readLine();
            short i = Short.parseShort(line);
            return i;
        }
        catch(Exception e) {
            return (short)-1;
        }
    }
    public static long Long() { //Methodos gia eisagogi long
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line = br.readLine();
            long i = Long.parseLong(line);
            return i;
        }
            catch(Exception e) {
            return -1L;
        }
    }
    public static float Float() { //Methodos gia eisagogi Float
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line = br.readLine();
            float f = Float.parseFloat(line);
            return f;
        }
        catch(Exception e) {
            return -1f;
        }
    }
     public static double Double() { //Methodos gia eisagogi Double
        String line;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            line = br.readLine();
            double d = Double.parseDouble(line);
            return d;
        }
        catch(Exception e) {
            return -1.0;
        }
    }
}

