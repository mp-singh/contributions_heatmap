package core;

import models.Heatmap;
import models.User;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class RestClient {
    String heatmapAPI = "https://372b8225-a01d-4b5f-95d6-2a6a080c109f.mock.pstmn.io/user/123/heatmap";
    private Client client = ClientBuilder.newClient();


    private static final SimpleDateFormat monthDayYearformatter = new SimpleDateFormat(
            "MMMMM dd, yyyy");


    public User getHeatmap() {
        List<Heatmap> heatMaps = client.target(heatmapAPI)
                .request(MediaType.APPLICATION_JSON_TYPE).get(new GenericType<List<Heatmap>>() {
                });

//        heatMaps.forEach(heatmap -> {
//            heatmap.setMonth(convertTimestampToDate(heatmap.getTimestamp()));
//        });
//        User user = new User();

        return new User("123", heatMaps);
    }

    private String convertTimestampToDate(Timestamp timestamp) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(timestamp.getTime());
        cal.get(Calendar.MONTH);
        System.out.println("month" + cal);
        return "month";
//        return monthDayYearformatter.format((Date) timestamp.getMonth());
    }
}
