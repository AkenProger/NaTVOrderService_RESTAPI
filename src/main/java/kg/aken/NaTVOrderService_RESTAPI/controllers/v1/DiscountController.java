package kg.aken.NaTVOrderService_RESTAPI.controllers.v1;

import kg.aken.NaTVOrderService_RESTAPI.controllers.BaseCrudController;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.DiscountsDto;
import kg.aken.NaTVOrderService_RESTAPI.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/discount")
public class DiscountController implements BaseCrudController<DiscountsDto, Long> {

    @Autowired
    DiscountService discountService;

    @Override
    public DiscountsDto save(DiscountsDto discountsDto) {
        return discountService.save(discountsDto);
    }

    @Override
    public List<DiscountsDto> findAll() {
        return discountService.findAll();
    }

    @Override
    public DiscountsDto update(DiscountsDto discountsDto) {
        return null;
    }

    @Override
    public DiscountsDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
