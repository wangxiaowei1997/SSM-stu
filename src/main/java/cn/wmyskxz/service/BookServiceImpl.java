package cn.wmyskxz.service;

import cn.wmyskxz.dao.BookMapper;
import cn.wmyskxz.entity.Book;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author wangwei
 * @date 2018/9/23
 */
@Service
public class BookServiceImpl implements BookService {
    private BookMapper mapper;

    public BookServiceImpl(BookMapper mapper) {
        this.mapper = mapper;
    }


    public Collection<Book> findBookInfo() throws Exception {

        return mapper.findBookInfo();
    }

    public void addBookInfo(Book book) throws Exception {

        mapper.addBookInfo(book);
    }

}
