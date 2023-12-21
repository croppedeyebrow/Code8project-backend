package com.projectBackend.project.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "musicheart")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class MusicHeart {
    @Id
    @Column(name = "heartChecker_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long heartCheckerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "music_id") // 외래키
    private Music music;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id") // 외래키
    private Member member;


    // 기존의 setMusic() 및 setMember() 메서드 수정
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }
}
