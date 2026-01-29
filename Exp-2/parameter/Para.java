class Movie{
    String name, genre;
    Movie(String a, String b){
        System.out.println("Parameterized constructor was called.");
        name = a;
        genre = b;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Genre: "+genre);
    }
}
public class Para{
    public static void main(String[] args) {
        Movie m = new Movie("Border 2", "War, Drama");
        m.display();
    }
}