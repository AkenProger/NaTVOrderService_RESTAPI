package kg.aken.NaTVOrderService_RESTAPI.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "prices")
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "channel_id")
    private Channels channels;
    private Date start_date;
    private Date end_date;
    private double price;

}
