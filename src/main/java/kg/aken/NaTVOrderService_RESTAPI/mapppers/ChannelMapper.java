package kg.aken.NaTVOrderService_RESTAPI.mapppers;

import kg.aken.NaTVOrderService_RESTAPI.models.dto.ChannelsDto;
import kg.aken.NaTVOrderService_RESTAPI.models.entities.Channels;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChannelMapper extends BaseMapper<ChannelsDto, Channels>{
    ChannelMapper CHANNEL_MAPPER = Mappers.getMapper(ChannelMapper.class);
}
