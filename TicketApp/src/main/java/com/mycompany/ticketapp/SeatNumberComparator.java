package com.mycompany.ticketapp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SeatNumberComparator implements Comparator<Ticket>{
    @Override
    public int compare(Ticket t1, Ticket t2) {
        return t1.seatNumber - t2.seatNumber;
    }
    void SortAndPrint(List<Ticket> tickets){
        SeatNumberComparator seatComp = new SeatNumberComparator();
        Collections.sort(tickets, seatComp);
        for(Ticket t: tickets){
            t.print();
        }
    }
}

