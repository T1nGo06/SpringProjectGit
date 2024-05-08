//package com.talant.springprojectgit.controllerstest;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//@RestController
//@RequestMapping(value = "/api")
//public class TestControllerTest {
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    void testSayHello_OK(){
//        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:" + this.port + "/api/test-1")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(js)
//
//    }
//
//    public String sayHello(){
//        return "Hello, World!";
//    }
//}
