//Parentclass

public class Book {

private String genre;
private String isbn;

//As you can see we have two constructors.

//The first with only one argument
public Book (String genre)
    this.genre = genre;
}


//The second one with two arguments
public Book (String genre, String isbn) {
    this.genre = genre;
    this.isbn = isbn;
}

}

//subclass
class Novel extends Book{

public Novel(String isbn)


   super("novel", isbn);
   //super() has now two arguments, because we are calling the second constructor
   //which has two args. 
   //Now, in the parent class members genre = "novel" and isbn equals the value passed in the
   //child constructor.
   //This is the same as using the parent constructor inner body in this constructor. 
   //Normally the parent constructor gets overwritten on inheritance. 
   //But super makes its possible to use the parent constructor. 


}