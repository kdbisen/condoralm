package com.allometry.org;


import com.allometry.org.model.Domain;
import com.allometry.org.model.Employee;
import com.allometry.org.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kuldeep.bisen on 7/10/2017.
 */

@RestController
@CrossOrigin(origins = "*")
public class MyRestController {
    @Autowired
    DomainService domainService;

    MyRestController() {
        System.out.println("************ MyRestController created ************");
    }


    @RequestMapping(value = "/api/employee", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> myEmpl() {

        System.out.println("called  ... ");
        List<Employee> lst = new ArrayList<>();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(httpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");

        httpHeaders.setAccessControlAllowCredentials(true);
        ResponseEntity<List<Employee>> listEntity = new ResponseEntity<List<Employee>>(lst, httpHeaders, HttpStatus.OK);
        return listEntity;
    }


    @RequestMapping(value = "/api/domain", method = RequestMethod.POST)
    public void getASA(@RequestBody String str) {
        System.out.println(str);

        domainService.addDomain(new Domain(str, new Date(), new Date()));
    }

    @RequestMapping(value = "/api/domains", method = RequestMethod.GET)
    public ResponseEntity<List<Domain>> getAallDomain() {

        List<Domain> lst = domainService.getAllDomain();


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(httpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");



        httpHeaders.setAccessControlAllowCredentials(true);
        ResponseEntity<List<Domain>> listEntity = new ResponseEntity<List<Domain>>(lst, httpHeaders, HttpStatus.OK);
        return listEntity;

    }


}
