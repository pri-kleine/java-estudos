package POOII.src.main.java.br.com.ada.pooii.SOLID.SRP_exercicio;

import java.util.List;

class Pedido {
    private long id;
    private List<Item> itens;

    // getters e setters
}

class Item {
    // Detalhes do item
}

class Imprimicao {
    public void imprimirPedido() { }
    public void imprimirItens() { }
}

class StatusPedido {
    public void buscarPedido(long id) { /* Violação do SRP */ }
    public void salvar(Pedido pedido) { /* Violação do SRP */ }
    public void atualizar(long id, Pedido pedido) { /* Violação do SRP */ }
    public void deletar(long id) { /* Violação do SRP */ }
}

class EmailService {
    public void enviarEmailConfirmacao(String mensagem) { /* Violação do SRP */ }
    public void enviarParaTransporte() { /* Violação do SRP */ }
}
