package com.cognizant.membermicroservice.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	@Setter
	@Component
	public class SubmitStatusDTO {
		private String submitStatus;
		private String submitdescription;
	

}
