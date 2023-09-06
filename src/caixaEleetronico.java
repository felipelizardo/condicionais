public class caixaEleetronico {
    public static void main(String[] args) {
    double saldo = 30.00;
    double saque = 25.00;

    if(saque < saldo) {
        saldo = saldo - saque;

        System.out.println(saldo);
    }

}
}