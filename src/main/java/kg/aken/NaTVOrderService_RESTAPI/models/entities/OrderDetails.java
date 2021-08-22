package kg.aken.NaTVOrderService_RESTAPI.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_details")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "channel_id")
    private Channels channels;
    @ManyToOne
    @JoinColumn(name = "id_orders")
    private Orders order;
    private double price;


}
