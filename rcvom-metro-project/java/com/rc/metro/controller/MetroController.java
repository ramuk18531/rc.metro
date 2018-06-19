/**
 * 
 */
package com.rc.metro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rc.metro.model.MetroRequest;
import com.rc.metro.model.MetroResponse;
import com.rc.metro.service.MetroService;

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

		log.info("Metro controller invoked");
		return metroResponse;

	}
}
