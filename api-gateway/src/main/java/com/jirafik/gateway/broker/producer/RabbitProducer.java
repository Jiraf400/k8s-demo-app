package com.jirafik.gateway.broker.producer;

import com.jirafik.gateway.broker.entity.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import static com.jirafik.gateway.broker.config.RabbitConfig.*;

@Component
@Slf4j
@AllArgsConstructor
public class RabbitProducer {

    private final RabbitTemplate template;

    public void sendUploadRequest(User user) {
        template.convertAndSend(EXCHANGE, ROUTING_KEY, user);
        log.info("Successfully sent upload request [{}] to cats-service", user);
    }

}
