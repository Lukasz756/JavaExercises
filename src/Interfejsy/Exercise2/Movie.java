package Interfejsy.Exercise2;

public class Movie {
    private String title;
    private String director;
    private int year;
    private String category;
    private String publisher;


    public Movie(String title, String director, int year, String category, String publisher) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.category = category;
        this.publisher = publisher;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    static class MovieCreator {
        private String title;
        private String director;
        private int year;
        private String category;
        private String publisher;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setYear(int year) {
            this.year = year;
            return this;
        }

        public MovieCreator setCategory(String category) {
            this.category = category;
            return this;
        }

        public MovieCreator setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Movie createMovie(){
            Movie movie = new Movie(title,director,year,category,publisher);
            return movie;
        }
    }
}