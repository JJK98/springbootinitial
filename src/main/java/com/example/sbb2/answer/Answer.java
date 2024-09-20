package com.example.sbb2.answer;

import com.example.sbb2.question.Question;
import com.example.sbb2.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Setter
@Getter
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime createDate;

    @ManyToOne //n:1관계
    private Question question;

    private LocalDateTime modifyDate;

    @ManyToMany
    Set<SiteUser> voter;
}
