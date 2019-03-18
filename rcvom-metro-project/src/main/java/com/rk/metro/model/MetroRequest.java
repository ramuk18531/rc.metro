/**
 * 
 */
package com.rk.metro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ramu
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MetroRequest {
	private Long PassangerId;
}
