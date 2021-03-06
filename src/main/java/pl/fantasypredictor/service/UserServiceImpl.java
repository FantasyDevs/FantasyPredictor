package pl.fantasypredictor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.fantasypredictor.dto.UserDto;
import pl.fantasypredictor.mapper.UserMapper;
import pl.fantasypredictor.model.UserEntity;
import pl.fantasypredictor.repository.UserRepository;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public UserDto createUser(UserDto userDto) {
        UserEntity userEntity = userMapper.toEntity(userDto);
        userEntity = userRepository.save(userEntity);
        return userMapper.toDto(userEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserDto> getUsers() {
        return userMapper.toDtoList(userRepository.findAll());
    }

    @Override
    @Transactional(readOnly = true)
    public UserDto getUserByLogin(String login) {
        return userMapper.toDto(userRepository.findByLogin(login));
    }
}
