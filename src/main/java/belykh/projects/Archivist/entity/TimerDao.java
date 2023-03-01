package belykh.projects.Archivist.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "timer")
@Table(name = "timers")
@Data
public class TimerDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_object")
    private String typeObject;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "total_time")
    private Long totalTime;

    public TimerDao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeObject() {
        return typeObject;
    }

    public void setTypeObject(String typeObject) {
        this.typeObject = typeObject;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        return "TimerDao{" +
                "id=" + id +
                ", typeObject='" + typeObject + '\'' +
                ", startDate=" + startDate +
                ", totalTime=" + totalTime +
                '}';
    }
}
