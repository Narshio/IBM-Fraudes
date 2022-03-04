package com.ibm.api.fraudes.Mapper;

import com.ibm.api.fraudes.models.dto.IpsDTO;
import com.ibm.api.fraudes.models.entities.Ips;

public class IpsMapper {

    public static IpsDTO mapIps (Ips ips){
        IpsDTO ipsDTO = new IpsDTO();
        ipsDTO.setSymbol(ips.getSymbol());
        ipsDTO.setChange(ips.getChange());
        ipsDTO.setCode(String.valueOf(ips.getCode()));
        ipsDTO.setName(ips.getName());

        return  ipsDTO;
    }
}
