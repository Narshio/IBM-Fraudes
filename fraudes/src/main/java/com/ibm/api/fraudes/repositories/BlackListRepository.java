package com.ibm.api.fraudes.repositories;

import com.ibm.api.fraudes.models.entities.BlackList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BlackListRepository extends CrudRepository<BlackList, Long> {

    @Query("select p from blackList where p.ip=?1")
    public Optional<BlackList> shearchByIp(String ip);
}
