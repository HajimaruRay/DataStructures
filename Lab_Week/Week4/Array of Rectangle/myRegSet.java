import java.util.Scanner;

public class myRegSet
{
    static int defaultMaxItem=5;
	int maxItem=0;
	int noItem=0;
	Rectangle RegArr[];
	String title="";
	
	public myRegSet() {
		this(defaultMaxItem);
	}

	public myRegSet(String title) {
		this.title=title;
	}

	public myRegSet(String title,int max) {
		maxItem=max;
		RegArr=new Rectangle[max];
		this.title=title;
	}

	public myRegSet(int max) {
		maxItem=max;
		RegArr=new Rectangle[max];
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public void add(Rectangle reg) {
		RegArr[noItem]=reg;
		noItem++;
	}

    public String toString() {
        String tstr="";
        for (int i=0;i<noItem;i++){
            tstr=tstr+RegArr[i]+"\n";
        }
        return tstr;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double SumArea = 0;
		myRegSet regset1=new myRegSet(n);

		for (int i = 0;i < n;i++)
		{
			double width = sc.nextDouble();
			double height = sc.nextDouble();
			Rectangle newreg1= new Rectangle(width,height);
			regset1.add(newreg1);
			SumArea += newreg1.getArea();
		}

		System.out.println(regset1);
		System.out.println(SumArea);
		sc.close();
	}
}