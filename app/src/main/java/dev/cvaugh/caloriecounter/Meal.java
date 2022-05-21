package dev.cvaugh.caloriecounter;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    public MealType type;
    public long timestamp;
    public List<Food> foods = new ArrayList<Food>();
}
