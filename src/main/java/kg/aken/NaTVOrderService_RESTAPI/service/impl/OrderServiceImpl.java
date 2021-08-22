package kg.aken.NaTVOrderService_RESTAPI.service.impl;

import kg.aken.NaTVOrderService_RESTAPI.dao.OrderRepository;
import kg.aken.NaTVOrderService_RESTAPI.enums.OrderStatus;
import kg.aken.NaTVOrderService_RESTAPI.mapppers.OrderMapper;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.OrdersDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Orders;
import kg.aken.NaTVOrderService_RESTAPI.models.inputs.OrderInputData;
import kg.aken.NaTVOrderService_RESTAPI.models.responces.OrderResponse;
import kg.aken.NaTVOrderService_RESTAPI.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    private OrderMapper orderMapper = OrderMapper.ORDER_MAPPER;

    @Override
    public OrderResponse saveOrder(OrderInputData orderInputData) {
        OrderResponse orderResponse = new OrderResponse();
        Orders orders = new Orders();
        orders.setId(orderInputData.getId());
        orders.setEmail(orderInputData.getEmail());
        orders.setPhone(orderInputData.getPhone());
        orders.setAdd_date(new Date());
        orders.setEdit_date(new Date());
        orders.setText(orderInputData.getText());
        orders.setOrderStatus(OrderStatus.PROCESS);
        OrdersDto ordersDto = orderMapper.toDto(orderRepository.save(orders));
        orderResponse.setAddText(ordersDto.getText());
        String textLength = orders.getText().replaceAll("\\s+", "");

        return orderResponse;
    }

    @Override
    public OrdersDto save(OrdersDto ordersDto) {
        Orders orders = orderMapper.toEntity(ordersDto);
        orders = orderRepository.save(orders);
        return orderMapper.toDto(orders);
    }

    @Override
    public OrdersDto update(OrdersDto ordersDto) {
        return null;
    }

    @Override
    public List<OrdersDto> findAll() {
        return orderMapper.toDtoList(orderRepository.findAll());
    }

    @Override
    public OrdersDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
