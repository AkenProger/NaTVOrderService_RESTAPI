package kg.aken.NaTVOrderService_RESTAPI.models.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class OrderDaysDto {
    private Long id;
    private Date day;
    private OrderDetailsDto orderDetails;

}
