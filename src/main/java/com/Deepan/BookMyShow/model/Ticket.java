package com.Deepan.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    @ManyToMany
    private List<ShowSeat> showSeats;

    private Date bookedAt;

    @OneToMany
    private List<Payment> payments;

    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;

    private double amount;

}
