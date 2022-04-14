package com.swathi.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "studentinfo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = true, name = "First_Name")
	private String firstname;
	@Column(nullable = true, name = "Last_Name")
	private String lastname;
	@Column(nullable = true, name = "Email")
	private String email;

}
