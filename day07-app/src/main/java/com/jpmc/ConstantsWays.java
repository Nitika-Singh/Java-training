package com.jpmc;

public class ConstantsWays {
    public static void main(String[] args) {
        System.out.println(Players.salaryCap);
        System.out.println(Months.JAN);
        System.out.println(Months.FEB);
        System.out.println(Month.JANUARY); //not a string, it's of type Month
        System.out.println(Month.FEBRUARY);
    }
}

class Player {
    public int salaryCap = 239847; //NOT RECOMMENDED; not a good design
}
interface Players {
    int salaryCap = 23325; //public, static and final
}
interface Months {
    int JAN = 1;
    int FEB = 2;
}
enum Month {
    JANUARY,
    FEBRUARY;
}