/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.actions;

import com.ables.booksellers.model.Category;
import com.ables.booksellers.service.PersistenceService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.Conversion;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
@Action("cat")
@ResultPath("/WEB-INF/views/jsp/admin/")
@Results({
@Result(name = "form",location = "newcategory.jsp"),
@Result(name = "showcategory", location = "category.jsp")  
})
@Conversion
public class CategoryAction extends ActionSupport{
    private Category cat;
    private String type;
    private String result;
    private List<Category> categories;
    @Autowired
    private PersistenceService ps;
    public String execute(){
        System.out.println("type is "+type);
        switch(type){
            case "form":
                System.out.println("showing form for new category");
            result = "form";
            break;
            case "showcategory":
                System.out.println("showing all categories");
                categories = ps.fetchAllCategory();
                result = "showall";
                break;
            case "submit":
                System.out.println("Submitting form");
                makeLocalDate();
                ps.createCategory(cat);
                result = "showcategory";
                break;
        }
    return result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Category getCat() {
        return cat;
    }
    public void setCat(Category cat) {
        this.cat = cat;
    }
    
    private void makeLocalDate(){
        DateTimeFormatter formatte = DateTimeFormatter.ofPattern("dd/mm/yy");
        LocalDateTime createdDate = LocalDateTime.parse(getCat().getCreatedDate(), formatte);
        LocalDateTime updatedDate = LocalDateTime.parse(getCat().getUpdatedDate(), formatte);
        
        getCat().setCreateDateL(createdDate);
        getCat().setUpdatedDateL(updatedDate);
        
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
