package mserv.user.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="Users")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	Integer id;
    @Column(name="Name")
	String name;
	@Column(name="Email")
	String email;
	@Column(name="Password")
	String password;
	@Column(name="Created")
	LocalDateTime creationDate;
	@Column(name="Modified")
	LocalDateTime modifiedDate;
	@Column(name="Last_Login")
	LocalDateTime last_Login;
	@Column(name="Token")
	String token;
	@Column(name="isActive")
	int isActive;
}
