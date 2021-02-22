package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shubham")
public class HomeController {

    @PostMapping("/personDetails")
    public ResponseEntity<?> test(@RequestBody Person person){
        System.out.println("I am inside API");
        PersonDetails personDetails = new PersonDetails();

        if(person.getName().equalsIgnoreCase("krutika")){
            personDetails.setName(person.getName());
            personDetails.setGender("Female");
            personDetails.setAddress("Mumbai");
            personDetails.setOccupation("Security Engineer");
            personDetails.setStatus("Single");
        }
        else if(person.getName().equalsIgnoreCase("shubham")) {
            personDetails.setName(person.getName());
            personDetails.setGender("Male");
            personDetails.setAddress("Nagpur");
            personDetails.setOccupation("Application Engineer");
            personDetails.setStatus("Single");
        }else {
            personDetails = null;
        }
        return new ResponseEntity<>(personDetails, HttpStatus.OK);
    }

}
