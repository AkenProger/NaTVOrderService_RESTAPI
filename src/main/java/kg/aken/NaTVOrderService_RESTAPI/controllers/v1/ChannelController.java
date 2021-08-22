package kg.aken.NaTVOrderService_RESTAPI.controllers.v1;

import kg.aken.NaTVOrderService_RESTAPI.controllers.BaseCrudController;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.ChannelsDto;
import kg.aken.NaTVOrderService_RESTAPI.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/channels")
public class ChannelController implements BaseCrudController<ChannelsDto, Long> {

    @Autowired
    ChannelService channelService;

    @Override
    public ChannelsDto save(ChannelsDto channelsDto) {
        return channelService.save(channelsDto);
    }

    @Override
    public List<ChannelsDto> findAll() {
        return channelService.findAll();
    }

    @Override
    public ChannelsDto update(ChannelsDto channelsDto) {
        return null;
    }

    @Override
    public ChannelsDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

}
