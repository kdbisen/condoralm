package com.allometry.org;


import com.allometry.org.model.*;
import com.allometry.org.service.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private DomainService domainService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private TechnologyService technologyService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private UserService userService;
    @Autowired
    private AnswerService answerService;
    @Autowired
    private VoteService voteService;
    Logger log = LoggerFactory.getLogger(MyRestController.class);







    MyRestController() {
        log.info("************ MyRestController created ************");
    }

    @PostMapping("/api/castvote")
    public  void castVote(@RequestBody Vote str){
        System.out.println(str.toString());

        voteService.castVote(str);
    }


    @GetMapping("/api/checkcastvote/{que_id}/{user_id}")
    public  boolean checkCastVote(@PathVariable("que_id") String que_id, @PathVariable("user_id") String user_id){
        return   voteService.isVoteAlreadyByUserForPerticularQuestion(que_id,user_id);

    }
    @RequestMapping(value = "/api/employee", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> myEmpl() {
        List<Employee> lst = new ArrayList<>();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(httpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        httpHeaders.setAccessControlAllowCredentials(true);
        ResponseEntity<List<Employee>> listEntity = new ResponseEntity<List<Employee>>(lst, httpHeaders, HttpStatus.OK);
        return listEntity;
    }

    @PostMapping("/api/client")
    public  void addClient(@RequestBody Client str){
        str.setCreated(new Date());
        str.setDomain(new Domain());
        str.setModified(new Date());
        str.setLocation(null);
        clientService.addClient(str);
    }

    @PostMapping("/api/answer")
    public  void addAnswer(@RequestBody Answer str){

        System.out.println(str.toString());
        str.setCreated(new Date());
        str.setModified(new Date());
        str.setUser(userService.getUserById(str.getUser_id()));
        System.out.println(str.toString());
        answerService.save(str);
    }


    @GetMapping("/api/upvote/{que_id}")
    public  int getUpVote(@PathVariable("que_id") String que_id){

        return voteService.getUpVoteByQueId(que_id);
    }

    @GetMapping("/api/downvote/{que_id}")
    public  int getDownVote(@PathVariable("que_id") String que_id){

        return voteService.getDownByQueId(que_id);
    }
    @PostMapping("/api/comment")
    public Comment addComment(@RequestBody Comment str){
                str.setComment_date(new Date());

        str.setUser(userService.getUserById(str.getUser_id()));
        return commentService.save(str);
    }


    @PostMapping("/api/employee")
    public  void addClient(@RequestBody Employee emp){
        employeeService.save(emp);
    }


    @GetMapping("/api/client/{str}")
    public  Client getClient(@PathVariable("str") String str){

        return clientService.getCientByName(str);
    }

    @PostMapping("/api/technology")
    public  Technology addTechnology(@RequestBody Technology name  ){

         return technologyService.addTechnology(name);
    }

    @PostMapping("/api/question")
    public  Question addQuestion(@RequestBody Question question  ){

        System.out.println(question);
        question.setCreated(new Date());
        question.setModified(new Date());
        return questionService.save(question);
    }
    @GetMapping("/api/technologies")
    public  List<Technology> addAllTechnologies(  ){
        return technologyService.getAllTechnologies();
    }


    @GetMapping("/api/questions")
    public  List<Question> addAllQuestions(  ){
        return questionService.getAllQuestion();
    }

    @GetMapping("/api/comments/{que_id}")
    public  List<Comment> getAllCOmmentsByQueId(@PathVariable("que_id") String que_id  ){
        return commentService.findAllCommnetsByQueId(que_id);
    }



    @GetMapping("/api/employies")
    public  List<Employee> addAllEmployees(  ){
        return employeeService.getAllEmployee();
    }


    @GetMapping("/api/answers/{que_id}")
    public  List<Answer> addAllAnswer( @PathVariable("que_id") String que_id ){
        return answerService.getAllAnswerByQueId(que_id);
    }

    @GetMapping("/api/projects")
    public  List<project2> addAllProjects(  ){
        List<project2> lstp2 = new ArrayList<project2>();

        List<Project> lstproj = projectService.getAllProjects();

        for (Project pr: lstproj   ) {
            lstp2.add(new project2(pr.getProjectName(), pr.getClient().getClientName(), null));

        }
        return lstp2;
    }

    @RequestMapping(value = "/api/domain", method = RequestMethod.POST)
    public void getASA(@RequestBody Domain str) {
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


    @RequestMapping(value = "/api/question/{questionid}", method = RequestMethod.GET)
    public ResponseEntity<Question> getQuestion(@PathVariable("questionid") String questionid) {


        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(httpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        httpHeaders.setAccessControlAllowCredentials(true);
        ResponseEntity<Question> listEntity = new ResponseEntity<Question>(questionService.findQuestion(questionid), httpHeaders, HttpStatus.OK);
        return listEntity;

    }




    @RequestMapping(value = "/api/project", method = RequestMethod.POST)
    public void addProject(@RequestBody project2 project) {
        Project proj = new Project(project.getName(),new Date(),0,new Date(), new Date(), clientService.getCientByName(project.getClient()));
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
