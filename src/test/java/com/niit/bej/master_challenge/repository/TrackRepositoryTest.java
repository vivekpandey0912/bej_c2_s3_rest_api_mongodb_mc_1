package com.niit.bej.master_challenge.repository;

import com.niit.bej.master_challenge.domain.Artist;
import com.niit.bej.master_challenge.domain.Track;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@DataMongoTest
class TrackRepositoryTest {


    Track track;
    Artist artist;
    @Autowired
    TrackRepository trackRepository;

    @BeforeEach
    void setUp() {
        artist = new Artist(1,"Arijit");
        track = new Track(2,"Rom",4,artist);

    }

    @AfterEach
    void tearDown() {
        artist = null;
        track = null;
        trackRepository.deleteAll();
    }


    @Test
    @DisplayName("Get All Track Test case")
    void getAllTrack()
    {
        trackRepository.save(track);
        List<Track> trackList = trackRepository.findAll();
        assertEquals(1,trackList.size());
    }
    @Test
    @DisplayName("Add Tracks Test")
    void AddTrack()
    {

    }









    @Test
    void findByTrackArtistName() {
    }


    @Test
    void findByRatingGreaterThanEqual() {
    }
}