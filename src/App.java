import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int raio = sc.nextInt();
        double pi = 3.14159;
        double volume = 4.0/3 * pi * Math.pow(raio, 3);
        sc.close(); 
        

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
