package models;

import java.sql.Timestamp;
import java.util.Date;

public class Heatmap {
    private Timestamp timestamp;
    private Integer contributions;
//    private String month;

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

//    public String getMonth() {
//        return month;
//    }
//
//    public void setMonth(String date) {
//        this.month = month;
//    }

    public Integer getContributions() {
        return contributions;
    }

    public void setContributions(Integer contributions) {
        this.contributions = contributions;
    }

}
