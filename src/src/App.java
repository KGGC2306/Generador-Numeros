import java.util.Scanner;

public class App {
    public static int obtenerEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int valor = scanner.nextInt();
        return valor;
    }
    public static void generarValores(){
        int n = obtenerEntrada();
        int contador = 0;
        while (contador < n){
            contador = contador + 1;
            System.out.println(contador);
        }
    }
    public static void generarValoresPares(){
        int n = obtenerEntrada();
        int contador = 0;
        while (contador < n){
            if (contador % 2 == 0) System.out.println(contador);
            contador = contador +1;
        }
    }
    public static void generarRandom(){
        int n = (int) (Math.random() * 3500);
        int contador = 0;
        while (contador < n){
            contador = contador + 5;
            System.out.println(contador);
        }
    }
    public static void main(String[] args) {
        generarRandom();
    }
}
