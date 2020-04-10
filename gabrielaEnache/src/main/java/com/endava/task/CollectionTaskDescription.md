Imagine this a s an online retailer where users can:

- Register

- Create orders by adding items

- Set the whipping by specifying their address


 

Write a program that includes classes according to description

Create 2 objects of Order type

Create a method that will return only Orders containing item.type = "Clothes"

i.e. List<Order> filterOrderByItemType(Order userOrder);

Create a method that will return list of users who's City is Chisinau

i.e. List<User> filerUsersByCity(List<User> users, String city);


 

class Order

- public long id; (generate automatically in constructor )

- public DateTime date; (set as current day directly in constructor)

- public User user;

- public List<Item> items;

class User

- public long id

- public String username;

- public Map<String, Address> addresses; (i.e. Key= "Home", Value = Address)


 

class Address

- public String country;

- public String city;

- public String street;

- public String getFullAddress();


 

class Item

- public long id;

- public String title;

- public Type type;


 

enum Type

i.e. clothes, gadget, toy



Try to play with more data, use static methods from Collections: sort, copy, etc.

Also as much as possible the methods from other types of collections (remove, add, put, addAll(), etc)