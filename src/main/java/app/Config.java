package app;

import app.entities.Address;
import app.entities.Customer;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("app")
@EnableAspectJAutoProxy
public class Config {
    @Scope("prototype")
    @Bean
    public Customer customerShneor() {
        return new Customer("shneor", "nagar", "1", new Address());
    }
}


