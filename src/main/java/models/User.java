package models;

import java.util.List;

public class User {
    private String userId;
    private List<Heatmap> heatmaps;

    public User(String userId, List<Heatmap> heatmaps) {
        this.userId = userId;
        this.heatmaps = heatmaps;
    }

    public List<Heatmap> getHeatmaps() {
        return heatmaps;
    }

    public void setHeatmap(List<Heatmap> heatmap) {
        this.heatmaps = heatmaps;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
