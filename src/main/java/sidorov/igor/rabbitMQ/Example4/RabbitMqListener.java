package sidorov.igor.rabbitMQ.Example4;

import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {
    Logger logger = Logger.getLogger(RabbitMqListener.class);

    @RabbitListener(queues = "query-example-4-1")
    public void worker1(String message) throws InterruptedException{
        logger.info("accepted on worker 1 : " + message);
        Thread.sleep(2_000);
    }

    @RabbitListener(queues = "query-example-4-2")
    public void worker2(String message) throws InterruptedException {
        logger.info("accepted on worker 2 : " + message);
        Thread.sleep(2_000);
    }

}