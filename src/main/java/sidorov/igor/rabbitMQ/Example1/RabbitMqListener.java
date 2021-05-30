package sidorov.igor.rabbitMQ.Example1;

import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by dshv on 22.06.2015.
 */
@EnableRabbit
@Component
public class RabbitMqListener {
    Logger logger = Logger.getLogger(RabbitMqListener.class);

    @RabbitListener(queues = "queue1")
    public void processQueue1(String message) throws InterruptedException {
        logger.info("Received from queue 1: " + message);
        Thread.sleep(20_000);
    }
//
//    @RabbitListener(queues = "queue1")
//    public void processQueue2(String message) throws InterruptedException {
//        logger.info("Received from queue 1: " + message);
//        Thread.sleep(20_000);
//    }

}
