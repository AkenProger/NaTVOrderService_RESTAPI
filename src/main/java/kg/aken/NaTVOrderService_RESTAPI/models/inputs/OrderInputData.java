package kg.aken.NaTVOrderService_RESTAPI.models.inputs;

import lombok.Data;

import java.util.List;

@Data
public class OrderInputData {

    private String text;
    private String clientName;
    private String phone;
    private String email;
    private List<ChannelInputData> channels;
}
