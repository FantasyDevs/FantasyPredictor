package pl.fantasypredictor.mapper;

import org.springframework.stereotype.Component;
import pl.fantasypredictor.dto.UserDto;
import pl.fantasypredictor.model.UserEntity;

@Component
public class UserMapper extends GenericMapper<UserDto, UserEntity> {

    public UserMapper(Class<UserDto> dtoClass, Class<UserEntity> entityClass) {
        super(dtoClass, entityClass);
    }


    //adding sth more to mapper
    @Override
    public UserDto toDto(UserEntity entity) {
        UserDto dto = super.toDto(entity);
        //do sth more if you want to
        return dto;
    }

}
