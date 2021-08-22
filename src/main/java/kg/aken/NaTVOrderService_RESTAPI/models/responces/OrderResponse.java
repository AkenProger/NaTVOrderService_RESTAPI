package kg.aken.NaTVOrderService_RESTAPI.models.responces;

import lombok.Data;
import java.util.List;
@Data
public class OrderResponse {
    private Long paymentCode;
    private double orderCost;
    private String addText;
    private List<ChannelOrderResponse> channels;
}
