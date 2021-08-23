package kg.aken.NaTVOrderService_RESTAPI.service.impl;

import kg.aken.NaTVOrderService_RESTAPI.dao.ChannelRepository;
import kg.aken.NaTVOrderService_RESTAPI.dao.OrderDetailsRepository;
import kg.aken.NaTVOrderService_RESTAPI.dao.OrderRepository;
import kg.aken.NaTVOrderService_RESTAPI.dao.PriceRepository;
import kg.aken.NaTVOrderService_RESTAPI.enums.OrderStatus;
import kg.aken.NaTVOrderService_RESTAPI.mapppers.ChannelMapper;
import kg.aken.NaTVOrderService_RESTAPI.mapppers.OrderDetailMapper;
import kg.aken.NaTVOrderService_RESTAPI.mapppers.OrderMapper;
import kg.aken.NaTVOrderService_RESTAPI.mapppers.PriceMapper;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.OrderDetailsDto;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.OrdersDto;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.PricesDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Orders;
import kg.aken.NaTVOrderService_RESTAPI.models.inputs.ChannelInputData;
import kg.aken.NaTVOrderService_RESTAPI.models.inputs.OrderInputData;
import kg.aken.NaTVOrderService_RESTAPI.models.responces.OrderResponse;
import kg.aken.NaTVOrderService_RESTAPI.service.DiscountService;
import kg.aken.NaTVOrderService_RESTAPI.service.OrderDetailService;
import kg.aken.NaTVOrderService_RESTAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

//TODO Надо добавить функцию для получении функции
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDetailService orderDetailService;

    @Autowired
    DiscountService discountService;


    private OrderRepository orderRepository;
    private OrderDetailsRepository orderDetailsRepository;
    private ChannelRepository channelRepository;
    private PriceRepository priceRepository;
    private OrderMapper orderMapper = OrderMapper.ORDER_MAPPER;
    private OrderDetailMapper orderDetailMapper = OrderDetailMapper.ORDER_DETAIL_MAPPER;
    private ChannelMapper channelMapper = ChannelMapper.CHANNEL_MAPPER;
    private PriceMapper priceMapper = PriceMapper.PRICE_MAPPER;
    public OrderServiceImpl(OrderRepository orderRepository,
                            OrderDetailsRepository orderDetailsRepository,
                            ChannelRepository channelRepository,
                            PriceRepository priceRepository) {
        this.orderRepository = orderRepository;
        this.orderDetailsRepository = orderDetailsRepository;
        this.channelRepository = channelRepository;
        this.priceRepository = priceRepository;
    }

    @Override
    public OrderResponse saveOrder(OrderInputData orderInputData) {
        OrderResponse orderResponse = new OrderResponse();

        Orders orders = new Orders();
        orders.setEmail(orderInputData.getEmail());
        orders.setPhone(orderInputData.getPhone());
        orders.setAdd_date(new Date());
        orders.setEdit_date(new Date());
        orders.setText(orderInputData.getText());
        orders.setName(orderInputData.getClientName());
        orders.setOrderStatus(OrderStatus.PROCESS);
        OrdersDto ordersDto = orderMapper.toDto(orderRepository.save(orders));
        String textLength = ordersDto.getText().replaceAll("\\s+", "");

        List<ChannelInputData> channelInputData = orderInputData.getChannels();
        channelInputData.stream().forEach(x -> {
            OrderDetailsDto orderDetailsDto = new OrderDetailsDto();
            orderDetailsDto.setOrdersDto(ordersDto);
            orderDetailsDto.setChannels(channelMapper.toDto(channelRepository.findById(x.getChannelId()).get()));

            PricesDto pricesDto = priceMapper.toDto(priceRepository.findPriceByChannelId(x.getChannelId()));
            if (pricesDto != null) {
                double sumOfSymbols = textLength.length() * pricesDto.getPrice();
                double allSum = sumOfSymbols * x.getDays().size();
                orderDetailsDto.setPrice(allSum);
                OrderDetailsDto orderDetailsDto1 = orderDetailService.save(orderDetailsDto);
                orderResponse.setOrderCost(allSum);
                orderResponse.setAddText(ordersDto.getText());
            }
        });

        return orderResponse;
    }

    @Override
    public OrdersDto save(OrdersDto ordersDto) {
        Orders orders = orderMapper.toEntity(ordersDto);
        orders = orderRepository.save(orders);
        return orderMapper.toDto(orders);
    }

    @Override
    public OrdersDto update(OrdersDto ordersDto) {
        return null;
    }

    @Override
    public List<OrdersDto> findAll() {
        return orderMapper.toDtoList(orderRepository.findAll());
    }

    @Override
    public OrdersDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
