package com.jpmc;

public class FinallyKeyword {
    public static void main(String[] args) {
        //BAD DESIGN
        try {
            //Opening a connection to DB
            //Executing SQL queries
            //Process the results (SOME ERROR occurs)
            //Close connection to DB
        }
        catch(Exception ex) {
              //Handle the error
             //Close connection to DB
        }

        try {
            //talkToDB("SQL")
        }
        catch(Exception ex) {
            
        }

        try {
            //Opening a connection to DB
            //Executing SQL queries
            //Process the results (SOME ERROR occurs)
        }
        catch(Exception ex) {
            //Handle the error
        }
        finally {
             //Close connection to DB
        }
    }
}
