package dev.cvaugh.caloriecounter;

import androidx.annotation.NonNull;

public enum MealType {
    BREAKFAST(R.string.meal_breakfast), LUNCH(R.string.meal_lunch), SUPPER(R.string.meal_supper),
    SNACK(R.string.meal_snack);

    private final int translationKey;

    private MealType(int translationKey) {
        this.translationKey = translationKey;
    }

    @NonNull
    public String toString() {
        return MainActivity.instance.getString(translationKey);
    }
}
