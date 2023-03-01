package belykh.projects.Archivist.controllers;

import belykh.projects.TelegramBot.dto.ReportDto;
import belykh.projects.Timer.dto.TimerDto;
import belykh.projects.Archivist.service.ReportService;
import belykh.projects.Archivist.service.TimerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arch")
public class ArchivistController {

    private final TimerService timerService;
    private final ReportService reportService;

    @Autowired
    public ArchivistController(TimerService timerService,
                               ReportService reportService) {
        this.timerService = timerService;
        this.reportService = reportService;
    }

    @PostMapping("/save")
    public String saveTimer(@RequestBody TimerDto timerDto) {
        timerService.save(timerDto);
        return "Таймер успешно сохранен";
    }

    @GetMapping("/report/{periodReport}")
    public List<ReportDto> getReportForLastWeek(@PathVariable Long periodReport) {
        return reportService.getReportForWeek(periodReport);
    }
}
