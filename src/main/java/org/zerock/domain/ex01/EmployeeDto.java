package org.zerock.domain.ex01;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmployeeDto {
	private String firstName;
	private String lastName;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate birthDate;
	private String photo;
	private String notes;
}
