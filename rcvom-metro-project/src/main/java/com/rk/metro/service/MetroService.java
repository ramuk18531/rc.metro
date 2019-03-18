/**
 * 
 */
package com.rk.metro.service;

import org.springframework.stereotype.Service;

import com.rk.metro.entities.PassangerEntity;
import com.rk.metro.model.MetroRequest;
import com.rk.metro.model.MetroResponse;
import com.rk.metro.repository.PassangerRepository;

import lombok.RequiredArgsConstructor;
/**
 * @author Ramu
 *
 */
@Service
@RequiredArgsConstructor
public class MetroService {
	
	private final PassangerRepository passangerRepo;
	public MetroResponse getDetails(MetroRequest request) {
		
		PassangerEntity test = passangerRepo.findByPassangerId(request.getPassangerId());

		MetroResponse metroResponse  =null;
		if(test!=null) {
		metroResponse = MetroResponse.builder()
					  .name(test.getName())
					  .Id(test.getPassangerId())
					  .build();
	
		}
		return metroResponse;
	}
	
	
public MetroResponse getTripDetails(String request, String request2) {
		
	//	PassangerEntity test = passangerRepo.findByPassangerId(request);
	/*PassangerEntity test=null;
		MetroResponse metroResponse  =null;
		if(test!=null) {
		metroResponse = MetroResponse.builder()
					  .name(test.getName())
					  .Id(test.getPassangerId())
					  .build();
	
		}
*/		return null;
	}
}
