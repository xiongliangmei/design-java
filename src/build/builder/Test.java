package build.builder;

public class Test {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showTtems();

        Meal meals = mealBuilder.prepareNonVegMeal();
        meals.showTtems();
    }
}
