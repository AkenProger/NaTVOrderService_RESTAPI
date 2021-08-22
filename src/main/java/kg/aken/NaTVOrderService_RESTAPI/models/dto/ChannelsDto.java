package kg.aken.NaTVOrderService_RESTAPI.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class ChannelsDto {
    private Long id;
    private String name;
    private String photo_url;
    private boolean active;
    private int order_num;
}
