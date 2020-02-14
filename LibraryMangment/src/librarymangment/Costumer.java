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
public class Costumer {
    
    private String Adress;
    private Book[] takenBooks = new Book[3];
    int takenBooksNo;

    public Costumer(String Adress, int takenBooksNo) {
        this.Adress = Adress;
        this.takenBooksNo = takenBooksNo;
    }
    
    
    
}
