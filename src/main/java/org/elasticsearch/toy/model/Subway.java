package org.elasticsearch.toy.model;

import com.opencsv.bean.CsvBindAndJoinByPosition;
import com.opencsv.bean.CsvBindByPosition;

public class Subway {

    @CsvBindByPosition(position = 0)
    private String code;
    @CsvBindByPosition(position = 1)
    private String station;
    @CsvBindByPosition(position = 2)
    private String line;
    @CsvBindByPosition(position = 3)
    private String excode;

    @Override
    public String toString() {
        return "Subway{" +
                "code='" + code + '\'' +
                ", station='" + station + '\'' +
                ", line='" + line + '\'' +
                ", excode='" + excode + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public String getStation() {
        return station;
    }

    public String getLine() {
        return line;
    }

    public String getExcode() {
        return excode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setExcode(String excode) {
        this.excode = excode;
    }
}
