import java.util.Arrays;

public class Class2D {
    private float x = 0;
    private float y = 0;

    public Class2D() {
    }

    public Class2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){

    }
    public float[] getXY ={x,y};

    @Override
    public String toString() {
        return "Class2D{" +
                "x=" + x +
                ", y=" + y +
                ", getXY=" + Arrays.toString(getXY) +
                '}';
    }
}
