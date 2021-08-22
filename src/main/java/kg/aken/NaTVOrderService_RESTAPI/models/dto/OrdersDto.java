package kg.aken.NaTVOrderService_RESTAPI.models.dto;

import kg.aken.NaTVOrderService_RESTAPI.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class OrdersDto {

    private Long id;
    private String text;
    private String phone;
    private String email;
    private double total_price;
    private Date edit_date;
    private Date add_date;
    private OrderStatus orderStatus;
}

