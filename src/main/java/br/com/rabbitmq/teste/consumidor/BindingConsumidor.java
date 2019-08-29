package br.com.rabbitmq.teste.consumidor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

//RECEBENDO A MENSAGEM
public interface BindingConsumidor {
    // escrevendo
    String GREETING = "greetingChannel-input";

    @Input(GREETING)
    SubscribableChannel greeting();
}