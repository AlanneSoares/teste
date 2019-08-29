package br.com.rabbitmq.teste.listener;

import br.com.rabbitmq.teste.consumidor.BindingConsumidor;
import br.com.rabbitmq.teste.produtor.BindingProdutor;
import org.springframework.cloud.stream.annotation.StreamListener;


public class HelloListener {

    @StreamListener(target = BindingProdutor.GREETING)
    public void processHelloChannelGreeting(String msg) {
        System.out.println(msg);
    }
}