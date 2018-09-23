package cn.wmyskxz.service;

import cn.wmyskxz.entity.Book;

import java.util.Collection;

/**
 * @author wangwei
 * @date 2018/9/23
 *
 */
public interface BookService {
    /**
     *
     * @return 图书实体类
     * @throws Exception
     */
    public Collection<Book> findBookInfo() throws Exception;
}
