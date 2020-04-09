package com.endava;

import com.endava.store.AbstractOrder;
import com.endava.store.Address;
import com.endava.store.AdminUser;
import com.endava.store.Company;
import com.endava.store.CompanyOrder;
import com.endava.store.Item;
import com.endava.store.User;
import com.endava.store.UserOrder;

import java.util.Arrays;
import java.util.List;

import static com.endava.store.Type.CLOTHES;
import static com.endava.store.Type.FOOD;
import static com.endava.store.Type.GADGET;
import static com.endava.store.Type.TOY;

public class Main {
    public static void main(String[] args) {
        Item dress = new Item("Dress", CLOTHES, 100.5f);
        Item bread = new Item("Bread", FOOD, 10f);
        Item car = new Item("Car", TOY, 20.5f);
        Item bread1 = new Item("Bread", FOOD, 25.5f);
        Item dress1 = new Item("Dress", CLOTHES, 150.5f);
        Item phone = new Item("Phone", GADGET, 900f);

        List<Item> userItemList = Arrays.asList(dress, dress1, car, phone);
        List<Item> companyItemList = Arrays.asList(bread, bread1, car, phone);

        Address userAddress = new Address("Moldova", "Chisinau", "Mircea Cel Batran 110");
        Address companyAddress = new Address("Moldova", "Chisinau", "Bulgara 10");

        AdminUser adminUser = new AdminUser("Super_User");

        User user = new User("Gabriela");
        user.addAddress("Home", userAddress);

        Company company = new Company("Gabriela SRL");
        company.addAddress("Office", companyAddress);

        UserOrder userOrder = new UserOrder(user, userItemList);
        AbstractOrder companyOrder = new CompanyOrder(company, companyItemList);

        adminUser.approveOrder(userOrder);
        adminUser.rejectOrder(companyOrder);

        System.out.println("There are " + userOrder.count() + " item for user order with total: " + userOrder.sum());
        System.out.println("There are " + companyOrder.count() + " item for company order with total: " + companyOrder.sum());
        System.out.println("There are " + userOrder.count("dress") + " dress item for user order with total: "
                + userOrder.sum("dress"));
        System.out.println("There are " + companyOrder.count("bread") +
                " bread item for company order with total: " + companyOrder.sum("bread"));
    }
}
