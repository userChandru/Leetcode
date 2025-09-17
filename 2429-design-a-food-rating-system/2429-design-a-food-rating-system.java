class FoodRatings {

    HashMap<String, String> foodCuisines; 
    HashMap<String, Integer> foodRatings; 
    HashMap<String, TreeSet<String>> cuisineFoods; 

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodCuisines = new HashMap<>();
        foodRatings = new HashMap<>();
        cuisineFoods = new HashMap<>();
        int n=foods.length;
        for(int i=0; i<n; i++){
            foodCuisines.put(foods[i], cuisines[i]);
            foodRatings.put(foods[i], ratings[i]);
        }
        for(int i=0; i<n; i++){
            String temp = cuisines[i];
            cuisineFoods.putIfAbsent(temp, new TreeSet<>((a,b) -> {
                int x = foodRatings.get(a);
                int y = foodRatings.get(b);
                if(x != y)
                    return y-x;
                return a.compareTo(b);
            }));
            cuisineFoods.get(temp).add(foods[i]);
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisines.get(food);
        TreeSet<String> temp = cuisineFoods.get(cuisine);

        temp.remove(food);
        foodRatings.put(food, newRating);
        temp.add(food);
    }
    
    public String highestRated(String cuisine) {
        return cuisineFoods.get(cuisine).first();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */