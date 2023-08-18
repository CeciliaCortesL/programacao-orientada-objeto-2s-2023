public class verificaNumeroPrimo {

    public static int verificanumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Integer numero = 18;
        int resultado = verificanumeroPrimo(numero);

        System.out.println("Numero:  " + numero);
        System.out.println("Resultado: " + resultado);

        if (resultado == 1) {
            System.out.println("Numero é primo");
        } else {
            System.out.println("Numero não primo");
        }
    }
}
