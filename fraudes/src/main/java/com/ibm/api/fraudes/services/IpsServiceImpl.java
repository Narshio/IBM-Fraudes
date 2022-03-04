package com.ibm.api.fraudes.services;

import com.ibm.api.fraudes.exeptions.NotFoudException;
import com.ibm.api.fraudes.models.entities.Ips;
import com.ibm.api.fraudes.repositories.IpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class IpsServiceImpl implements IpsService{

    @Autowired
    private IpsRepository ipsRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Ips> shearchAll() {
        return (List<Ips>) ipsRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Ips> shearchByName(String code) {
        Optional<Ips> ip = ipsRepository.shearchByCode(code);

        if(!ip.isPresent())
            throw new NotFoudException(String.format("The IP don't exist", code));

        return ip;
    }
}
