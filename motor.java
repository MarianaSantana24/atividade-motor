import java.util.Scanner;

public class Motor {
    protected int quantidadePistao;
    protected int potencia;

    public Motor() {
        quantidadePistao = 0;
        potencia = 0;
    }

    public void setAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o(a) quantidade de pistões");
        quantidadePistao = scanner.nextInt();
        System.out.println("Insira o(a) potencia");
        potencia = scanner.nextInt();
    }
}import java.util.Scanner;

public class Motor {
    protected int quantidadePistao;
    protected int potencia;

    public Motor() {
        quantidadePistao = 0;
        potencia = 0;
    }

    public void setAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o(a) quantidade de pistões");
        quantidadePistao = scanner.nextInt();
        System.out.println("Insira o(a) potencia");
        potencia = scanner.nextInt();
    }
}