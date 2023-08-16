package com.power_prediction.jskp;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Power {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="humidity(%)",columnDefinition = "Float")
    private Float humidity;

    @Column(columnDefinition = "Integer")
    private Integer year;
    @Column(columnDefinition = "Integer")
    private Integer month;
    @Column(columnDefinition = "Integer")
    private Integer day;
    @Column(columnDefinition = "Integer")
    private Integer hour;
    @Column(name ="surface_sum(m2)",columnDefinition = "Float")
    private Float surface_sum;
    @Column(columnDefinition = "TEXT")
    private String building_type;
    @Column(name ="power_pred(kWh)",columnDefinition = "Float")
    private Double power_pred;
    
    private LocalDateTime date;

}

