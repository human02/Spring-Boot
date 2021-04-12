package com.example.books_restapi;

import java.util.List;

import com.example.books_restapi.entities.Book;
import com.example.books_restapi.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // This is required for JSON data return
// @Controller // Denotes that this is the controller class. Data not in JSON
// format.
public class TestController {

    // In order to make auto object of BookService class, do the following (include
    // proper naming convention)
    @Autowired
    private BookService bookService;

    @GetMapping("/test") // smaller version of the below statement.
    // @RequestMapping(value = "/test", method = RequestMethod.GET) // This is the
    // same as the dealration below.
    // @RequestMapping("/test") // Used for mapping this request to this method.
    // @ResponseBody // return the srting as HTML.

    public Book test() {

        // to get a JSON response
        Book book = new Book();
        book.setTitle("Spring");
        book.setAuthor("first");
        book.setYear(2021);
        book.setCost(10.00);

        return book;
        // return ("Hi test is a success - " + (50 + 16));
    }

    @GetMapping("/books")
    public List books() {
        // In order to use the class and its function, we have to create it object
        // manually which is cumbersome. Like stated below:
        // BookService bookService = new BookService();

        return this.bookService.getAllBooks();
    }

    @GetMapping("/book/{n}") // n is the input
    public Book SingleBook(@PathVariable("n") int id) {
        // BookService bookService = new BookService();
        return this.bookService.getBookByID(id);
    }
}
