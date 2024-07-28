package org.example.command.user;

import org.example.mediator.Handler;
import org.example.mediator.Request;
import org.example.vo.Name;

import java.util.UUID;

@Handler(handler = CreateUserCommandHandler.class)
public record CreateUserCommand(
        UUID id,
        Name name
) implements Request {
}
