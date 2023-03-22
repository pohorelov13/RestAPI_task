package demo.resources;


import demo.model.Order;
import demo.services.OrderService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/orders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderResource {

    private OrderService orderService = new OrderService();

    @GET
    public List<Order> getAllOrders() {
        return orderService.getOrders();
    }

    @GET
    @Path("/{id}")
    public Order getOrderById(@PathParam("id") int id) {
        return orderService.getOrderById(id);
    }

    @POST
    public void addOrder(Order order) {
        orderService.addOrder(order);
        orderService.setCost(order);
    }
}
