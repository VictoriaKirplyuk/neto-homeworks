package dev.victoria;

// Цена книги теперь рассчитывается как 3 рубля за страницу, умноженное на квадратный корень из
// рейтинга, после чего округлённое вниз, но не меньше 250 рублей. Для вычисления квадратного
// корня воспользуйтесь командой Math.sqrt, округления вниз -
// Math.floor с приведением к целому числу - (int) Math.floor(…).

public class Author {
    private String name;
    private String surname;
    private int rating;

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", rating=" + rating +
                '}';
    }
}
