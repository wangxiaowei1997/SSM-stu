package cn.wmyskxz.dao;

import cn.wmyskxz.entity.Book;

import java.util.Collection;

public interface BookMapper {
    public Collection<Book> findBookInfo();

    public void addBookInfo(Book book);

    public void  deleteBookInfo(Book book);

    public void  updateBookInfo(Book book);
}
