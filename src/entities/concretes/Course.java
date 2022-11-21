package entities.concretes;

public class Course extends Entity {

    private  Double price;
    private Instructor instructor;
    private Category category;



    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "price=" + price +
                ", instructor=" + instructor.name +
                ", category=" + category.name +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
