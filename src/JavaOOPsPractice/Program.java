/*
1.)    Write a Java program to create a class called "Person" with a name and age attribute.
       Create two instances of the "Person" class, set their attributes using the constructor,
       and print their name and age.

2.)     Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

3.)   Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

4.)  Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

5.) Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

6.) Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.

7.) Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.


*/

package JavaOOPsPractice;

import java.time.LocalTime;
import java.util.ArrayList;

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Rectangle{
      private  double width;
      private double height;

      public Rectangle(double width, double height)
      {
          this.width = width;
          this.height = height;
      }

      public double getwidth()
      {
          return width;
      }

      public double getHeight()
      {
          return height;
      }

      public void setWidth(double width)
      {
          this.width = width;
      }
      public void setHeight(double height)
      {
          this.height = height;
      }

      public double area()
      {
          return width * height;
      }

      public double  Perimeter()
      {
          return 2*(width+height);
      }
}


class Circle {
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double GetArea()
    {
        return Math.PI * radius * radius;
    }

    public double GetCircumference()
    {
        return 2 * Math.PI * radius;
    }
}


class Book{

      private String  title;
      private String  author;
      private String  ISBN;
      private static  ArrayList<Book> bookCollection = new ArrayList<Book>();

      public Book(String title, String author, String ISBN)
      {
          this.title = title;
          this.author = author;
          this.ISBN = ISBN;
      }
      public String getTitle()
      {
          return title;
      }

      public String getAuthor()
      {
          return author;
      }
      public String getISBN()
      {
          return ISBN;
      }
      public void setTitle(String title)
      {
          this.title = title;
      }
      public void setAuthor(String author)
      {
          this.author = author;
      }
      public void setISBN(String ISBN)
      {
          this.ISBN = ISBN;
      }

      public static void add_Book(Book book)
      {
       bookCollection.add(book);
      }
      public static  void  remove_Book(Book book)
      {
          bookCollection.remove(book);
      }
      public static  ArrayList<Book> getBookCollection()
      {
       return bookCollection;
      }
}

class Account {

    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public String accountInfo() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
    class Bank {
        private ArrayList<Account> accounts;

        public Bank() {
            accounts = new ArrayList<Account>();
        }

      public void AddAccount(Account account) {
            accounts.add(account);
        }

        public void removeAccount(Account account) {
            accounts.remove(account);
        }

        public void depositAccount(Account account, double amount) {
            account.deposit(amount);
        }

        public void withdrawMoney(Account account, double amount) {
            account.withdraw(amount);
        }

        public ArrayList<Account> getAccounts() {
            return accounts;
        }
    }

    class TrafficLight{

    private String color;

    private int duration;

    public TrafficLight(String color, int duration)
    {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor)
    {
        color = newColor;
    }

    public  boolean isRed()
    {
        return color.equals("red");
    }

    public boolean isGreen()
    {
        return color.equals("green");
    }
    public int getDuration()
    {
        return duration;
    }
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    }


    class Airplane {
        private String flightNumber;
        private String destination;
        private LocalTime scheduledDepartures;
        private int dealyTime;

        public Airplane(String flightNumber, String destination, LocalTime scheduledDepartures) {
            this.flightNumber = flightNumber;
            this.scheduledDepartures = scheduledDepartures;
            this.destination = destination;
            this.dealyTime = 0;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public LocalTime getScheduledDepartures() {
            return scheduledDepartures;
        }

        public void setScheduledDepartures(LocalTime scheduledDepartures) {
            this.scheduledDepartures = scheduledDepartures;
        }

        public int delayTime() {
            return dealyTime;
        }

        public void setDealyTime(int minutes) {
            this.dealyTime = minutes;
            this.scheduledDepartures = this.scheduledDepartures.plusMinutes(minutes);
        }

        public void checkStatus() {
            if (dealyTime == 0) {
                System.out.println("Flight" + flightNumber + " is on time");
            } else {
                System.out.println("Flight" + flightNumber + " is delayed by" + dealyTime + "minutes");
            }
        }
    }

    class Product{

    private String name;
    private int quantity;

