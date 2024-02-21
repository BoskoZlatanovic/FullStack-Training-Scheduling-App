package com.raf.SKProjekat2Servis3.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Notifikacije {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String tipKorisnika;

    private String tipNotifikacije;

    private LocalDateTime datum;

    private String fingerprint;

    private String status = "WAITING";


}
