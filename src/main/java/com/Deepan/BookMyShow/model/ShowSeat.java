package com.Deepan.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{

    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;
    private double price;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus status;
}
