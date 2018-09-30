public class points {
    protected double x;
    protected double y;
    public points (double x, double y){
        this.x = x;
        this.y = y;
    }
    public void setX (double x){
        this.x = x;
    }
    public void setY (double y){
        this.y = y;
    }
    public double getX (){
        return this.x;
    }
    public double getY (){
        return this.y;
    }
    public double getDistance (points a) {
        return Math.sqrt((a.x - this.x) * (a.x - this.x) + (a.y - this.y) * (a.y - this.y));
    }
    public points getMiddle (points a){
        points middle = new points (0, 0);
        middle.x = (a.x + this.x) / 2;
        middle.y = (a.y + this.y) / 2;
        return middle;
    }
    public void getCircle (points a){
        points middle = this.getMiddle (a);
        double radia = this.getDistance (middle);
        if (Math.abs(middle.x) < 1e-6 && Math.abs(middle.y) < 1e-6){
            System.out.printf ("Your circle is: x^2 + y^2 = %.2f^2\n", radia);
            return;
        }
        if (Math.abs(middle.x) < 1e-6){
            if (middle.y < 0)
                System.out.printf("Your circle is: x^2 + (y + %.2f)^2 = %.2f^2\n", -middle.y, radia);
            else
                System.out.printf ("Your circle is: x^2 + (y - %.2f)^2 = %.2f^2\n", middle.y, radia);
            return;
        }
        if (Math.abs(middle.y) < 1e-6){
            if (middle.x < 0)
                System.out.printf ("Your circle is: (x + %.2f)^2 + y^2 = %.2f^2\n", -middle.x, radia);
            else
                System.out.printf ("Your circle is: (x - %.2f)^2 + y^2 = %.2f^2\n", middle.x, radia);
            return;
        }
        if (middle.x < 0 && middle.y < 0)
            System.out.printf("Your circle is: (x + %.2f)^2 + (y + %.2f)^2 = %.2f^2\n",
                    -middle.x, -middle.y, radia);
        else if (middle.x < 0 && middle.y > 0)
            System.out.printf ("Your circle is: (x + %.2f)^2 + (y - %.2f)^2 = %.2f^2\n",
                    -middle.x, middle.y, radia);
        else if (middle.x > 0 && middle.y < 0)
            System.out.printf ("Your circle is: (x - %.2f)^2 + (y + %.2f)^2 = %.2f^2\n",
                    middle.x, -middle.y, radia);
        else
            System.out.printf ("Your circle is: (x - %.2f)^2 + (y - %.2f)^2 = %.2f^2\n",
                    middle.x, middle.y, radia);
        return;
    }
}