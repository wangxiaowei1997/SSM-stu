package cn.wmyskxz.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangwei
 * @create 2018/9/18
 */
@RequestMapping("")
public class BookController {

    @RequestMapping("/listBook")
    public String listBook(HttpServletRequest request, HttpServletResponse response){
        return "redirect:listBook";
    }
}