    public Product(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName()
    {
        return  name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    }


    class Inventory
    {
        private ArrayList<Product> products;

        public Inventory()
        {
            products = new ArrayList<Product>();
        }

        public void addProduct(Product product)
        {
            products.add(product);
        }

        public void removeProduct(Product product)
        {
            products.remove(product);
        }

        public void checkLowInventory()
        {
            for(Product product : products)
            {
                if(product.getQuantity() <= 100)
                {
                    System.out.println(product.getName() + " is running low on inventory. Current quantity :" + product.getQuantity());
                }
            }
        }
    }




    public class Program {
    public static void main(String[] args) {
//        Person person1 = new Person("Evan", 20);
//        Person person2 = new Person("Murli",30);
        //Rectangle rectangle = new Rectangle(10.4,20.67);
        //Circle circle = new Circle(30);

        Book book1 = new Book(" The C Programming Language ", " Dennis Ritchie, Brian Kernighan ", " 9780131101630 ");
        // Create another instance of the Book class with the title "An Introduction to Python", author "Guido van Rossum", and ISBN "9355423489"
        Book book2 = new Book(" An Introduction to Python ", " Guido van Rossum ", " 9355423489 ");

        Bank bank = new Bank();
        Account account1 = new Account("Peter Irmgard", "C0011", 5000);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000);


        Airplane flight1 = new Airplane("CDE345", "London", LocalTime.of(10, 30));
        // Create a new Airplane object with flight number "KUI765", destination "New York", and departure time 14:00
        Airplane flight2 = new Airplane("KUI765", "New York", LocalTime.of(14, 0));
        // Create a new Airplane object with flight number "JUY456", destination "Paris", and departure time 14:00
        Airplane flight3 = new Airplane("JUY456", "Paris", LocalTime.of(14, 0));


        Inventory inventory = new Inventory();

        // Create new Product objects with name and quantity
        Product product1 = new Product("LED TV", 200);
        Product product2 = new Product("Mobile", 80);
        Product product3 = new Product("Tablet", 50);

        // Print a message indicating products are being added to the inventory
        System.out.println("Add three products in inventory:");

        // Add the products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);


        System.out.println("\n Check Low Inventory");
        inventory.checkLowInventory();
        System.out.println("\n Remove Tablet from inventory");
        inventory.removeProduct(product3);
        System.out.println("\nAgain check low inventory");
        inventory.checkLowInventory();


        System.out.println("Flight Status");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();

        flight1.setDealyTime(40);
        System.out.println("\nCurrent Flight Status: ");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();


        TrafficLight trafficLight = new TrafficLight("red", 30);
        System.out.println("The light is red:" + trafficLight.isRed());
        System.out.println("The light is green:" + trafficLight.isGreen());

        trafficLight.changeColor("green");
        System.out.println("The light is now green" + trafficLight.isGreen());
        System.out.println("The light duration is: " + trafficLight.getDuration());

        trafficLight.setDuration(40);
        System.out.println("The light duration is now: " + trafficLight.getDuration());



        //Add three acounts to bank
         bank.AddAccount(account1);
         bank.AddAccount(account2);
         bank.AddAccount(account3);

        // Retrieve the list of accounts from the bank
        ArrayList<Account> accounts = bank.getAccounts();

        // Loop through each account in the accounts list
        for (Account account: accounts) {
            // Print the account information for each account
            System.out.println(account.accountInfo());
        }




        Book.add_Book(book1);
        Book.add_Book(book2);

        //ArrayList<Book> bookCollection = new ArrayList<Book>();
        ArrayList<Book> bookCollection = Book.getBookCollection();
         System.out.println(" List of Books when we add : ");
        for(Book  book: bookCollection)
        {
            System.out.println(book.getTitle() + "by" + book.getAuthor() + ", ISBN:" + book.getAuthor());
        }
        Book.remove_Book(book1);
         System.out.println(" Removal of Books : ");
        for(Book book : bookCollection)
        {
            System.out.println(book.getTitle() + "by" + book.getAuthor() + ", ISBN:" + book.getAuthor());
        }


//        rectangle.setHeight(40);
//        rectangle.setWidth(60);
//        circle.setRadius(30);
//
//        System.out.println("The area of circle " + circle.GetArea());
//        System.out.println("The circumference of circle " + circle.GetCircumference());
//
//        System.out.println("The Area of the rectangle   "+ rectangle.area());
//        System.out.println("The perimeter of the rectangle  "+ rectangle.Perimeter());

//        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
//        person1.setAge(14);
//        person1.setName("Williamson");
//        person2.setName("Lewis Homes");
//        person2.setAge(40);
//        System.out.println("Set new age and name:");
//        System.out.println(person1.getName() + " is now " + person1.getAge());
//        System.out.println(person2.getName() + " is now " + person2.getAge());

    }
}
