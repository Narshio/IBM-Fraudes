package com.ibm.api.fraudes.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ipList")
public class Ips implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "code", nullable = false)
    private Integer code;



    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "symbol", nullable = false)
    private String symbol;


    @Column(name = "mony", nullable = false)
    private String mony;


    @Column(name = "change", nullable = false)
    private String change;

    @Column(name = "date-creation", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datecreation;

    @Transient
    private Integer puerto;
}
