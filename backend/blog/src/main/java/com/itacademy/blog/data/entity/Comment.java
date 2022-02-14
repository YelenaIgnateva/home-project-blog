package com.itacademy.blog.data.entity;

import javax.persistence.*;
import java.time.OffsetDateTime;

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private User user;

    @Column(nullable = false)
    private String text;

    @Column(columnDefinition = "DATE")
    private OffsetDateTime createdOn;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Post post;

    @Column(columnDefinition = "DATE")
    private OffsetDateTime updatedOn;
}
