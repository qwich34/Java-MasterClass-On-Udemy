public class TestMealOrderClass {
    public static void main(String[] args) {
//        Item coke = new Item("coke","drink",1.5);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Avocado","Topping",1.5);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("Cheese","ham","avocado");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();
//        MealOrder secondMeal = new MealOrder("Turkey", "7-Up","chili");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("DELUXE", "7-Up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO","MAYO","CHEESE","HAM","SALT");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
