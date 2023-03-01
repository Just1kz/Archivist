package belykh.projects.Archivist.repository;

import belykh.projects.Archivist.entity.TimerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimerRepository extends JpaRepository<TimerDao, Long> {
}
