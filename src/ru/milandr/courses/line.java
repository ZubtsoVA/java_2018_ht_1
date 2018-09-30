public class line {
    public figure (){}
    public void getLine (points a, points b){
        if (Math.abs(a.x - b.x) < 1e-6 && Math.abs(a.y - b.y) < 1e-6){
            System.out.printf ("You have same points\n");
            return;
        }
        if (Math.abs(a.x - b.x) < 1e-6 && Math.abs(a.y - b.y) > 1e-6){
            System.out.printf ("x = %.2f\n", a.x);
            return;
        }
        double k = 0, c = 0;
        k = (a.y - b.y) / (a.x - b.x);
        c = a.y - k * a.x;
        if (Math.abs(k) < 1e-6)
        {
            System.out.printf ("y = %.2f\n", c);
        }
        else{
            if (Math.abs(c) < 1e-6)
                System.out.printf("y =%.2fx\n", k);
            else if (c < 0)
                System.out.printf("y = %.2fx - %.2f\n", k, -c);
            else
                System.out.printf("y = %.2fx + %.2f\n", k, c);
        }
        return;
    }
}