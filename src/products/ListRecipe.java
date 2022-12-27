package products;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListRecipe {

    private final Map<Recipe, Integer> recipes = new HashMap<>();

    public ListRecipe(Map<Recipe, Integer> recipeMap) {

    }


    public void add(Recipe recipe, int quantity) {
        if (recipes.containsKey(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        recipes.put(recipe, quantity);
    }

    public void add(Recipe recipe) {
        add(recipe, 1);
    }

    @Override
    public String toString() {
        return " " +
                " Рецепт " + recipes +
                ' ';
    }
}
