package kg.aken.NaTVOrderService_RESTAPI.mapppers;

import kg.aken.NaTVOrderService_RESTAPI.models.dto.OrdersDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper extends BaseMapper<OrdersDto, Orders> {
    OrderMapper ORDER_MAPPER = Mappers.getMapper(OrderMapper.class);
}
