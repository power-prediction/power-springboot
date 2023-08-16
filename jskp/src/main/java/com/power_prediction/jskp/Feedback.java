package com.power_prediction.jskp;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Feedback {
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
    @Column(name ="power_use(kWh)",columnDefinition = "Float")
    private Double power_use;
    
    private LocalDateTime date;
}
