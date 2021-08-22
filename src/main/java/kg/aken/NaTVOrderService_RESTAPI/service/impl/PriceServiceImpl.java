package kg.aken.NaTVOrderService_RESTAPI.service.impl;

import kg.aken.NaTVOrderService_RESTAPI.dao.PriceRepository;
import kg.aken.NaTVOrderService_RESTAPI.mapppers.PriceMapper;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.PricesDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Prices;
import kg.aken.NaTVOrderService_RESTAPI.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PriceRepository priceRepository;
    PriceMapper priceMapper = PriceMapper.PRICE_MAPPER;

    @Override
    public PricesDto save(PricesDto pricesDto) {
        Prices prices = priceMapper.toEntity(pricesDto);
        prices = priceRepository.save(prices);
        return priceMapper.toDto(prices);
    }

    @Override
    public PricesDto update(PricesDto pricesDto) {
        return null;
    }

    @Override
    public List<PricesDto> findAll() {
        return priceMapper.toDtoList(priceRepository.findAll());
    }

    @Override
    public PricesDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
