package org.wecancoeit.reviews;

public class Game {

    private Long id;
    private String name;
    private String image;
    private String description;
    private String review;
    private String score;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getReview() {
        return review;
    }

    public String getScore() {
        return score;
    }
    public String getImage(){
        return image;
    }

    public Game(Long id, String name,String image, String description, String review, String score) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.review = review;
        this.score = score;
    }
}
