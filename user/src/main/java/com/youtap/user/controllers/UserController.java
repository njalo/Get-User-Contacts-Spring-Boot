package com.youtap.user.controllers;

import com.youtap.user.domain.service.UserService;
import com.youtap.user.dto.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/getusercontacts")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Response> getUserContacts(@RequestParam Long userId, @RequestParam String userName) {
        return ResponseEntity.ok(userService.getUserContacts(userId, userName));
    }
}
