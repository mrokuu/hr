package org.example.command.User;

import org.example.BaseController;
import org.example.command.user.CreateUserCommand;
import org.example.dto.UserDto;
import org.example.mediator.Mediator;
import org.example.response.DataResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserCommandController extends BaseController {
    public UserCommandController(Mediator mediator) {
        super(mediator);
    }

    @PostMapping()
    public ResponseEntity<DataResult<UserDto>> createUser(@RequestBody CreateUserCommand command){
        return ResponseEntity.ok(mediator.send(command));
    }


}
