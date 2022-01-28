public class Main
{
  public static void main (String args[])
  {
    //Testing variable attribution in object
    Book test = new Book ();
      test.author = "Eileen Garvin";
      test.title = "The Music of Bees: A Novel";
      test.genre = "Fiction";
      /*test.isbnNumber = "0593183924";
      -> not every member of a class has to be defined*/
      test.language = "English";
    
    //Print test
    System.out.println(test.author
			  + " has written the "
			  + test.genre.toLowerCase()
			  + " book "
			  + test.title 
			  + " in " 
			  + test.language 
			  + ".\n"
			  + test.testingObject);
  }
}

