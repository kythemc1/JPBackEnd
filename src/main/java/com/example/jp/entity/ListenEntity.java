package com.example.jp.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "Listen")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long ListenId;

    @Column(name = "url")
    private String url;

    @Column(name = "nameVideo")
    private String nameVideo;

    @Column(name = "nameAuthor")
    private String nameAuthor;

    @Column(name = "totalTime")
    private String totalTime;

    @Column(name = "note")
    private String note;

    @Column(name = "script")
    private String script;

    @Column(name = "role")
    private String role;
}
