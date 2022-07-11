package test;

import java.io.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Book {

    private int bookID;           // ID given by a library to a book to make it distinguishable from other books
    private String title;         // Title of a book 
    private String subject;       // Subject to which a book is related!
    private String author;        // Author of book!
    private boolean isIssued;        // this will be true if the book is currently issued to some borrower.
    private HoldRequestOperations holdRequestsOperations =new HoldRequestOperations();
    static int currentIdNumber = 0;     //This will be unique for every book, since it will be incremented when everytime
                                        //when a book is created
    
  
    public Book(int id,String t, String s, String a, boolean issued)    // Parameterise cons.
    {
        currentIdNumber++;
        if(id==-1)
        {
            bookID = currentIdNumber;
        }
        else
            bookID=id;
        
        title = t;
        subject = s;
        author = a;
        isIssued = issued;

    }


    // printing all hold req on a book.
    public void printHoldRequests()
    {
        if (!holdRequestsOperations.holdRequests.isEmpty())
        { 
            System.out.println("\nHold Requests are: ");
            
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");            
            System.out.println("No.\t\tBook's Title\t\t\tBorrower's Name\t\t\tRequest Date");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
            
            for (int i = 0; i < holdRequestsOperations.holdRequests.size(); i++)
            {                      
                System.out.print(i + "-" + "\t\t");
                holdRequestsOperations.holdRequests.get(i).print();
            }
        }
        else
            System.out.println("\nNo Hold Requests.");                                
    }
    
    // printing book's Info
    public void printInfo()
    {
        System.out.println(title + "\t\t\t" + author + "\t\t\t" + subject);
    }
    
    // changign Info of a Book
    public void changeBookInfo() throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\nUpdate Author? (y/n)");
        input = scanner.next();
        
        if(input.equals("y"))
        {
            System.out.println("\nEnter new Author: ");
            author = reader.readLine();
        }

        System.out.println("\nUpdate Subject? (y/n)");
        input = scanner.next();
        
        if(input.equals("y"))
        {
            System.out.println("\nEnter new Subject: ");
            subject = reader.readLine();
        }

        System.out.println("\nUpdate Title? (y/n)");
        input = scanner.next();
        
        if(input.equals("y"))
        {
            System.out.println("\nEnter new Title: ");
            title = reader.readLine();
        }        
        
        System.out.println("\nBook is successfully updated.");
        
    }
    
    /*------------Getter FUNCs.---------*/
    
    public String getTitle()
    {
        return title;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getAuthor()
    {
        return author;
    }
    
    public boolean getIssuedStatus()
    {
        return isIssued;
    }
    
    public void setIssuedStatus(boolean s)
    {
        isIssued = s;
    }
    
     public int getID()
    {
        return bookID;
    }
     
     public ArrayList<HoldRequest> getHoldRequests()
    {
        return holdRequestsOperations.holdRequests;
    }
    /*-----------------------------------*/
     
    // Setter Static Func.
    public static void setIDCount(int n)
    {
        currentIdNumber = n;
    }
    

    
    
    
    
}   