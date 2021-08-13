import java.util.Scanner;

public class BhaskarasFormula {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        String in = read.nextLine();
        String out[] = in.split(" ");
        
        double A = Double.parseDouble(out[0]);
        double B = Double.parseDouble(out[1]);
        double C = Double.parseDouble(out[2]);
        
        double x1 = (-B/A) + (C/A);  
        double x2 = (-B/A) + (C/A);  

        read.close();

    }
}
