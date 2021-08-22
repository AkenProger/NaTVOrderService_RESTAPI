package kg.aken.NaTVOrderService_RESTAPI.models.inputs;

import lombok.Data;

import java.util.List;

@Data
public class OrderInputData {
    private Long id;
    private String text;
    private String phone;
    private String email;
    private List<ChannelInputData> channels;
}
