import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MealFactory {

    private List<Meal> mealList;

    public MealFactory(){
        MealsScraper meals = new MealsScraper();
        mealList = new ArrayList<>();
        // Plus 2 due to rowspan of date column
        for (int i = 0; i < 14; i+=2) {
            Meal meal = new Meal();
            Elements fixLunchTds = meals.getFix().get(i).getElementsByTag("td");
            Elements fixDinnerTds = meals.getFix().get(i + 1).getElementsByTag("td");
            Elements alternativeTds = meals.getAlternative().get(i / 2).getElementsByTag("td");
            // Scrape Date
            String date = fixLunchTds.get(0).text().split(" ")[0];
            meal.setDate(date);


            // Scrape Fix Lunch Meals
            meal.setLunch(scrapeMeals(fixLunchTds.get(1)));
            meal.setDinner(scrapeMeals(fixDinnerTds.get(0)));
            meal.setAlternative(scrapeMeals(alternativeTds.get(1)));

            // Scrape Fix Lunch Nutritions
            String[] nutritions = fixLunchTds.get(2).text().replaceAll("[^\\d\\s]", "").trim().replaceAll("\\s{2,}", " ").split(" ");
            Meal.NutritionFacts nutritionFacts = meal.new NutritionFacts();
            nutritionFacts.setEnergyByCal(Integer.parseInt(nutritions[0]));
            nutritionFacts.setCarbohydratePercentage(Integer.parseInt(nutritions[1]));
            nutritionFacts.setProteinPercentage(Integer.parseInt(nutritions[2]));
            nutritionFacts.setFatPercentage(Integer.parseInt(nutritions[3]));
            meal.setNutritionFacts(nutritionFacts);

            mealList.add(meal);
        }
    }

    public Meal getMealOfToday(){
        Date now = new Date();
        String today = new SimpleDateFormat("dd.MM.yyyy").format(now);
        for (Meal meal : getMealList()){
            if (meal.getDate().equals(today)){
                return meal;
            }
        }
        return null;
    }

    public List<Meal> getMealList(){
        return mealList;
    }
    private List<String[]> scrapeMeals(Element tds) {
        List<String[]> result = new ArrayList<>();
        String[] lines = tds.toString().replaceAll("&nbsp;", "").split("<br>");
        for (int a = 1; a < lines.length; a++){
            String line = Jsoup.parse(lines[a]).text();
            System.out.println(line);
            // String arrays consist of foods by 2 language
            if (line.contains("veya / or") && lines.length == 5){

                String[] secondLine = line.replace("veya / or veya / or", "veya / or").split("veya / or");
                String[] secondLineSplitted0 = secondLine[0].split("/");
                String[] food0 = new String[]{
                        secondLineSplitted0[0].trim(),
                        secondLineSplitted0[1].trim()
                };
                String[] secondLineSplitted1 = secondLine[1].split("/");
                System.out.println(secondLineSplitted1[1]);
                String[] food1 = new String[]{
                        secondLineSplitted1[0].trim(),
                        secondLineSplitted1[1].trim()
                };
                result.add(food0);
                result.add(food1);
            }else{
                String[] lineSplitted = line.replaceAll("veya / or", "").split("/");
                String[] food = new String[]{
                        lineSplitted[0].trim(),
                        lineSplitted[1].trim()
                };
                result.add(food);
            }
        }
        return result;
    }
}

