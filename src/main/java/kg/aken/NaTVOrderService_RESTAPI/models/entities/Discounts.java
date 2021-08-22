package kg.aken.NaTVOrderService_RESTAPI.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "discounts")
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_channels")
    private Channels channels;
    private double percent;
    private Date start_date;
    private Date end_date;
    private int min_day;
}
