package com.Deepan.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "RegionTable")
public class Region extends BaseModel{

    private String name;

    @OneToMany
    private List<Theatre> theatres;
}
