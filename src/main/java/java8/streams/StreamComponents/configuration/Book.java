package java8.streams.StreamComponents.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {

    private String name;
    private String Genre;
    private int rating;

    public void toString(Book book){
        System.out.println();
        System.out.print("Name:"+book.getName());
        System.out.print(";Genre:"+book.getGenre());
        System.out.print(";rating:"+book.getRating());
    }
}
