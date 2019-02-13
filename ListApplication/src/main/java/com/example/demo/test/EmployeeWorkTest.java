package com.example.demo.test;


import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Employee;

import io.restassured.RestAssured;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeWorkTest {
	@BeforeClass
    public static void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    }
 
    @Test
    public void testUserFetchesSuccess() {
        get("/addEmployee")
        .then()
        .body("employID", equalTo(12))
        .body("employName", equalTo("Vinod"))
        .body("salary", equalTo("15000"))
        .body("address", equalTo("CEO"));
        
        Employee emp =new Employee();
        post("/addEmployee",emp).then().body()
    }
}
