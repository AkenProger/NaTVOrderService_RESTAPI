package kg.aken.NaTVOrderService_RESTAPI.mapppers;

import kg.aken.NaTVOrderService_RESTAPI.models.dto.DiscountsDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Discounts;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DiscountMapper extends BaseMapper<DiscountsDto, Discounts>{
    DiscountMapper DISCOUNT_MAPPER = Mappers.getMapper(DiscountMapper.class);
}
