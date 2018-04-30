package mylessons.frombook.chapter2;
import  java.util.*;

class Person
{
    private String lastName;
    private String firstName;
    private int birth_year,age;
    Calendar year = Calendar.getInstance();
    //--------------------------------------------------------------
    public Person(String last, String first, int a)
    {                               // constructor
        lastName = last;
        firstName = first;
        birth_year = a;
    }
    //--------------------------------------------------------------
    public void displayPerson()
    {
        System.out.print("   Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        age = year.get(Calendar.YEAR) - birth_year;
        System.out.println(", Age: " + age);
    }
    //--------------------------------------------------------------
    public String getLast()           // get last name
    { return lastName; }
}  // end class Person