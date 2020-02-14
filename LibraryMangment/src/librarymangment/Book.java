/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymangment;

/**
 *
 * @author Lenovo
 */
public class Book {
    
    String Name;
    Writer writer;
    boolean availability;

    public Book(String Name, Writer writer, boolean taken) {
        this.Name = Name;
        this.writer = writer;
    }
    
    
    
}
