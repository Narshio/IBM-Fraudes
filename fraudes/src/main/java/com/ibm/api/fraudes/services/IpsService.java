package com.ibm.api.fraudes.services;

import com.ibm.api.fraudes.models.entities.Ips;

import java.util.List;
import java.util.Optional;

public interface IpsService {

    public List<Ips> shearchAll();
    public Optional<Ips> shearchByName(String name);
}
