import core.GiteaClient;
import models.Organization;
import models.User;

import java.util.Collections;
import java.util.List;

public class ContributionsHeatMap {
    public static void main(String[] args) {
        GiteaClient client = new GiteaClient();
        List<Organization> orgs = client.getAllOrgs();
        orgs.forEach(org -> {
            List<User> users = client.getOrgUsers(org.getName());
            users.forEach(user -> {
                System.out.println(client.getHeatmap(user));
            });
        });
    }
}