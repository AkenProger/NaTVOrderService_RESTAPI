package kg.aken.NaTVOrderService_RESTAPI.models.entities;

import kg.aken.NaTVOrderService_RESTAPI.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String phone;
    private String email;
    private double total_price;
    private Date edit_date;
    private Date add_date;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}

