package Drinks;

public class MainDrink {
    public static void main(String[] args) {
        int drinkCapacity;

        Drink drink = new Drink();
        drink.name = "Mohito";
        drink.price = 20.00;
        drink.isAlkoholFree = false;
        drink.ingredient1 = new Ingredient();
        drink.ingredient1.name = "Rum";
        drink.ingredient1.value = 50;
        drink.ingredient2 = new Ingredient();
        drink.ingredient2.name = "Lemon";
        drink.ingredient2.value = 1;
        drink.ingredient3 = new Ingredient();
        drink.ingredient3.name = "Sugar";
        drink.ingredient3.value = 2;

        drinkCapacity = drink.ingredient1.value  + drink.ingredient2.value + drink.ingredient3.value;

        System.out.println("Informacje o drinku:");
        System.out.println("Nazwa drinka: " +  drink.name);
        System.out.println("cena: " +  drink.price + "zł");
        System.out.println("Czy jest bezalkoholowy: " +  drink.isAlkoholFree);
        System.out.println("Składniki: " +  drink.ingredient1.name + ' ' + drink.ingredient2.name + ' ' + drink.ingredient3.name);
        System.out.println("Pojemność drinka: " + drinkCapacity);
    }
}
