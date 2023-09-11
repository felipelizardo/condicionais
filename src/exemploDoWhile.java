import java.util.random;
/**
 * exemploDoWhile
 */
public class exemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando ...");

        do {
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Alo !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new ramdom().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negaando o ato continuar tocando
        return ! atendeu;
    }
}