import core.RestClient;

public class main {
    public static void main(String[] args) {
        RestClient client = new RestClient();
        System.out.println(client.getHeatmap());
    }
}