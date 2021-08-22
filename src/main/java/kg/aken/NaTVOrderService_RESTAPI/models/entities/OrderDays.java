package kg.aken.NaTVOrderService_RESTAPI.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "order_days")
public class OrderDays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date day;
    @ManyToOne
    @JoinColumn(name = "order_detail_id")
    OrderDetails orderDetails;

}
