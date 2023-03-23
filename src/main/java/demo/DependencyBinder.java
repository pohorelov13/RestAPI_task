package demo;

import demo.repo.OrderRepo;
import demo.repo.OrderRepoInMemory;
import demo.services.OrderService;
import jakarta.inject.Singleton;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class DependencyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(OrderService.class)
                .to(OrderService.class)
                .in(Singleton.class);
    }
}
