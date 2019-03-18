/**
 * 
 */
package com.rk.metro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.metro.model.MetroRequest;
import com.rk.metro.model.MetroResponse;
import com.rk.metro.service.MetroService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
/**
 * @author Ramu
 *
 */

@RestController
@RequiredArgsConstructor
@Slf4j
public class MetroController {

	private final MetroService metroService;

	@GetMapping(value = "/")
	public @ResponseBody MetroResponse getPassanger(@ModelAttribute MetroRequest request) {

		log.info("Metro controller");
		MetroResponse metroResponse = metroService.getDetails(request);
		if(metroResponse == null) {
			metroResponse = metroResponse.builder().name("NameNotFound").build();
		}
		log.info("Metro controller invoked");
		return metroResponse;

	}




	@GetMapping(value = "getTripDetails/")
	public @ResponseBody MetroResponse getTripDetails(@ModelAttribute String fromStation, String toStation) {

		log.info("Metro controller");
		MetroResponse metroResponse = metroService.getTripDetails( fromStation,  toStation);
		if(metroResponse == null) {
			metroResponse = metroResponse.builder().name("NameNotFound").build();
		}
		log.info("Metro controller invoked");
		return metroResponse;

	}

}
