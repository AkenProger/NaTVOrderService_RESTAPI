package kg.aken.NaTVOrderService_RESTAPI.models.responces;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class ChannelOrderResponse {
    private String channelName;
    private double costPerChannel;
    @JsonFormat(shape = JsonFormat.Shape.ARRAY, pattern="dd-MM-yyyy")
    private List<Date> dates;
}
