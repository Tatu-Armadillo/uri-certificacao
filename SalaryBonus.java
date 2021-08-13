import java.util.Scanner;

public class SalaryBonus {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String name = read.nextLine();
        double fixedSalary = read.nextDouble();
        double sale = read.nextDouble();
        double salary = (sale * 0.15) + fixedSalary;

        read.close();
        System.out.println("Funcionario " + name);
        System.out.println(String.format("TOTAL = R$ %.2f", salary));
    }
}
