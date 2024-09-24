package java8.streams.StreamComponents.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOperationTwo {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("A","Horror",3));
        books.add(new Book("B","Fear",4));
        books.add(new Book("C","Fun",5));
        books.add(new Book("D","Horror",6));
        books.add(new Book("E","Horror",7));

        //Stream Pipeline
        List<Book> popularHorrorBooks = books.stream()    //Source
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror")) //Intermediate Op
                .filter((book) -> book.getRating() > 3) //Intermediate Op
                .collect(Collectors.toList());  //Terminal Op


        //1.Source
        Stream<Book> stream = books.stream();


        //2. Intermediate Operation
        Stream<Book> horrorBooks = stream.filter((book) -> book.getGenre().equalsIgnoreCase("Horror"));


        //3. Intermediate Operation
        Stream<Book> pHorrorBooks = horrorBooks.filter((book) -> book.getRating() > 3);

        //4. Terminal operation
        List<Book> collect = pHorrorBooks.collect(Collectors.toList());

        collect.stream().forEach((e) -> e.toString(e));
    }
}
