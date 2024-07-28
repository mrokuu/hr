package org.example.command.user;

import lombok.RequiredArgsConstructor;
import org.example.dto.UserDto;
import org.example.mediator.RequestHandler;
import org.example.model.User;
import org.example.repository.user.UserCommandRepository;
import org.example.response.DataResult;
import org.example.response.SuccessDataResult;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserCommandHandler implements RequestHandler<CreateUserCommand, DataResult<UserDto>> {
    private final UserCommandRepository userCommandRepository;
    @Override
    public DataResult<UserDto> handle(CreateUserCommand command) {
        User user = userCommandRepository.save(mapToUser(command));
        return new SuccessDataResult<>(maptoUserDto(user), "Task has been created!!!");
    }
    private UserDto maptoUserDto(User user) {

        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .build();
    }

    private User mapToUser(CreateUserCommand command) {
        return User.builder()
                .id(command.id())
                .name(command.name())
                .build();
    }
}
