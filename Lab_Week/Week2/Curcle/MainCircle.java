public class MainCircle
{
    public static void main(String[] args) 
    {
        Circle Circle = new Circle(15);

        System.out.printf("%.2f \n",Circle.get_diameter());
        System.out.printf("%.2f \n",Circle.get_parameter());
        System.out.printf("%.2f \n",Circle.get_aera());
    }
}
