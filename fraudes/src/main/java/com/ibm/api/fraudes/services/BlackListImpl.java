package com.ibm.api.fraudes.services;


import com.ibm.api.fraudes.exeptions.NotFoudException;
import com.ibm.api.fraudes.repositories.BlackListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class BlackListImpl implements BlackList {

    @Autowired
    private BlackListRepository blackListRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<com.ibm.api.fraudes.models.entities.BlackList> shearchByIp(String ip) {

        Optional<com.ibm.api.fraudes.models.entities.BlackList> blackip = blackListRepository.shearchByIp(ip);

       if(!blackip.isPresent())
            throw new NotFoudException(("The IP" + ip + "it's NOT on the blacklist "));
       return blackip;
    }
}
