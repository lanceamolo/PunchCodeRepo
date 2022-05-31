package com.techelevator;

public class Exercise01_StoreOrders {

    /*
    Sally's Pizza is bringing its pizza ordering system into the digital age
    to get better customer insights.

    They've encoded each of Sally's pizzas and other dishes as an integer:
	 * 10: small, cheese       20: medium, cheese       30: large, cheese
	 * 11: small, pepperoni    21: medium, pepperoni    31: large, pepperoni
	 * ---
	 * 40: calzone
	 * 41: spaghetti pie
	 * 42: baked ziti
     */

    // You can use these constants in your solutions.
    private final int SMALL_CHEESE = 10;
    private final int SMALL_PEPPERONI = 11;

    private final int MEDIUM_CHEESE = 20;
    private final int MEDIUM_PEPPERONI = 21;

    private final int LARGE_CHEESE = 30;
    private final int LARGE_PEPPERONI = 31;

    private final int CALZONE = 40;
    private final int SPAGHETTI_PIE = 41;
    private final int BAKED_ZITI = 42;

    /*
    Each customer order, consisting of one or more pizzas, is represented as an array
    where each value represents an item in that order.

    Create an "order" that contains the following items:
	 * - small, cheese (SMALL_CHEESE)
	 * - calzone (CALZONE)
	 * - large, pepperoni (LARGE_PEPPERONI)
	 * - spaghetti pie (SPAGHETTI_PIE)

	 Examples:
	 createOrder() → [10, 40, 31, 41]
     */
    public int[] createOrder() {
        return new int[] { SMALL_CHEESE, CALZONE, LARGE_PEPPERONI, SPAGHETTI_PIE };
    }

    /*
    Sally realized that she needed to know how many calzones her shop sells per day.

    Implement the logic to count the number of calzones sold per day when given an
    array representing each item that her customers ordered that day.

    Examples:
    getCalzoneSales([40, 30, 31, 40, 10]) → 2
    getCalzoneSales([30, 31, 10]) → 0
    getCalzoneSales([]) → 0
     */

    // orders = [40, 30, 31, 40, 10]
    //
    // orders[0] = 40
    // orders[1] = 30
    // orders[2] = 31
    // orders[3] = 40
    // orders[4] = 10

    // i = 4
    // i + 1

    public int getCalzoneSales(int[] orders) {
        int calzoneCount = 0;
        //for(int i = 0; 0 < 5; i++)
        //for(i = 1; 1 < 5; i++)
        //for(i = 2; 2 < 5; i++)
        //for(i = 3; 3 < 5; i++)
        //for(i = 4; 4 < 5; i++)
        //for(i = 5; 5 < 5;) loop ends here

        // for loops only run if the middle part is true

        for(int i = 0; i < orders.length; i++){
            if(orders[i] == 40){
                calzoneCount++;
            }
        }
        return calzoneCount;
    }

    /*
    Sally also needs to know the total revenue for all cheese pizzas sold on any given day.
        * Each small cheese pizza costs $8.
        * Each medium cheese pizza costs $11.
        * Each large cheese pizza costs $14.

    Implement the logic to return the total revenue of all cheese pizzas when given
    an array representing each item that her customers ordered that day.

    Examples:
    getCheesePizzaRevenue([10]) → 8
    getCheesePizzaRevenue([10, 11, 20]) → 19
    getCheesePizzaRevenue([11, 21]) → 0
     */

    // small cheese: 10, $8
    // med cheese: 20, $11
    // lg cheese: 30, $14

    public int getCheesePizzaRevenue(int[] orders) {
        int pizzaRevenue = 0; // adding the cost of each cheese pizza depending on size

        for(int i = 0; i < orders.length; i++){
            if(orders[i] == 10){
                // add the cost of a small cheese pizza to pizzaRevenue
                pizzaRevenue = pizzaRevenue + 8;
            }
            if(orders[i] == 20){
                // add the cost of a med cheese pizza to pizzaRevenue
                pizzaRevenue = pizzaRevenue + 11;
            }
            if(orders[i] == 30){
                // add the cost of a lg cheese pizza to pizzaRevenue
                pizzaRevenue += 14;
            }
        }
        return pizzaRevenue;
    }

}







//        int cheesePizzaTotal = 0;
//
//        for(int i = 0; i < orders.length; i++){
//
//        if(orders[i] == 10){
//        // add cost of small cheese pizza to total
//        cheesePizzaTotal += 8;
//        }
//        if (orders[i] == 20){
//        // add cost of med cheese pizza to total
//        cheesePizzaTotal = cheesePizzaTotal + 11;
//        }
//        if (orders[i] == 30){
//        // add cost of lg cheese pizza to total
//        cheesePizzaTotal += 14;
//        }
//
//        }
//
//        return cheesePizzaTotal;
