package com.power_prediction.jskp;

public class Power {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private Float humidity;

    private Integer year;

    private Integer month;

    private Integer day;

    private Integer hour;

    private String buiding_type;

}

