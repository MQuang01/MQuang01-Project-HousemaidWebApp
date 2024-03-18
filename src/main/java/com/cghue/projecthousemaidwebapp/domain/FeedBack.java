package com.cghue.projecthousemaidwebapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "feed_backs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class FeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String description;

    private Integer percent;

    @ManyToOne
    private Order order;
}
