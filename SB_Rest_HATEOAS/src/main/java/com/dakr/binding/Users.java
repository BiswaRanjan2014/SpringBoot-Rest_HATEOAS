package com.dakr.binding;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users extends RepresentationModel<Users>{

	private Integer id;
	private String name;
	private String email;
}
