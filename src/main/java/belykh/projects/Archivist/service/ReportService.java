package belykh.projects.Archivist.service;

import belykh.projects.TelegramBot.dto.ReportDto;

import java.util.List;

public interface ReportService {

    List<ReportDto> getReportForWeek(Long periodReport);
}
