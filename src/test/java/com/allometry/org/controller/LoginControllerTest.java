package com.allometry.org.controller;

import com.allometry.org.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(LoginController.class)
class LoginControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    private JacksonTester<User> jsonTester;
    private User personDTO;

    @BeforeEach
    void setUp() {
        JacksonTester.initFields(this, objectMapper);
        personDTO = new User();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void register() {
    }

    @Test
    void login() throws Exception {
        final String personDTOJson = jsonTester.write(personDTO).getJson();
        mockMvc
                .perform(post("/persistPerson").content(personDTOJson).contentType(APPLICATION_JSON_UTF8))
                .andExpect(status().isCreated());
    }

    @Test
    void alllogin() {
    }

    @Test
    void getUser() {
    }

    @Test
    void getUserName() {
    }

    @Test
    void addUser() {
    }
}