package it.revo.Online.food.order;

import it.revo.Online.food.order.component.InitConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineFoodOrderApplication {

    public static void main(String[] args) {
        if (InitConfig.isStart()) {
            SpringApplication.run(OnlineFoodOrderApplication.class, args);
        }
    }

}
