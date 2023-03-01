package belykh.projects.Archivist.mapping;

import belykh.projects.Archivist.entity.ReportDao;
import belykh.projects.TelegramBot.dto.ReportDto;
import belykh.projects.TelegramBot.service.Dishes;
import org.mapstruct.Mapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Mapper(componentModel = "spring")
public abstract class ReportMapper {
    public ReportDto toDto(ReportDao reportDao) {
        Date date = new Date(reportDao.getTotalTime());
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));

        return ReportDto.builder()
                .countTimer(reportDao.getCountTimer())
                .typeObject(Dishes.getAttributesByMapper(reportDao.getTypeObject(), Dishes::getFirstRusName))
                .totalTime(dateFormat.format(date))
                .build();
    }
}
