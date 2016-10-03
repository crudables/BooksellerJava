/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.service;

import com.ables.booksellers.model.Address;
import com.ables.booksellers.model.Book;
import com.ables.booksellers.model.Cart;
import com.ables.booksellers.model.Category;
import com.ables.booksellers.model.Customer;
import com.ables.booksellers.model.Staff;
import com.ables.booksellers.repo.AddressRepository;
import com.ables.booksellers.repo.BookRepository;
import com.ables.booksellers.repo.CartRepository;
import com.ables.booksellers.repo.CategoryRepository;
import com.ables.booksellers.repo.CustomerRepository;
import com.ables.booksellers.repo.StaffRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ables
 */
@Service
@Transactional
public class PersistenceServiceImpl implements PersistenceService{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     *
     * @param firstName
     * @return
     */
    public List<Staff> findStaffByFirstName(String firstName){
    return staffRepository.findByFirstName(firstName);
    }
    
    @Override
    public List<Staff> findStaffByLastName(String lastName){
    return staffRepository.findByLastName(lastName);
    }
    
    @Override
    public List<Staff> findStaffByFirstAndLast(String first, String last){
    return staffRepository.findByfirstNameAndLastName(first, last);
    }
    
    @Override
    public Staff findStaffById(Long id){
    return  staffRepository.findById(null);
    }
    
    @Override
    public Staff findStaffByUsername(String username){
    return staffRepository.findByUsername(username);
    }

    @Override
    public Staff createStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public Staff editStaff(Staff staff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public List<Staff> fetchAllStaff(){
    return (List<Staff>)staffRepository.findAll();
    }
    //customer
    
    @Override
    public List<Customer> findCustomerByFirstName(String name){
        return customerRepository.findByFirstName(name);
    }
    
    @Override
    public List<Customer> findCustByLastName(String lastname){
    return customerRepository.findByLastName(lastname);
    }
    
    @Override
    public List<Customer> findCustByFirstAndLast(String first, String last){
    return customerRepository.findByFirstNameAndLastName(first, last);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer editCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Customer> fetchAllCustomer(){
    return (List<Customer>)customerRepository.findAll();
    }
    
    //category
    
    @Override
    public Category findCatById(Long id){
    return categoryRepository.findById(id);
    }
    
    @Override
    public Category findCatByName(String name){
    return categoryRepository.findByName(name);
    }

    @Override
    public Category createCategory(Category c) {
        return categoryRepository.save(c);
    }

    @Override
    public Category editCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public List<Category> fetchAllCategory(){
    return (List<Category>)categoryRepository.findAll();
    }
    //Cart
    
    @Override
    public Cart findCartById(Long id){
    return cartRepository.findById(id);
    }

    @Override
    public Cart createCart(Cart c) {
        return cartRepository.save(c);
    }

    @Override
    public Cart editCart(Cart c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Cart> fetchAllCart(){
    return (List<Cart>) cartRepository.findAll();
    }
    //book
    
    @Override
    public Book findBookById(Long id){
    return bookRepository.findById(id);
    }
    
    @Override
    public List<Book> findBookByTitle(String title){
     return bookRepository.findByTitle(title);
    }
    
    @Override
    public List<Book> findBookByAuthor(String author){
    return bookRepository.findByAuthor(author);
    }
    
    @Override
    public List<Book> findBookByPublisher(String publisher){
    return bookRepository.findByPublisher(publisher);
    }
    
    @Override
    public List<Book> findBookByReleasedDate(LocalDateTime date){
    return bookRepository.findByReleasedDate(date);
    }
    
    @Override
    public List<Book> findBookByCreatedDate(LocalDateTime date){
    return bookRepository.findByCreatedDate(date);
    }
    
    @Override
    public Book findBookByIsbn(String isbn){
    return bookRepository.findByIsbn(isbn);
    }
    
    @Override
    public List<Book> findBookByCategory(String category){
    return bookRepository.findByCategory(category);
    }

    @Override
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    @Override
    public Book editBook(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Book> fetchAllBook(){
    return (List<Book>)bookRepository.findAll();
    }
    
    //Address
    
    @Override
    public List<Address> findAddByPhone(String phone){
    return addressRepository.findByMobilePhone(phone);
    }
    
    @Override
    public List<Address> findAddByEmail(String email){
    return addressRepository.findByEmail(email);
    }
    
    @Override
    public Address findAddByThree(String phone,String email,String add){
    return addressRepository.findByMobilePhoneAndEmailAndHomeAddress(phone, email, add);
    }
    
    @Override
    public Address findAddById(Long id){
    return addressRepository.findById(id);
    }

    @Override
    public Address createAddress(Address a) {
        return addressRepository.save(a);
    }

    @Override
    public Address editAddress(Address address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Address> fetchAllAdd(){
    return  (List<Address>)addressRepository.findAll();
    }
    
    
    }
