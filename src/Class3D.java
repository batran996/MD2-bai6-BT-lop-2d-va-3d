import java.util.Arrays;

public class Class3D extends Class2D {
    private float z = 0;

    public Class3D(float z) {
        this.z = z;
    }

    public Class3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[] {super.getX(),super.getY(),z};
    }

    @Override
    public String toString() {
        return "Class3D{" +
                "x= " + getX() +
                "y= " + getY()+
                "z = " + z+
                '}';
    }
}
