/* Real World Use Case

1.) booking system where :-> giving method name about payment, its my own implementation, i can implemnet any payment.
2.) where we implment default implementation + some other additional implmentation.

*/


abstract class Student
{
    public  abstract void getDepartments();

    public  void GetCollege()
    {
        System.out.println("College Name ");
    }
}


class Undegraduation extends Student
{

    public void getDepartments() {
        System.out.println("Printing Undegraduation Students");
    }

    public void streams()
    {
        System.out.println("Different students having different streams");
    }
}

class PostGraduation extends Student
{

    public void getDepartments()
    {
        System.out.println("Printing PostGradution Students");
    }
    public void Labs()
    {
        System.out.println("Printing Postgraduation student labs");
    }
}


public class TestAbstract {
    public static void main(String[] args) {
        Undegraduation undegraduation = new Undegraduation();
        PostGraduation postGraduation = new PostGraduation();

        undegraduation.GetCollege();
        undegraduation.streams();
        undegraduation.getDepartments();
        postGraduation.getDepartments();
        postGraduation.Labs();
        postGraduation.GetCollege();
    }
}
