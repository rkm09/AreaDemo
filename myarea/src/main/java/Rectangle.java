/**
 * Job of the class: Returns valid area and perimeter for a given rectangle
 *
 * [change static factory, ]
 */
class Rectangle {

    private final int length;
    private final int breadth;

    Rectangle(int length, int breadth) throws Exception {
        if (length <= 0 || breadth <= 0) {
            throw new Exception("Invalid Arguments");
        }
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(int side) throws Exception {
        if(side <= 0) {
            throw new Exception("Invalid Argument");
        }
        this.length = side;
        this.breadth = side;
    }

    int calculatePerimeter() {
        int perimeter = 2 * (length + breadth);
        return perimeter;
    }

    int calculateArea() {
        int area = length * breadth;
        return area;
    }
}

