public class Transportadora {
    private Encomenda[] encomendas;
    private int quantidade;

    public Transportadora() {
      encomendas = new Encomenda[5];
      quantidade = 0;
    }

    public void adicionarEncomenda(Encomenda encomenda) {
        if(quantidade < encomendas.length) {
          encomendas[quantidade] = encomenda;
          quantidade++;
        }
    }
}
