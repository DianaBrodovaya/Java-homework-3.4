package ru.netology.filmmanager.manager;

import org.junit.jupiter.api.Test;
import ru.netology.filmmanager.domain.Film;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManagerCustomTest {

    private FilmManager filmManager = new FilmManager(5);
    private Film film1 = new Film("1", "url1", "name1", "genre1");
    private Film film2 = new Film("2", "url2", "name2", "genre2");
    private Film film3 = new Film("3", "url3", "name3", "genre3");
    private Film film4 = new Film("4", "url4", "name4", "genre4");
    private Film film5 = new Film("5", "url5", "name5", "genre5");
    private Film film6 = new Film("6", "url6", "name6", "genre6");
    private Film film7 = new Film("7", "url7", "name7", "genre7");
    private Film film8 = new Film("8", "url8", "name8", "genre8");
    private Film film9 = new Film("9", "url9", "name9", "genre9");
    private Film film10 = new Film("10", "url10", "name10", "genre10");
    private Film film11 = new Film("11", "url11", "name11", "genre11");
    private Film film12 = new Film("12", "url12", "name12", "genre12");
    private Film film13 = new Film("13", "url13", "name13", "genre13");
    private Film film14 = new Film("14", "url14", "name14", "genre14");
    private Film film15 = new Film("15", "url15", "name15", "genre15");
    private Film film16 = new Film("16", "url16", "name16", "genre16");

    @Test
    public void shouldAddFilm() {
        filmManager.addFilm(film1);
        filmManager.addFilm(film2);
        filmManager.addFilm(film3);
        Film[] expected = new Film[]{film1, film2, film3};
        assertArrayEquals(expected, filmManager.getFilms());
    }

    @Test
    public void shouldGetLastWithLessThenDesiredFilms() {
        filmManager.addFilm(film1);
        filmManager.addFilm(film2);
        filmManager.addFilm(film3);
        Film[] expected = new Film[]{film3, film2, film1};
        assertArrayEquals(expected, filmManager.getLast());
    }

    @Test
    public void shouldGetLastWithMoreThenDesiredFilms() {
        filmManager.addFilm(film1);
        filmManager.addFilm(film2);
        filmManager.addFilm(film3);
        filmManager.addFilm(film4);
        filmManager.addFilm(film5);
        filmManager.addFilm(film6);
        filmManager.addFilm(film7);
        filmManager.addFilm(film8);
        filmManager.addFilm(film9);
        filmManager.addFilm(film10);
        filmManager.addFilm(film11);
        filmManager.addFilm(film12);
        filmManager.addFilm(film13);
        filmManager.addFilm(film14);
        filmManager.addFilm(film15);
        filmManager.addFilm(film16);
        Film[] expected = new Film[]{film16, film15, film14, film13, film12};
        assertArrayEquals(expected, filmManager.getLast());
    }

    @Test
    public void shouldGetLastWithDesiredFilms() {
        filmManager.addFilm(film1);
        filmManager.addFilm(film2);
        filmManager.addFilm(film3);
        filmManager.addFilm(film4);
        filmManager.addFilm(film5);
        Film[] expected = new Film[]{film5, film4, film3, film2, film1};
        assertArrayEquals(expected, filmManager.getLast());
    }

    @Test
    public void shouldGetLastWithZeroFilms() {
        Film [] expected = new Film[0];
        assertArrayEquals(expected, filmManager.getLast());
    }
}