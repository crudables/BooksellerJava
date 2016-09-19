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
import java.text.SimpleDateFormat;
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

    public List<Staff> findStaffByFirstName(String firstName){
    return staffRepository.findByFirstName(firstName);
    }
    
    public List<Staff> findStaffByLastName(String lastName){
    return staffRepository.findByLastName(lastName);
    }
    
    public List<Staff> findStaffByFirstAndLast(String first, String last){
    return staffRepository.findByfirstNameAndLastName(first, last);
    }
    
    public Staff findStaffById(Long id){
    return  staffRepository.findById(null);
    }
    
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
    
    //customer
    
    public List<Customer> findCustomerByFirstName(String name){
        return customerRepository.findByFirstName(name);
    }
    
    public List<Customer> findCustByLastName(String lastname){
    return customerRepository.findByLastName(lastname);
    }
    
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
    
    //category
    
    public Category findCatById(Long id){
    return categoryRepository.findById(id);
    }
    
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
    
    //Cart
    
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
    
    
    //book
    
    public Book findBookById(Long id){
    return bookRepository.findById(id);
    }
    
    public List<Book> findBookByTitle(String title){
     return bookRepository.findByTitle(title);
    }
    
    public List<Book> findBookByAuthor(String author){
    return bookRepository.findByAuthor(author);
    }
    
    public List<Book> findBookByPublisher(String publisher){
    return bookRepository.findByPublisher(publisher);
    }
    
    public List<Book> findBookByDate(SimpleDateFormat date){
    return bookRepository.findByReleaseDate(date);
    }
    
    public Book findBookByIsbn(String isbn){
    return bookRepository.findByIsbn(isbn);
    }
    
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
    
    //Address
    
    public List<Address> findAddByPhone(String phone){
    return addressRepository.findByMobilePhone(phone);
    }
    
    public List<Address> findAddByEmail(String email){
    return addressRepository.findByEmail(email);
    }
    
    public Address findByThree(String phone,String email,String add){
    return addressRepository.findByMobilePhoneAndEmailAndHomeAddress(phone, email, add);
    }
    
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
    
    
    }
