package pl.fantasypredictor.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "public", catalog = "typer1")
@Data
public class UserEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Basic
    @Column(name = "login")
    private String login;

    @Basic
    @Column(name = "password")
    private String password;
}
