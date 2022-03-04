package com.ibm.api.fraudes.models.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class IpsDTO implements Serializable {

    private String code;
    private String name;
    private String symbol;
    private String change;



}
