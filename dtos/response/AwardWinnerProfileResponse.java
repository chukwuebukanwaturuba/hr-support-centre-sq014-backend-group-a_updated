package com.hrsupportcentresq014.dtos.response;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AwardWinnerProfileResponse {
    private String firstName;
    private String lastName;
    private String nickName;
    private String position;
    private String phoneNo;
    private String email;
    private LocalDate startDate;
    private String department;
    private String workLocation;
    private String reportTo;
    private String awards;
    private String certifications;
}
