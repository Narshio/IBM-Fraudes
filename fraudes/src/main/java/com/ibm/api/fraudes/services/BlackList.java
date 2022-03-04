package com.ibm.api.fraudes.services;

import java.util.Optional;

public interface BlackList {

    public Optional<com.ibm.api.fraudes.models.entities.BlackList> shearchByIp(String ip);
}
