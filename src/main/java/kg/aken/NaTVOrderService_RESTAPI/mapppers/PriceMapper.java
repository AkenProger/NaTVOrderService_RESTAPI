package kg.aken.NaTVOrderService_RESTAPI.mapppers;

import kg.aken.NaTVOrderService_RESTAPI.models.dto.PricesDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Prices;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface PriceMapper extends BaseMapper<PricesDto, Prices>{
    PriceMapper PRICE_MAPPER = Mappers.getMapper(PriceMapper.class);
}
