package ru.netology.filmmanager.manager;

import ru.netology.filmmanager.domain.Film;

public class FilmManager {

    private int desiredNumberOfFilms;
    private Film[] films = new Film[0];

    public FilmManager() {
        this.desiredNumberOfFilms = 10;
    }

    public FilmManager(int desiredNumberOfFilms) {
        this.desiredNumberOfFilms = desiredNumberOfFilms;
    }

    public void addFilm(Film film) {
        Film[] tmp = new Film[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] getLast() {
        int count;
        if (films.length < desiredNumberOfFilms) {
            count = films.length;
        } else {
            count = desiredNumberOfFilms;
        }
        Film[] result = new Film[count];
        for (int i = 0; i < count; i++) {
            result[i] = films[films.length - 1 - i];
        }

        return result;
    }

    public Film[] getFilms() {
        return films;
    }
}
