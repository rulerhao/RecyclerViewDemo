package com.rulhouse.recyclerviewdemo1;

public class Measurement {
    private Float temp;
    private Long timeStamp;

    public Measurement(Float temp, Long timeStamp) {
        this.temp = temp;
        this.timeStamp = timeStamp;
    }

    void setTemp(Float temp) {
        this.temp = temp;
    }

    Float getTemp() {
        return this.temp;
    }

    void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    Long getTimeStamp() {
        return this.timeStamp;
    }
}
