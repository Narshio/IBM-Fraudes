package com.ibm.api.fraudes.Mapper;

import com.ibm.api.fraudes.models.dto.BlackListDTO;
import com.ibm.api.fraudes.models.entities.BlackList;

public class BlackListMapper {
    public static BlackListDTO mapBlackList(BlackList blacklist ){

        BlackListDTO blackListDTO = new BlackListDTO();
        blackListDTO.setIp(blacklist.getIp());

        return  blackListDTO;
    }
}
