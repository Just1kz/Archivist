package belykh.projects.Archivist.service.impl;

import belykh.projects.Timer.dto.TimerDto;
import belykh.projects.Archivist.mapping.TimerMapper;
import belykh.projects.Archivist.repository.TimerRepository;
import belykh.projects.Archivist.service.TimerService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class TimerServiceImpl implements TimerService {

    private final TimerRepository timerRepository;
    private final TimerMapper timerMapper;

    @Autowired
    public TimerServiceImpl(TimerRepository timerRepository,
                            TimerMapper timerMapper) {
        this.timerRepository = timerRepository;
        this.timerMapper = timerMapper;
    }

    @Override
    public void save(TimerDto timerDto) {
        log.debug("TimerServiceImpl call method save with timerDto = " + timerDto);
        log.debug(belykh.projects.Timer.service.impl.TimerServiceImpl.getTimeStringByDataAndPattern(timerDto.getTotalTime(), "HH:mm:ss"));
        timerRepository.save(timerMapper.toEntity(timerDto));
        log.debug("сущность сохранена");
    }
}
