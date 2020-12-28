

package conta;

public class ContaCorrente extends Conta{

    public ContaCorrente(int num, String nm, double sal){
        super(num, nm, sal); // chamar o método construtor da classe herdada
    }

    public boolean Taxar(double valor){
        this.retirar(valor);
        return true;
    }
}