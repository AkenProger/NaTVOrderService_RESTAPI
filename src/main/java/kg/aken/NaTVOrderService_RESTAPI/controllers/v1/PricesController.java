package kg.aken.NaTVOrderService_RESTAPI.controllers.v1;

import kg.aken.NaTVOrderService_RESTAPI.controllers.BaseCrudController;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.PricesDto;
import kg.aken.NaTVOrderService_RESTAPI.service.BaseCrudService;
import kg.aken.NaTVOrderService_RESTAPI.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/prices")
public class PricesController implements BaseCrudController<PricesDto, Long> {
    @Autowired
    PriceService priceService;

    @Override
    public PricesDto save(PricesDto pricesDto) {
        return priceService.save(pricesDto);
    }

    @Override
    public PricesDto update(PricesDto pricesDto) {
        return null;
    }

    @Override
    public List<PricesDto> findAll() {
        return priceService.findAll();
    }

    @Override
    public PricesDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
