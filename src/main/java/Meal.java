import java.util.List;


public class Meal {
    private String date;
    private List<String[]> lunch;
    private List<String[]> dinner;
    private List<String[]> alternative;
    private NutritionFacts nutritionFacts;
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public List<String[]> getDinner() {
        return dinner;
    }

    public void setDinner(List<String[]> dinner) {
        this.dinner = dinner;
    }

    public List<String[]> getLunch() {
        return lunch;
    }

    public void setLunch(List<String[]> lunch) {
        this.lunch = lunch;
    }

    public List<String[]> getAlternative() {
        return alternative;
    }

    public void setAlternative(List<String[]> alternative) {
        this.alternative = alternative;
    }

    public class NutritionFacts {
        private int energyByCal;
        private int carbohydratePercentage;
        private int proteinPercentage;
        private int fatPercentage;

        public int getFatPercentage() {
            return fatPercentage;
        }

        public void setFatPercentage(int fatPercentage) {
            this.fatPercentage = fatPercentage;
        }

        public int getProteinPercentage() {
            return proteinPercentage;
        }

        public void setProteinPercentage(int proteinPercentage) {
            this.proteinPercentage = proteinPercentage;
        }

        public int getCarbohydratePercentage() {
            return carbohydratePercentage;
        }

        public void setCarbohydratePercentage(int carbohydratePercentage) {
            this.carbohydratePercentage = carbohydratePercentage;
        }

        public int getEnergyByCal() {
            return energyByCal;
        }

        public void setEnergyByCal(int energyByCal) {
            this.energyByCal = energyByCal;
        }
    }
}
