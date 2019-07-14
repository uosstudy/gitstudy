package sig.oss.mycalculator;

/**
 * Hello world!
 *
 */
public class Calc 
{
	private int r = 0;
	public void add(int x, int y) { r = x + y;}
	public void sub(int x, int y) { r = x - y;}
	public int getResult() { return r;}
}
