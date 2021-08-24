package kg.aken.NaTVOrderService_RESTAPI.service;

import kg.aken.NaTVOrderService_RESTAPI.models.dto.DiscountsDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Discounts;
import org.springframework.data.jpa.repository.Query;

public interface DiscountService extends BaseCrudService<DiscountsDto, Long>{
    DiscountsDto findDiscountByChannelId(Long id);
}
