import products.ListProducts;
import products.ListRecipe;
import products.Product;
import products.Recipe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Евлампий Авасянович", "89513587420");
        phoneBook.add("Дмитрий Сергеевич", "89513587425");
        phoneBook.add("Елена Прекрасная", "89513587432");
        phoneBook.add("Сергей Семенович", "89513587441");
        phoneBook.add("Людмила Елисеева", "89613588822");
        phoneBook.add("Иван Петрович", "89613589520");
        phoneBook.add("Александр Киселев", "89613583567");
        phoneBook.add("Денис Прохоревич", "89613777420");
        phoneBook.add("Петруха Маклай", "89613888435");
        phoneBook.add("Геннадий Иванов", "89617787431");
        phoneBook.add("Ксения Васильевна", "89213597420");
        phoneBook.add("Ализар Димитрович", "89213589420");
        phoneBook.add("Присерлит Рузаковим", "89213587429");
        phoneBook.add("Патрик Третьякопский", "89213222420");
        phoneBook.add("Толик Многоликий", "89213533320");
        phoneBook.add("Маврик Опитолуч", "+79514487420");
        phoneBook.add("Кристофер Майкопов", "+79514487420");
        phoneBook.add("Виктор Елизарович", "+79513587330");
        phoneBook.add("Руслан Елисеевич", "+79512547896");
        phoneBook.add("Анька Российская", "+79515468524");

        phoneBook.printPone();

         */

        Product apple = new Product("Яблоко", 145, 3);
        Product orange = new Product("Апельсин", 410, 5);
        Product banana = new Product("Банан", 150, 4);
        Product cheese = new Product("Сыр", 300, 1);
        Product sausage = new Product("Колбаса", 400, 2);
        Product fish = new Product("Рыба", 370, 2);
        Product meat = new Product("Мясо", 480, 1);


        Map<Product, Integer> productMap = new HashMap();
        ListProducts listProducts = new ListProducts(productMap);
        listProducts.add(apple);
        listProducts.add(cheese);
        listProducts.add(sausage);
        //  listProducts.add(apple);

        System.out.println(listProducts);

        Recipe all = new Recipe("Закадычный");
        all.add(apple);
        all.add(sausage);

        System.out.println(all);
    }
}
