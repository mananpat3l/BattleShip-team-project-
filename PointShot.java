public class PointShot implements Comparable {
    public int placement;
    public int suspicion;
    public int corners;
    public int direction;
    public int x;
    public int y;

    public PointShot(int x,int y,int placement, int suspicion, int corners, int direction){
        this.x = x;
        this.y = y;
        this.placement = placement;
        this.suspicion = suspicion;
        this.corners = corners;
        this.direction = direction;

    }
    public boolean equals(Object ob) {
        if (ob != null && ob.getClass() == getClass()) {
            if (this.x == ((PointShot) ob).x && this.y == ((PointShot) ob).y) {
                return true;
            }
        }
        return false;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Object o) {
        if (((PointShot) o).placement == 0) {
            if (this.placement == 0) {
                if (suspicion + corners > ((PointShot) o).suspicion + ((PointShot) o).corners) {
                    return -1;
                } else if (suspicion + corners < ((PointShot) o).suspicion + ((PointShot) o).corners) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return -1;
            }
        } else {
            if (this.placement != 0) {
                if (placement + suspicion + corners > ((PointShot) o).placement + ((PointShot) o).suspicion + ((PointShot) o).corners) {
                    return -1;
                } else if (placement + suspicion + corners < ((PointShot) o).placement + ((PointShot) o).suspicion + ((PointShot) o).corners) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 1;
            }
        }
    }
}
