import com.google.gson.Gson;
import static spark.Spark.get;
import static spark.Spark.port;

public class Main {
    public static void main(String[] args){
        String port = System.getenv().get("PORT");
        port(port != null ? Integer.parseInt(port) : 9091);
        Gson gson = new Gson();
        MealFactory mealFactory = new MealFactory();
        get("/", "application/json", (req, res) -> mealFactory.getMealList(), gson::toJson);
        get("/today", "application/json", (req, res) -> mealFactory.getMealOfToday(), gson::toJson);
    }
}
