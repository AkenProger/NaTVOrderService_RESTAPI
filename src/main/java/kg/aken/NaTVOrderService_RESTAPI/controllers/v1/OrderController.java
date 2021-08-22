package kg.aken.NaTVOrderService_RESTAPI.controllers.v1;

import kg.aken.NaTVOrderService_RESTAPI.controllers.BaseCrudController;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.OrdersDto;
import kg.aken.NaTVOrderService_RESTAPI.models.inputs.OrderInputData;
import kg.aken.NaTVOrderService_RESTAPI.models.responces.OrderResponse;
import kg.aken.NaTVOrderService_RESTAPI.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/orders")
public class OrderController implements BaseCrudController<OrdersDto, Long> {

    private OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/save-order")
    public OrderResponse saveOrder(@RequestBody OrderInputData orderInputData){
        return orderService.saveOrder(orderInputData);
    }

    @Override
    public OrdersDto save(OrdersDto ordersDto) {
        return orderService.save(ordersDto);
    }

    @Override
    public List<OrdersDto> findAll() {
        return orderService.findAll();
    }

    @Override
    public OrdersDto update(OrdersDto ordersDto) {
        return null;
    }

    @Override
    public OrdersDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
