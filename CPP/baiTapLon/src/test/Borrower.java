package test;

import java.io.*;
import java.util.*;

public class Borrower extends Person 
{    
    private ArrayList<Loan> borrowedBooks;          //Those books which are currently borrowed by this borrower
    private ArrayList<HoldRequest> onHoldBooks;  //Those books which are currently requested by this borrower to be on hold

    
    
    public Borrower(int id,String name, String address, int phoneNum) // para. cons
    {
        super(id,name,address,phoneNum);
        
        borrowedBooks = new ArrayList();
        onHoldBooks = new ArrayList();        
    }

    
    // Printing Borrower's Info
    @Override
    public void printInfo()
    {
        super.printInfo();
               
        printBorrowedBooks();
        printOnHoldBooks();
    }
   
    // Printing Book's Info Borrowed by Borrower
    public void printBorrowedBooks()
    {
        if (!borrowedBooks.isEmpty())
        { 
            System.out.println("\nBorrowed Books are: ");
            
            System.out.println("------------------------------------------------------------------------------");            
            System.out.println("No.\t\tTitle\t\t\tAuthor\t\t\tSubject");
            System.out.println("------------------------------------------------------------------------------");
            
            for (int i = 0; i < borrowedBooks.size(); i++)
            {                      
                System.out.print(i + "-" + "\t\t");
                borrowedBooks.get(i).getBook().printInfo();
                System.out.print("\n");
            }
        }
        else
            System.out.println("\nNo borrowed books.");                
    }
    
    // Printing Book's Info kept on Hold by Borrower
    public void printOnHoldBooks()
    {
        if (!onHoldBooks.isEmpty())
        { 
            System.out.println("\nOn Hold Books are: ");
            
            System.out.println("------------------------------------------------------------------------------");            
            System.out.println("No.\t\tTitle\t\t\tAuthor\t\t\tSubject");
            System.out.println("------------------------------------------------------------------------------");
            
            for (int i = 0; i < onHoldBooks.size(); i++)
            {                      
                System.out.print(i + "-" + "\t\t");
                onHoldBooks.get(i).getBook().printInfo();
                System.out.print("\n");
            }
        }
        else
            System.out.println("\nNo On Hold books.");                
    }
   
    
}
