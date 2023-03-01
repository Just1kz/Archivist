package belykh.projects.Archivist.service.impl;

import belykh.projects.Archivist.mapping.ReportMapper;
import belykh.projects.Archivist.repository.ReportRepository;
import belykh.projects.Archivist.service.ReportService;
import belykh.projects.TelegramBot.dto.ReportDto;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;
    private final ReportMapper reportMapper;

    @Autowired
    public ReportServiceImpl(ReportRepository reportRepository,
                             ReportMapper reportMapper) {
        this.reportRepository = reportRepository;
        this.reportMapper = reportMapper;
    }

    @Override
    public List<ReportDto> getReportForWeek(Long periodReport) {
        //чтобы сделать динамику лучше сделать передачу этих данных через тело запроса -
        // но это к вопросу расширения, мб перебор для данной задачи
        Date date = new Date(System.currentTimeMillis() - 604800000L);
        log.debug(System.currentTimeMillis());
        log.debug(date);
        return reportRepository.getReportDaoByDate(date).stream()
                .map(reportMapper::toDto)
                .collect(Collectors.toList());
    }
}

