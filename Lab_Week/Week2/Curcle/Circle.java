public class Circle 
{
    int radius;

    public Circle (int radius)
    {
        this.radius = radius;
    }

    public int get_radius()
    {
        return radius;
    }

    public void set_radius(int radius)
    {
        this.radius = radius;
    }

    public double get_diameter()
    {
        return radius*2;
    }

    public double get_aera()
    {
        return Math.PI*(Math.pow(radius, 2));
    }

    public double get_parameter()
    {
        return 2*(Math.PI*radius);
    }
}
