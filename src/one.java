class A{
    public String phone;
    public String laptop;



    public A(String phone1, String laptop1)
    {
        laptop = laptop1;
        phone = phone1;
    }

    public void PrintA()
    {
        System.out.println("Printing laptop from super class " + laptop);
        System.out.println("Printing phone from super class  " + phone);
    }
}

class B extends A{
    private String phone;
    private String laptop;


    public B(String phone, String laptop, String laptop2, String phone2)
    {
        super(phone, laptop);
        super.laptop = laptop;
        super.phone =  phone;
        this.laptop = laptop2;
        this.phone = phone2;

    }

    public void PrintB()
    {
        PrintA();
        System.out.println("Laptop " + laptop);
        System.out.println("Phone " + phone);
    }
}

public class one {
    public static void main(String[] args)
    {
        //A a = new A("iphone", "macbook");
        B b = new B("android", "windows", "macbook", "iphone");
        //a.PrintA();
        b.PrintB();
    }
}
