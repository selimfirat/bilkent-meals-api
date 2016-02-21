import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by mrsfy on 19.02.2016.
 */
public class MealsScraper {
    private Document doc;
    private Elements fixMenu;
    private Elements alternativeMenu;
    public MealsScraper(){
        try {
            doc = Jsoup.connect("http://kafemud.bilkent.edu.tr/monu_eng.html").get();
            Elements mealContainers = doc.select("p[align=center] + table > tbody");
            fixMenu = mealContainers.get(0).select("tr:gt(0)");
            alternativeMenu = mealContainers.get(1).select("tr:gt(0)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Elements getFix(){
        return fixMenu;
    }
    public Elements getAlternative(){
        return alternativeMenu;
    }


}
