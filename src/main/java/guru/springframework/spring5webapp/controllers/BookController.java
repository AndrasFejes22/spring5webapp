package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //nyilvan ezt nem ertem:

    //@RequestMapping("/list") //  ezt egy másik videoban lattam
    @RequestMapping("/books") // ez az udemy-s
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());
        return "books/list"; // ide nem tudom mit kell írni, ez az eredeti udemys
    }
}
