package com.weimob.finance.springbootdemo.bookdemo;

import com.weimob.finance.springbootdemo.bookdemo.bean.Book;
import com.weimob.finance.springbootdemo.bookdemo.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/readingList")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String findReaderBooks(@PathVariable("reader") String reader, Model model){
        List<Book> books = bookRepository.findByReader(reader);
        if(books != null){
            model.addAttribute("books",books);
        }
        return "readingList";
    }

    @RequestMapping(value = "/{reader}",method = RequestMethod.POST)
    public String addReaderBook(@PathVariable("reader") String reader,Book book){
        book.setReader(reader);
        book.setCreateTime(new Date());
        bookRepository.save(book);
        return "redirect:/readingList/{reader}";
    }
}
