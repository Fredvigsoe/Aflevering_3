public class Square implements Comparable<Square> {
    int height;
    int width;

    public Square(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getPerimeter(){
        return (height * 2) + (width * 2);
    }

    @Override
    public int compareTo(Square comparingSquare) {
        //int perimeter = getPerimeter();
        if(this.getPerimeter() > comparingSquare.getPerimeter()){
            return 1;
        }
        else if(this.getPerimeter() < comparingSquare.getPerimeter()){
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
