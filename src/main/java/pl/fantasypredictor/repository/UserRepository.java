package pl.fantasypredictor.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.fantasypredictor.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>, UserRepositoryCustom {

    UserEntity findByLogin(String login);

}
