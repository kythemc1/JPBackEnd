package com.example.jp.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "grammars")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GrammarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long grammarId;

    @Column(name = "grammar")
    private String grammar;

    @Column(name = "means")
    private String means;

    @Column(name = "example")
    private String example;

    @Column(name = "more")
    private String more;

    @Column(name = "level")
    private String level;

}

