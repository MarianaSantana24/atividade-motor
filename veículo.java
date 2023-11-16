import java.lang.reflect.Field;
import java.util.Scanner;

public class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected String cor;
    protected float velocidadeMax;
    protected int quantidadeRodas;
    protected Motor motor;

    public Veiculo() {
        placa = "";
        marca = "";
        modelo = "";
        cor = "";
        velocidadeMax = 0;
        quantidadeRodas = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getVelocidadeMax() {
        return velocidadeMax;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setAll() {
        Scanner scanner = new Scanner(System.in);
        String[] variaveis = {"placa", "marca", "modelo", "cor", "velocidadeMax", "quantidadeRodas"};
        Object[] dataArray = {};
        Veiculo carro = new Veiculo();
        System.out.println("Vamos fazer um veiculo!");

        for (String i : variaveis) {
            System.out.println("Insira o(a) " + i);

            if (i.equals("velocidadeMax") || i.equals("quantidadeRodas")) {
                int res = scanner.nextInt();

                Object[] newArray = new Object[dataArray.length + 1];
                System.arraycopy(dataArray, 0, newArray, 0, dataArray.length);
                newArray[newArray.length - 1] = res;
                dataArray = newArray;
            }
            else {
                String res = scanner.nextLine();
                Object[] newArray = new Object[dataArray.length + 1];
                System.arraycopy(dataArray, 0, newArray, 0, dataArray.length);
                newArray[newArray.length - 1] = res;
                dataArray = newArray;
            }

            Field[] fields = Veiculo.class.getDeclaredFields();
            for (int j = 0; j < Math.min(fields.length, dataArray.length); j++) {
                try {
                    fields[j].set(carro, dataArray[j]);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        Motor motor = new Motor();
        motor.setAll();
        System.out.println("Veiculo: " + "placa='" + carro.getPlaca() + '\'' + ", marca='" + carro.getMarca() + '\'' + ", modelo='" + carro.getModelo() + '\'' + ", cor='" + carro.getCor() + '\'' + ", velocidadeMax=" + carro.getVelocidadeMax() + ", quantidadeRodas=" + carro.getQuantidadeRodas() + " Motor: pistões: " + motor.quantidadePistao + "potencia: " + motor.potencia);
    }
}