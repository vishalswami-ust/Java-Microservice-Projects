package com.rest.jpa.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyErrorResponse {
	private String message;
	private String errorcode;
	private Date time;

}
