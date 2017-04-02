package pl.fantasypredictor.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users", schema = "public", catalog = "typer")
@Data
public class UserEntity {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Basic
    @Column(name = "login")
    private String login;

    @Basic
    @Column(name = "password")
    private String password;

    private Timestamp creationDate;

}
