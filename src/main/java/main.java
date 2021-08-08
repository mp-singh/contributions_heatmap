import core.RestClient;
import models.Organization;
import models.User;

import java.util.List;

public class main {
    public static void main(String[] args) {
        RestClient client = new RestClient();
        List<Organization> orgs = client.getAllOrgs();
        orgs.forEach(org -> {
           List<User> users = client.getOrgUsers(org.getName());
           users.forEach(user -> {
               System.out.println(client.getHeatmap(user));
           });
        });

    }
}