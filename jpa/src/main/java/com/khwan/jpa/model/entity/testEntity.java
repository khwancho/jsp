package com.khwan.jpa.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AccessLevel;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Entity
@Data
@Getter
@Setter
@Table(name="test")
public class testEntity {
	
	@Id
	private long testId;
	
	private String test1;
	private String test2;
	private int test3;
	private long test4;
	@CreatedDate
	private LocalDateTime test5;
	private String test6;
	
	

}
