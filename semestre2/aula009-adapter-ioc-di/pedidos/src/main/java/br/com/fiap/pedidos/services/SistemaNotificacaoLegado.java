package br.com.fiap.pedidos.services;

public class SistemaNotificacaoLegado {

    public void enviarMensagemAntiga(String mensagem, int prioridade) {
        System.out.println(
                "Sistema legado: " + mensagem + " | Prioridade: " + prioridade
        );
    }
}
