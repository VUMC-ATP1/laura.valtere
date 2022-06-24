package Classroom.chaining;

import javax.crypto.spec.PSource;

public class Example {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("BMW");
        vehicle.setColor("Black");
        vehicle.setEngine("Diesel");
        vehicle.setProductionYear(2020);
        vehicle.setPrice(40000);

        Vehicle audi =
                new Vehicle("Audi", "White", "Petrol", 2021, 50000);

        Vehicle skoda = new Vehicle();
        skoda.setBrand("Skoda")
                .setColor("Blue")
                .setProductionYear(2022)
                .setPrice(50000)
                .setEngine("Petrol")
                .start();

//        audi.setPrice().setColor().setEngine().setproductionYear();


//        Book gramata = new Book();
//        gramata.name = "HarryPotter";
//        gramata.isbn = "819263976";
//        gramata.author = new Author("Rowling", "ujh@lu.lv");
//        gramata.price = 9;
//        gramata.qty = 2;
//
//        System.out.println(gramata.toString());


        Author author = new Author("Rowl", "g@kjh.lv");
        Book book = new Book("1235", "Harry", author, 9, 2);
        System.out.println(book);
        Book book2 = new Book("1235", "Harry", new Author("Rowl", "g@kjh.lv"), 9, 2);
    }

}
