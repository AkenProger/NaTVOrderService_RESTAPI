package kg.aken.NaTVOrderService_RESTAPI.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "channels_tv")
public class Channels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String photo_url;
    private boolean active;
    private int order_num;
}
