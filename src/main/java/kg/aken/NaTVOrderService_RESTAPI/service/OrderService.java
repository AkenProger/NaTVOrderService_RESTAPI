package kg.aken.NaTVOrderService_RESTAPI.service;

import kg.aken.NaTVOrderService_RESTAPI.models.dto.OrdersDto;
import kg.aken.NaTVOrderService_RESTAPI.models.inputs.OrderInputData;
import kg.aken.NaTVOrderService_RESTAPI.models.responces.OrderResponse;

public interface OrderService extends BaseCrudService<OrdersDto, Long>{
    OrderResponse saveOrder(OrderInputData orderInputData);
}
