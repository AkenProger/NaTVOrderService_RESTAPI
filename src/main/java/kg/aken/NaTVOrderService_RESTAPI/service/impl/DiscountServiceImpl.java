package kg.aken.NaTVOrderService_RESTAPI.service.impl;

import kg.aken.NaTVOrderService_RESTAPI.dao.DiscountRepository;
import kg.aken.NaTVOrderService_RESTAPI.mapppers.DiscountMapper;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.DiscountsDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Discounts;
import kg.aken.NaTVOrderService_RESTAPI.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    DiscountRepository discountRepository;
    DiscountMapper discountMapper = DiscountMapper.DISCOUNT_MAPPER;

    @Override
    public DiscountsDto save(DiscountsDto discountsDto) {
        System.out.println("dto min day = "+discountsDto.getMin_day());
        Discounts discounts = discountMapper.toEntity(discountsDto);
        discounts.setMin_day(discountsDto.getMin_day());
        System.out.println("min day dis = "+discounts.getMin_day());
        discounts = discountRepository.save(discounts);
        return discountMapper.toDto(discounts);
    }

    @Override
    public DiscountsDto update(DiscountsDto discountsDto) {
        return null;
    }

    @Override
    public List<DiscountsDto> findAll() {
        return discountMapper.toDtoList(discountRepository.findAll());
    }

    @Override
    public DiscountsDto findById(Long id) {
        return discountMapper.toDto(discountRepository.findById(id).get());
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public DiscountsDto findDiscountByChannelId(Long id) {
        return discountMapper.toDto(discountRepository.findDiscountByChannelId(id));
    }
}
