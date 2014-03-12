package com.home.dy.entities;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Project: SpringData
 * Author: Yermiichuk Dmitrii
 * Date: 3/11/14
 */
@Entity
@Table
public class Dummy implements Serializable {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	@Column
	private String name;

	public Dummy() {
	}

	public Dummy(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
