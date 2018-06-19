/**
 * 
 */
package com.rc.metro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Ramu
 *
 */
@Data
@Setter
@Getter
@ToString
@Builder
public class MetroResponse {

	private String name;
	private Long Id;
	}
