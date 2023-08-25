package com.Deepan.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Screen screen;


    @OneToMany
    private List<ShowSeat> showSeats;

    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Movie movie;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;

}
