package core;

import models.Heatmap;
import models.Organization;
import models.User;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RestClient {
    private final Client client = ClientBuilder.newClient(new ClientConfig());


    private static final SimpleDateFormat month = new SimpleDateFormat(
            "MM");


    public User getHeatmap(User user) {
        String url = String.format("https://372b8225-a01d-4b5f-95d6-2a6a080c109f.mock.pstmn.io/user/%s/heatmap", user.getUserId());
        List<Heatmap> result = client.target(url).request(MediaType.APPLICATION_JSON_TYPE).get(new GenericType<>() {
        });

        result.forEach(heatmap -> {
            heatmap.setMonth(month.format(new Date(heatmap.getTimestamp() * 1000)));
        });

        user.setHeatmap(result);

        return user;
    }

    public List<User> getOrgUsers(String org) {
        String url = String.format("https://372b8225-a01d-4b5f-95d6-2a6a080c109f.mock.pstmn.io/user/%s/heatmap", org);
        return client.target(url).request(MediaType.APPLICATION_JSON_TYPE).get(new GenericType<>() {
        });
    }

    public List<Organization> getAllOrgs() {
        String url = "https://try.gitea.io/api/v1/orgs?limit=50";
        return client.target(url).request(MediaType.APPLICATION_JSON_TYPE).get(new GenericType<>() {
        });
    }

}
