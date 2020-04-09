OOP Concepts task:

For the existing classes that you created for your "Collections" task:
- For class Item
    -- Add field `price`

- For class Order:
    - Rename class `Order` into `UserOrder`
    - Create Interface `Order` that defines methods:
        - `sum()` that will return the sum of all items in the order
        - `count()` that will return the count of all items in the order
        - `date()` that will return the dateTime of Order creation
    - Make class UserOrder implement interface `Order`
    - Create class `CompanyOrder` that implements interface `Order`
        - class `CompanyOrder` is similar to `UserOrder` except the Order is made by a `Company` instead of a `User`
        - overload methods `sum()` and `count()` and implement methods `sum(Item item)` and `count(Item item)`
        that calculate sum and count of items of that item in the order

- For class User:
    - Make field username final
    - Define a constructor with 1 parameter for class `User`
    - Set ID to be randomly generated on creation
    - Make a class AdminUser that has same behaviour as User + methods `void approveOrder(Order order)` `void rejectOrder(Order order)`
    - Make an abstract class (AbstractUser) that contains all common fields between User and AdminUser
    - Make classes User and AdminUser extend AbstractUser, remove all duplicated properties

- For all classes:
    - Make all fields `private`
    - Generate getters for all fields that should be publicly accessible
    - Generate setters for all fields that should be possible to change
    - Make all fields that should not (ever) change `final`