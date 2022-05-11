package mserv.user.web;

import io.swagger.annotations.ApiOperation;

import io.swagger.annotations.ApiResponse;

import mserv.user.domain.service.UserService;
import mserv.user.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    @ApiOperation("Get all user")
    @ApiResponse(code=200, message="OK")
    public ResponseEntity<List<User>> getAll(){

        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int userId) {
        if (userService.delete(userId)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
