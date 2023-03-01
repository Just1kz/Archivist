package belykh.projects.Archivist.mapping;

import belykh.projects.Timer.dto.TimerDto;
import belykh.projects.Archivist.entity.TimerDao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TimerMapper {
    TimerDao toEntity(TimerDto timerDto);
}
