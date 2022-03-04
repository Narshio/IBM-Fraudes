package com.ibm.api.fraudes.models.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BlackListDTO implements Serializable {

    private String ip;
}
