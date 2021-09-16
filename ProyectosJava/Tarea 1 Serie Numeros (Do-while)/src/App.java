public class App {
    public static void main(String[] args) throws Exception {
        int NumInicial1 = 1, NumInicial2 = 2, Suma = 0, Limite = 10, Contador = 0;
        while(Contador <= Limite)
        {
            Suma = NumInicial1 + NumInicial2;
            System.out.println("Resultado: " + Suma);
            Contador++;
            NumInicial1 = NumInicial2;
            NumInicial2 = Suma;
        }
    }
}
