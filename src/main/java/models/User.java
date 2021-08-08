package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String id;
    private String login;
    private List<Heatmap> heatmaps;

    public User(String id, String login, List<Heatmap> heatmaps) {
        this.id = id;
        this.login = login;
        this.heatmaps = heatmaps;
    }

    public List<Heatmap> getHeatmaps() {
        return heatmaps;
    }

    public void setHeatmap(List<Heatmap> heatmap) {
        this.heatmaps = heatmaps;
    }

    public String getUserId() {
        return id;
    }

    public void setUserId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + id + '\'' +
                ", heatmaps=" + heatmaps +
                '}';
    }
}
