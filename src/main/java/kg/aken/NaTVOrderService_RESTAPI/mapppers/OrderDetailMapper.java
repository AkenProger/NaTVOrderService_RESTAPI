package kg.aken.NaTVOrderService_RESTAPI.mapppers;

import kg.aken.NaTVOrderService_RESTAPI.models.dto.OrderDetailsDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.OrderDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetailsDto, OrderDetails> {
    OrderDetailMapper ORDER_DETAIL_MAPPER = Mappers.getMapper(OrderDetailMapper.class);
}
