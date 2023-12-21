package com.projectBackend.project.dto;

import com.projectBackend.project.entity.Member;
import com.projectBackend.project.entity.Music;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class MusicHeartDto {
    private Long heartCheckerId;
    private Long musicId;
    private Long id;
    private String userEmail;
}
