package com.ibm.api.fraudes.controllers;

import com.ibm.api.fraudes.Mapper.IpsMapper;
import com.ibm.api.fraudes.models.dto.IpsDTO;
import com.ibm.api.fraudes.models.entities.Ips;
import com.ibm.api.fraudes.services.IpsService;
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
@RequestMapping("/Ips")
public class IpsController {
    private final static Logger logger = LoggerFactory.getLogger(IpsController.class);

    @Autowired
    private IpsService ipsService;


    @GetMapping("/List")
    public ResponseEntity<?> consultingAllIps(){
        List<Ips> ips = ipsService.shearchAll();

        return  new ResponseEntity<List<Ips>>(ips, HttpStatus.OK);
    }

    @GetMapping("/view/ip/{name}.{ip}")
    public ResponseEntity<?> consultIps(@PathVariable String name, @PathVariable String ip){
        Optional<Ips> ips = null;

        try{
            ips = ipsService.shearchByName(name);
        }
        catch (Exception e){
            logger.info(e.getMessage());
            throw e;
        }

        List<IpsDTO> ipsDTOS = ips.stream().map(IpsMapper::mapIps).collect(Collectors.toList());

        return new ResponseEntity<List<IpsDTO>>(ipsDTOS,HttpStatus.OK);
    }
}
