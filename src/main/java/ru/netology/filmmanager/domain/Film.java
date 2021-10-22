package ru.netology.filmmanager.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Film {
    private String id;
    private String imageUrl;
    private String name;
    private String genre;
}
