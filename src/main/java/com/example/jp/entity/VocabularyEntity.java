package com.example.jp.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "Vocabulary")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VocabularyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vocabularyId;

    @Column(name = "word")
    private String word;

    @Column(name = "hiragana")
    private String hiragana;

    @Column(name = "means")
    private String means;

    @Column(name = "more")
    private String more;

    @Column(name = "level")
    private String level;
}
