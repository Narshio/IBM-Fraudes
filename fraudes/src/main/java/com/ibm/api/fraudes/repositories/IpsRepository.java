package com.ibm.api.fraudes.repositories;


import com.ibm.api.fraudes.models.entities.Ips;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IpsRepository extends PagingAndSortingRepository<Ips, Long> {

    @Query("select p from ip p where p.name = ?1")
    public Optional<Ips> shearchByCode(String code);


}
