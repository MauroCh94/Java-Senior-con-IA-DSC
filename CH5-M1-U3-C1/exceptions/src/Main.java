public class Main {

    public static void main(String[] args)  {
        try {
            CuentaBancaria.retirar(4); //SaldoInsuficiente
            CuentaBancaria.retirar(4); //ClaveIncorrecta
        } catch (ValidacionException e) {

        }


        System.out.println("asdasdas");
    }
}