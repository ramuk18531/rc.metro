/**
 * 
 */
package com.rc.metro.service;

import org.springframework.stereotype.Service;

import com.rc.metro.model.MetroRequest;
import com.rc.metro.model.MetroResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
/**
 * @author Ramu
 *
 */
@Service
@RequiredArgsConstructor
public class MetroService {
	
	public MetroResponse getDetails(MetroRequest request) {
		
		MetroResponse metroResponse = MetroResponse.builder()
									  .name("Ramu")
									  .Id(request.getPassangerId())
									  .build();
		return metroResponse;
	}
}
