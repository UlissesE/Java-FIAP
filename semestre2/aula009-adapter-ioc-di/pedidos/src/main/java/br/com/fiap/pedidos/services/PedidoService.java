package br.com.fiap.pedidos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private EmailService emailService;

    @Autowired
    public PedidoService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void processarPedido() {
        System.out.println("Processando pedido...");
        emailService.enviarEmail();
    }

    public void receberPedido() {
        System.out.println("Recebendo pedido...");
    }
}
