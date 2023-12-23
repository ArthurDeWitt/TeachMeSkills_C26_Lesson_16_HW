# Repo for homework lesson 16
# Homework0
Create a class to describe an order.
The class should contain the fields order id and order value - mandatory fields.
Other fields are possible as needed.
Create several orders and place them in a collection.
Display the collection on the screen.
Sort orders and display the sorted collection on the screen.
Orders are sorted by price in ascending order.
You should create your own comparator to sort the orders (see the example from the class).

This example is a TreeMap implementation WITHOUT a comparator.

# Homework0_1
Same as Homework0, only with the comparator implemented in a separate class

# Homework1
Create a class for client description.
   Place in the class fields to describe the client (registration date, name, age and other fields at your discretion).
   Customer class should contain a field-collection with orders of this customer - it is a kind of customer's order basket.
   Order class should contain fields for order description (price, description and other fields are possible).
   Create several customers.
   Create several orders for each customer and place them in a field-collection for orders.
   Create a collection of Mar type and fill it with pairs "customer passport number" -> "customer class object".
   Passport numbers can be stored as constants in the interface created for this purpose.
   Loop through the collection and display:
 * - all key-value pairs, using Map. Entry<K, V> entry : map.entrySet()
 * - all key-value pairs, using iterator
 * - all keys, using map.keySet()
 * - all values, using map.values()
