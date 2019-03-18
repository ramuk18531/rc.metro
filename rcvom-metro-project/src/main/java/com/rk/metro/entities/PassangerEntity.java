/**
 * 
 */
package com.rk.metro.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Ramu
 *
 */
@Entity
@Table(name="passanger_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PassangerEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name="Passanger_Id")
	private Long passangerId;
	
	@Column(name="User_Name")
	private String name;
	
	
}
