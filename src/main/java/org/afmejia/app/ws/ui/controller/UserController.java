package org.afmejia.app.ws.ui.controller;

import org.afmejia.app.ws.ui.model.request.UserDetailsRequestModel;
import org.afmejia.app.ws.ui.model.response.UserRest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    // @GetMapping(path="/{userId}")
    // public String getUser(@PathVariable String userId) {
    //     return "get user was called with userId = " + userId;
    // }

    // @GetMapping(path="/{userId}",
    //             produces = {
    //                 MediaType.APPLICATION_XML_VALUE,
    //                 MediaType.APPLICATION_JSON_VALUE
    //             })
    // public UserRest getUser(@PathVariable String userId) {
    //     UserRest returnValue = new UserRest();
    //     returnValue.setEmail("andres@rise.agency");
    //     returnValue.setFirstName("Felipe");
    //     returnValue.setLastName("Mejia");
        
    //     return returnValue;
    // }

    @GetMapping(path="/{userId}",
                produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
                })
    public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail("andres@rise.agency");
        returnValue.setFirstName("Felipe");
        returnValue.setLastName("Mejia");
        
        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
    }

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page, 
                           @RequestParam(value = "limit", defaultValue = "25") int limit,
                           @RequestParam(value = "sort", defaultValue = "desc", required = false) String sort) {
        return "get user was called with page = " + page + ", limit = " + limit + " and sort = " + sort;
    }

    @PostMapping(
        consumes = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
        },
        produces = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
        }
    )
    public ResponseEntity<UserRest> crateUser(@RequestBody UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());
        
        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
    }

    @PutMapping
    public String updateUser() {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}
