package kg.aken.NaTVOrderService_RESTAPI.models.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class OrderDetailsDto {
    private Long id;
    private ChannelsDto channels;
    private double price;


}
