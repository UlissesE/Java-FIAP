package br.com.fiap.pedidos.services;

public class NotificacaoAdapter implements NotificacaoModerna {

    private SistemaNotificacaoLegado sistemaNotificacaoLegado;

    public NotificacaoAdapter(SistemaNotificacaoLegado sistemaNotificacaoLegado) {
        this.sistemaNotificacaoLegado = sistemaNotificacaoLegado;
    }

    @Override
    public void notificar(String mensagem) {
        sistemaNotificacaoLegado.enviarMensagemAntiga(mensagem, 1);
    }
}
