public class Encomenda {

    private int codigo;
    private String destinatario, endereco, status;

    public Encomenda(int codigo, String destinatario, String endereco, String status) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.status = status;
    }

    public void exibirInfo() {
        System.out.println("Dados da encomenda:\n" + "Código: " + codigo + ", Destinatário: " + destinatario + ", Endereço: " + endereco + ", Status da entrega: " + status + "." );
    }


    public void atualizarStatus(String novoStatus) {
        if(novoStatus == "P") {
            this.status = "Postado";
        } else if(novoStatus == "T") {
            this.status = "Em trânsito";
        } else {
            this.status = "Entregue";
        }
    }

}
