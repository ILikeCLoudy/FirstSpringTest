package com.example.testpage;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {
    @GetMapping
    public String users() {
        return "get users";
    }
    @PostMapping
    public String addUser() {
        return "post user";
    }
    @GetMapping("/{userID}")
        public String findUser(@PathVariable("userID") String userID) {
        return "get UserID = " + userID;
    }
    @PatchMapping("/{userID}")
        public String updateUser(@PathVariable("userID") String userID) {
        return "update userID = " + userID;
    }
    @DeleteMapping("/{userID}")
        public String deleteUser(@PathVariable("userID") String userID) {
        return "delete userID = " + userID;
    }
}
