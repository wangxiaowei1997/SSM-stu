package cn.wmyskxz.dao;

import cn.wmyskxz.entity.Book;

import java.util.Collection;

public interface BookMapper {
    public Collection<Book> findBookInfo();
}