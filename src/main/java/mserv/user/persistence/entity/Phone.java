package mserv.user.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Phones")
@Data
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_Phones")
	Integer id_Phones;
	@Column(name="Number")
	String number;
	@Column(name="cityCode")
	String cityCode;
	@Column(name="countryCode")
	String countryCode;
	@Column(name="Id_User")
	int idUser;
	
	
	

}
