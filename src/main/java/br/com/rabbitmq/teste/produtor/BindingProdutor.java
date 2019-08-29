package br.com.rabbitmq.teste.produtor;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

//CONSUMINDO MENSAGEM
public interface BindingProdutor {

    String GREETING = "greetingChannel-output";

    @Output(GREETING)
    MessageChannel greeting();
}