package cn.wmyskxz.controller;

import cn.wmyskxz.entity.Book;
import cn.wmyskxz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


/**
 * @author wangwei
 * @create 2018/9/18
 */
@CrossOrigin
@RestController
@RequestMapping(value="/listBook")
public class BookController {

    private static final String APPLICATION_JSON = "application/json";
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "",method = RequestMethod.GET,produces = APPLICATION_JSON)
    public Collection<Book> listBook() throws  Exception{


        return bookService.findBookInfo();
    }
}
