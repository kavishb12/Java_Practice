package academy.learnjava;

public class Wall {
    double height,width;
    public Wall(double height, double width) {

        System.out.println("Constructor with paramteter called");
        this.height=height;
        this.width=width;

        if(height<0){
            this.height = 0;
        }
        if(width<0){
            this.width=0;
        }

    }
    public Wall(){
        System.out.println("Empty constructor called");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            this.height = 0;
        }
        else{
            this.height = height;
        }

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            this.width=0;
        }
        else{
            this.width = width;
        }

    }
    public double getArea(){
        return width*height;
    }
}
