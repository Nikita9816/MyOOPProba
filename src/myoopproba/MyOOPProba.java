/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myoopproba;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class MyOOPProba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author author = new Author();
        author.setFirstname("Lev");
        author.setLastname("Tolstoi");
        Author author2 = new Author();
        author2.setFirstname("Aleksander");
        author2.setLastname("Pushkin");
        Book book = new Book();
        book.setCaption("Voina i mir");
        Author[] authors = new Author[1];
        authors[0] = author;
        book.setAuthors(authors);
        System.out.println( book.toString());
        
        
    }
    
}
