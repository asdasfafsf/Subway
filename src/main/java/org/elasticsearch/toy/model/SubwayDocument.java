package org.elasticsearch.toy.model;

public class SubwayDocument {
    private String code;
    private String station;
    private String chosung;
    private String jamo;
    private String engtokor;
    private String line;
    private String excode;

    @Override
    public String toString() {
        return "SubwayDocument{" +
                "code='" + code + '\'' +
                ", station='" + station + '\'' +
                ", chosung='" + chosung + '\'' +
                ", jamo='" + jamo + '\'' +
                ", engtokor='" + engtokor + '\'' +
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

    public String getChosung() {
        return chosung;
    }

    public String getJamo() {
        return jamo;
    }

    public String getEngtokor() {
        return engtokor;
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

    public void setChosung(String chosung) {
        this.chosung = chosung;
    }

    public void setJamo(String jamo) {
        this.jamo = jamo;
    }

    public void setEngtokor(String engtokor) {
        this.engtokor = engtokor;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setExcode(String excode) {
        this.excode = excode;
    }
}