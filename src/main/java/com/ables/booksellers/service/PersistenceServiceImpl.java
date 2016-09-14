/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.service;

import com.ables.booksellers.repo.AddressRepository;
import com.ables.booksellers.repo.BookRepository;
import com.ables.booksellers.repo.CartRepository;
import com.ables.booksellers.repo.CategoryRepository;
import com.ables.booksellers.repo.CustomerRepository;
import com.ables.booksellers.model.Address;
import com.ables.booksellers.model.Book;
import com.ables.booksellers.model.Cart;
import com.ables.booksellers.model.Category;
import com.ables.booksellers.model.Customer;
import com.ables.booksellers.model.Staff;
import com.ables.booksellers.repo.StaffRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ables
 */
@Service
@Repository
@Transactional
public class PersistenceServiceImpl{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private StaffRepository staffRepository;
    
    public void persistBook(Book book){
        Book findBook = bookRepository.findByIsbn(book.getIsbn());
        if(findBook == null ){
        bookRepository.save(book);
        }
    }
    
    public void deleteBook(Book book){
    bookRepository.delete(book);
    }
    public List<Book> findAllBooks(){
    return (List<Book>) bookRepository.findAll();
    }
    
    
    public List<Address> findAllAddresses(){
    return (List<Address>) addressRepository.findAll();
    }
    
    public void registerAdd(Address address){
    Address add = addressRepository.findByMobilePhoneAndEmailAndHomeAddress(address.getMobilePhone(), address.getEmail(), address.getHomeAddress());
    if(add == null){
    addressRepository.save(address);
    }
    }
    public void deleteAddress(Address address){
    addressRepository.delete(address);
    }
    
    public List<Customer> findAllCustomers(){
    return (List<Customer>) customerRepository.findAll();
    }
    
    public void persistCustomer(Customer customer){
    customerRepository.save(customer);
    }
    public void deleteCustomer(Customer customer){
    customerRepository.delete(customer);
    }
    
    
    public List<Category> findAllCatgories(){
    return  (List<Category>) categoryRepository.findAll();
    }
    public void persistCategory(Category category){
    Category cat = categoryRepository.findByName(category.getName());
    if(cat == null){
    categoryRepository.save(category);
    }
    }
    
    public void deleteCategory(Category category){
    categoryRepository.delete(category);
    }
    
    public List<Cart> findAllCarts(){
    return  (List<Cart>)cartRepository.findAll();
    }
    public void persistCart(Cart cart){
        Objects.requireNonNull(cart, "cart object cannot be null");
        cartRepository.save(cart);
    }
public void deleteCart(Cart cart){
    cartRepository.delete(cart);
}
    public List<Staff> findAllStaffs(){
    return (List<Staff>) staffRepository.findAll();
    }

    public void persistStaff(Staff staff){
    staffRepository.save(staff);
    }
    
    public void deleteStaff(Staff staff){
    staffRepository.delete(staff);
    }
    
   public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;   }

    public void setAddressRepository(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void setCartRepository(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void setStaffRepository(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    
    
}