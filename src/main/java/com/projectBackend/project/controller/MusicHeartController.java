package com.projectBackend.project.controller;


import com.projectBackend.project.service.MusicHeartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
//@CrossOrigin(origins = CORS_ORIGIN)
@RestController
@RequestMapping("/music-heart")
@RequiredArgsConstructor
public class MusicHeartController {

    private final MusicHeartService musicHeartService;

    @PostMapping("/like")
    public ResponseEntity<String> likeMusic(@RequestParam String userEmail, @RequestParam Long musicId) {
        boolean result = musicHeartService.addMusicHeart(userEmail, musicId);
        if (result) {
            return new ResponseEntity<>("음악을 좋아요에 추가했습니다.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("음악을 좋아요에 추가하지 못했습니다.", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/unlike")
    public ResponseEntity<String> unlikeMusic(@RequestParam String userEmail, @RequestParam Long musicId) {
        boolean result = musicHeartService.removeMusicHeart(userEmail, musicId);
        if (result) {
            return new ResponseEntity<>("음악 좋아요를 제거했습니다.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("음악 좋아요를 제거하지 못했습니다.", HttpStatus.BAD_REQUEST);
        }
    }
}