/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.actions;

import com.ables.booksellers.model.Book;
import com.ables.booksellers.service.PersistenceService;
import com.ables.booksellers.util.StringToLocalDateTime;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ables
 */
@Action("book")
@ResultPath("/WEB-INF/views/jsp/admin/")
@Results({
@Result(name = "form", location = "newbook.jsp"),
@Result(name = "showallbooks", location = "boo.jsp")    
})
public class BookAction extends ActionSupport{
 private String type;
 String result;
 private Book book;
 private List<Book> allbooks;
 @Autowired
 private PersistenceService ps;
 @Autowired
 private StringToLocalDateTime convert;
 private static final String FORMAT = "dd/mm/yy";
    
 @Override
 public String execute(){
    switch(type){
        case "form":
            result  = "form";
            break;
        case "showallbook":
            System.out.println("get all book list");
            allbooks =  ps.fetchAllBook();
            result = "showallbooks";
            break;
        case "submit":
            System.out.println("submit form");
            getBook().setCreatedDatel(convert.changeDate(getBook().getCreatedDate(), FORMAT));
            getBook().setReleasedDateL(convert.changeDate(getBook().getReleasedDate(), FORMAT));
            getBook().setUpdatedDateL(convert.changeDate(getBook().getUpdatedDate(), FORMAT));
            ps.createBook(book);
            allbooks = ps.fetchAllBook();
            result = "showallbooks";
            break;
    }
    return result;
}
    public void setType(String type) {
        this.type = type;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getAllbooks() {
        return allbooks;
    }

    public void setAllbooks(List<Book> allbooks) {
        this.allbooks = allbooks;
    }

    
   
}
