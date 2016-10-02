/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.actions;

import com.ables.booksellers.model.Category;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.Conversion;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

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
    public String execute(){
        System.out.println("type is "+type);
        switch(type){
            case "form":
                System.out.println("showing form for new category");
            result = "form";
            break;
            case "showcategory":
                System.out.println("showing all categories");
                result = "showall";
                break;
            case "submit":
                System.out.println("Submitting form");
                System.out.println("name is "+cat.getName());
                System.out.println("created on "+cat.getCreatedDate());
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
    @TypeConversion(converter = "com.ables.booksellers.util.StringToDateTimeConverter")
    public void setCat(Category cat) {
        this.cat = cat;
    }
}
