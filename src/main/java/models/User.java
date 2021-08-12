package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @JsonProperty(value = "id")
    private Long id;
    @JsonProperty(value = "login")
    private String login;
    private List<Heatmap> heatmaps;

    public User() {
    }

    public User(Long id, String login, List<Heatmap> heatmaps) {
        this.id = id;
        this.login = login;
        this.heatmaps = heatmaps;
    }

    public List<Heatmap> getHeatmaps() {
        return heatmaps;
    }

    public void setHeatmap(List<Heatmap> heatmaps) {
        this.heatmaps = heatmaps;
    }

    public Long getUserId() {
        return id;
    }

    public void setUserId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return login;
    }

    public void setUserName(String name) {
        this.login = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + login + '\'' +
                ", heatmaps=" + heatmaps +
                '}';
    }
}
