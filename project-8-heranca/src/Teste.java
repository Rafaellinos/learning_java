import conta.ContaCorrente;

public class Teste{

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, "Rafael", 340.34);
        cc.Taxar(5.3);
        System.out.println(cc.getSaldo());
    }
}