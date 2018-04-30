package mylessons.frombook.chapter2;

public class PersonApp {
    public static void main(String[] args)
    {
        int maxSize = 100;             // array size
        ClassDataArray arr = new ClassDataArray(maxSize);  // create the array
        // insert 10 items
        arr.insert("Evans", "Patty", 1989);
        arr.insert("Smith", "Lorraine", 1980);
        arr.insert("Yee", "Tom", 1977);
        arr.insert("Adams", "Henry", 1966);
        arr.insert("Hashimoto", "Sato", 1934);
        arr.insert("Stimson", "Henry", 1990);
        arr.insert("Velasquez", "Jose", 1997);
        arr.insert("Lamarque", "Henry", 1928);
        arr.insert("Vang", "Minh", 1974);
        arr.insert("Creswell", "Lucinda", 1985);

        arr.displayA();                // display items

        String searchKey = "Stimson";  // search for item
        Person found;
        found=arr.find(searchKey);
        if(found != null)
        {
            System.out.print("Found ");
            found.displayPerson();
        }
        else
            System.out.println("Can't find " + searchKey);

        System.out.println("Deleting Smith, Yee, and Creswell");
        arr.delete("Smith");           // delete 3 items
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.displayA();                // display items again
    }  // end main()
}
