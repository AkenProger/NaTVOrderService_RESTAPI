package kg.aken.NaTVOrderService_RESTAPI.service.impl;

import kg.aken.NaTVOrderService_RESTAPI.dao.ChannelRepository;
import kg.aken.NaTVOrderService_RESTAPI.mapppers.ChannelMapper;
import kg.aken.NaTVOrderService_RESTAPI.models.dto.ChannelsDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Channels;
import kg.aken.NaTVOrderService_RESTAPI.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    ChannelRepository channelRepository;

    ChannelMapper channelMapper = ChannelMapper.CHANNEL_MAPPER;

    @Override
    public ChannelsDto save(ChannelsDto channelsDto) {
        Channels channels = channelMapper.toEntity(channelsDto);
        channels = channelRepository.save(channels);
        return channelMapper.toDto(channels);
    }

    @Override
    public ChannelsDto update(ChannelsDto channelsDto) {
        return null;
    }

    @Override
    public List<ChannelsDto> findAll() {
        return channelMapper.toDtoList(channelRepository.findAll());
    }

    @Override
    public ChannelsDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
