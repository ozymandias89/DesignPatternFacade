public class FacadePatternDemo {
    public static void main(String[] args) {
        FacadeClass shapeMaker = new FacadeClass();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
