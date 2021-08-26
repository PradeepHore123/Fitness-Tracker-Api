package com.tcs.fitnesstracker;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Appointment {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer appointmentId;

	@NotBlank(message = "Trainer Name is mandatory")
	private String trainerName;

	private boolean physioRequired;
	@NotBlank(message = "Package name should be mentioned")
	private String packageName;

	private int amount;
	@Transient
	@JoinColumn
	@OneToOne(mappedBy = "appoinment")
	private User user;

}