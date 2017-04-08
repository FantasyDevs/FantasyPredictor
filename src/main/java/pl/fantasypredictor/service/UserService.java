package pl.fantasypredictor.service;

import pl.fantasypredictor.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);

    List<UserDto> getUsers();

    UserDto getUserByLogin(String login);
}
