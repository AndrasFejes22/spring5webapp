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

    @RequestMapping("/books") // ez az udemy-s
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll()); // http://localhost:8080/books
        return "list"; // --> in the templates file
    }
}
