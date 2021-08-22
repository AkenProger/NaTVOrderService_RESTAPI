package kg.aken.NaTVOrderService_RESTAPI.mapppers;

import kg.aken.NaTVOrderService_RESTAPI.models.dto.OrderDaysDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.OrderDays;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDayMapper extends BaseMapper<OrderDaysDto, OrderDays> {
    OrderDayMapper ORDER_DAY_MAPPER = Mappers.getMapper(OrderDayMapper.class);
}
