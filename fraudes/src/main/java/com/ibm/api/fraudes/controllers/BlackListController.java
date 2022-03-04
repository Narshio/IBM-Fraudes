package com.ibm.api.fraudes.controllers;


import com.ibm.api.fraudes.Mapper.BlackListMapper;
import com.ibm.api.fraudes.models.dto.BlackListDTO;
import com.ibm.api.fraudes.services.BlackList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/BlackList")
public class BlackListController {
    private final static Logger logger = LoggerFactory.getLogger(BlackListController.class);

    @Autowired
    private BlackList List;

    @GetMapping("/BlackList/ip/{ip}")
    public ResponseEntity<?> ConsultAll(@PathVariable String ip){

        Optional<com.ibm.api.fraudes.models.entities.BlackList> blackList = null;

        try{
            blackList = List.shearchByIp(ip);
        }
        catch (Exception e){
            logger.info(e.getMessage());
            throw e;
        }

        List<BlackListDTO> blackListDTOS = blackList.stream().map(BlackListMapper::mapBlackList).collect(Collectors.toList());

        return new ResponseEntity<List<BlackListDTO>>(blackListDTOS, HttpStatus.OK);
    }

}
