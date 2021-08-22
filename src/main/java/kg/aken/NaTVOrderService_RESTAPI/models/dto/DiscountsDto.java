package kg.aken.NaTVOrderService_RESTAPI.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class DiscountsDto {
    private Long id;
    private ChannelsDto channels;
    private double percent;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date start_date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date end_date;
    private int min_day;
}
