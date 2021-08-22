package kg.aken.NaTVOrderService_RESTAPI.models.inputs;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ChannelInputData {
    private Long channelId;
    @JsonFormat(shape = JsonFormat.Shape.ARRAY, pattern="dd-MM-yyyy")
    private List<Date> days;
}
