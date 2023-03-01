package belykh.projects.Archivist.repository;

import belykh.projects.Archivist.entity.ReportDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<ReportDao, Long> {

    @Query(value = "select row_number() over () as id,  type_object, count(*) as count_timers, sum(total_time) as total_time " +
            "from timers " +
            "where start_date > :date  " +
            "group by type_object ", nativeQuery = true)
    List<ReportDao> getReportDaoByDate(@Param("date") Date date);
}
