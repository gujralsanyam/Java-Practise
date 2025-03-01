/*

1.)
 */


package JavaOOPsPractice;

class School
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


   class Student{
    private String name;

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

  }
}


public class parctical {

    public static void main(String[] args) {
        School school = new School();
        School.Student student = school.new Student();

        school.setName("Vivekanand Public School");
        student.setName("Sanyam Gujral");
        System.out.println(student.getName() + " was study in " + school.getName());

    }
}
