package com.kitaablelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT")
class student {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "MARK")
    private int mark;
    @Column(name = "NAME")
    private String name;

}
