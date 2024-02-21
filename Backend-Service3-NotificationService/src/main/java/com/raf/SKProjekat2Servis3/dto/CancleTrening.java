package com.raf.SKProjekat2Servis3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CancleTrening {
    private Integer korisnikIdCard;

    private Integer managerIdCard;
    private LocalDateTime startTrening;
    private String salaNaziv;
}
