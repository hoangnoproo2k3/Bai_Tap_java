package bai7;

/**
 *
 * @author AS
 */
public class diem {
    public float x, y;

    public diem() {
    }
    
    public diem(float x, float y) {
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

    @Override
    public String toString() {
        return "diem{" + "x=" + x + ", y=" + y + '}';
    }
    
}
