package com.ibm.api.fraudes.models.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Optional;

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "blackList")
public abstract class BlackList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "ip", nullable = false)
    private String ip;

    @Column(name = "date-creation", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datecreation;

    @Transactional(readOnly = true)
    public abstract Optional<BlackList> sheach(String ip);
}
