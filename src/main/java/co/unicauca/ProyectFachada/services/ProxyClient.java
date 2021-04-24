package co.unicauca.ProyectFachada.services;
/**
 *
 * @author HP
 */
public class ProxyClient {
    private IOrderService orderService;

    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }

    public IOrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(IOrderService orderService) {
        this.orderService = orderService;
    }
    
    public void createOrder(){
        IOrderRepository repo = Factory.getInstance().getRepositorio("default");
        orderService.save(repo);
    }
}
