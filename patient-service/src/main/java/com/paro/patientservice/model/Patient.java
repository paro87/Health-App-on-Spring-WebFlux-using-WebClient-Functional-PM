package com.paro.patientservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@ToString(exclude = "id")
@Getter
@Setter
@Document
public class Patient {
    @Id
    private String id;

    public Patient(Long patientId, String firstname, String surname, Long hospitalId, Long departmentId) {
        this.patientId = patientId;
        this.firstname = firstname;
        this.surname = surname;
        this.hospitalId = hospitalId;
        this.departmentId = departmentId;
    }

    private Long patientId;

    private String firstname;

    private String surname;

    private Long hospitalId;

    private Long departmentId;

}


