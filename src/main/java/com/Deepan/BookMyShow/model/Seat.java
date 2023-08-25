package com.Deepan.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{

    private int row;
    private int col;

    @ManyToOne
    private SeatType seatType;

    private String seatNumber;
}
