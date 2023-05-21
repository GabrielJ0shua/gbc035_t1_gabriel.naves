public abstract class ContaCorrente {
    protected float saldo;
    protected Boolean estado;
    protected int numConta;
    protected int senha;

    public ContaCorrente(float val, int num, int senhaDeEntrada) {
        numConta = num;
        senha = senhaDeEntrada;
        saldo = val;
        estado = true;
    }

    public abstract boolean debitaValor(float val, int senhaDeEntrada);

    public void debitaValor(float val) {
        saldo -= val;
    }

    public float getSaldo(int senhaDeEntrada) {
        if (senha == senhaDeEntrada)
            return saldo;
        else
            return -1; // indicando que houve problema na senha
    }

    public void creditaValor(int senhaDeEntrada, float val) {
        if (senha == senhaDeEntrada)
            saldo += val;
    }

    protected Boolean getEstado(int senhaDeEntrada) {
        if (senha == senhaDeEntrada)
            return estado;
        else
            return false;
    }

    protected void setEstado(int senhaDeEntrada, Boolean b) {
        if (senha == senhaDeEntrada)
            estado = b;
    }

    protected boolean isSenha(int senhaDeEntrada) {
        if (senha == senhaDeEntrada)
            return true;
        else
            return false;
    }
}