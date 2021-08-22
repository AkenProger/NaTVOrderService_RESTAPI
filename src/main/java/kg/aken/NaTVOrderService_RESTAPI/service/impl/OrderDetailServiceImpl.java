package kg.aken.NaTVOrderService_RESTAPI.service.impl;

import kg.aken.NaTVOrderService_RESTAPI.dao.OrderDetailsRepository;
import kg.aken.NaTVOrderService_RESTAPI.mapppers.OrderDetailMapper;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.OrderDetailsDto;
import kg.aken.NaTVOrderService_RESTAPI.service.OrderDetailService;

import java.util.List;

public class OrderDetailServiceImpl implements OrderDetailService {

    OrderDetailsRepository orderDetailsRepository;
    public OrderDetailServiceImpl(OrderDetailsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }

    OrderDetailMapper orderDetailMapper = OrderDetailMapper.ORDER_DETAIL_MAPPER;


    @Override
    public OrderDetailsDto save(OrderDetailsDto orderDetailsDto) {
        return orderDetailMapper.toDto(orderDetailsRepository.save(orderDetailMapper.toEntity(orderDetailsDto)));
    }

    @Override
    public OrderDetailsDto update(OrderDetailsDto orderDetailsDto) {
        return null;
    }

    @Override
    public List<OrderDetailsDto> findAll() {
        return orderDetailMapper.toDtoList(orderDetailsRepository.findAll());
    }

    @Override
    public OrderDetailsDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
