package com.allometry.org;


import com.allometry.org.model.*;
import com.allometry.org.service.ClientService;
import com.allometry.org.service.DomainService;
import com.allometry.org.service.ProjectService;
import com.allometry.org.service.TechnologyService;
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

    @Autowired
    ClientService clientService;
    @Autowired
    TechnologyService technologyService;

    @Autowired
    ProjectService projectService;



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

    @PostMapping("/api/client")
    public  void addClient(@RequestBody Client str){
        System.out.println(str);
        str.setCreated(new Date());
        str.setDomain(new Domain());
        str.setModified(new Date());
        str.setLocation(null);
      clientService.addClient(str);
    }
    @GetMapping("/api/client/{str}")
    public  Client getClient(@PathVariable("str") String str){
        System.out.println(clientService.getCientByName(str));

        return clientService.getCientByName(str);
    }

    @PostMapping("/api/technology")
    public  Technology addTechnology(@RequestBody Technology name  ){

        System.out.println(name.getTechnologyName());
        System.out.println(name.getType());

        return technologyService.addTechnology(name);

    }


    @GetMapping("/api/technologies")
    public  List<Technology> addAllTechnologies(  ){ 
        return technologyService.getAllTechnologies();
    }


    @RequestMapping(value = "/api/domain", method = RequestMethod.POST)
    public void getASA(@RequestBody Domain str) {
        System.out.println(str);

        str.setCreated(new Date());
        str.setModified(new Date());
       domainService.addDomain(str);
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


    @RequestMapping(value = "/api/clients", method = RequestMethod.GET)
    public ResponseEntity<List<Client>> getAallClients() {

        List<Client> lst = clientService.getAllClients();


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(httpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");



        httpHeaders.setAccessControlAllowCredentials(true);
        ResponseEntity<List<Client>> listEntity = new ResponseEntity<List<Client>>(lst, httpHeaders, HttpStatus.OK);
        return listEntity;

    }





    @RequestMapping(value = "/api/project", method = RequestMethod.POST)
    public void addProject(@RequestBody project2 project) {

        System.out.println(project.toString());

        Project proj = new Project(project.getName(),new Date(),0,new Date(), new Date(), clientService.getCientByName(project.getClient()));

        System.out.println(proj.toString());

        projectService.save(proj);

    }



   static class project2{
    private    String name;
    private    String client;
    private    String domain;

        @Override
        public String toString() {



            return  "project2{" +
                    "name='" + name + '\'' +
                    ", client='" + client + '\'' +
                    ", domain='" + domain + '\'' +
                    '}';
        }

        public project2() {
        }

        public project2(String name, String client, String domain) {
            this.name = name;
            this.client = client;
            this.domain = domain;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getClient() {
            return client;
        }

        public void setClient(String client) {
            this.client = client;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }
    }
}
