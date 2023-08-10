package com.jirafik.cats.broker.consumer;

import com.jirafik.cats.broker.config.RabbitConfig;
import com.jirafik.cats.broker.entity.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static org.springframework.amqp.core.ExchangeTypes.TOPIC;

@Component
@Slf4j
@Data
public class RabbitConsumer {

    private User user;

    @RabbitListener(bindings = @QueueBinding(key = RabbitConfig.ROUTING_KEY, value =
    @Queue(value = RabbitConfig.QUEUE), exchange = @Exchange(value = "pastebin:post:exchange", type = TOPIC)))
    public void consumeUploadMessageFromQueue(User user) {
        this.user = user;
        log.info("Successfully receiver user body [{}] from api-gateway", user.getUsername());
    }

}
