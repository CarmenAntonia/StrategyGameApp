package com.strategygameapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
public class TradeResponse {
    private Long id;
    private Long matchId;
    private int from;
    private int to;
    private String give;
    private String get;
    private String status;
    private OffsetDateTime createdAt;
    private OffsetDateTime expiresAt;
    private Integer acceptedBySeat;
    private OffsetDateTime closedAt;
}
