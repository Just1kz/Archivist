package belykh.projects.Archivist.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ReportDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_object")
    private String typeObject;

    @Column(name = "count_timers")
    private Integer countTimer;

    @Column(name = "total_time")
    private Long totalTime;

    public ReportDao() {
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

    public Integer getCountTimer() {
        return countTimer;
    }

    public void setCountTimer(Integer countTimer) {
        this.countTimer = countTimer;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }
}
