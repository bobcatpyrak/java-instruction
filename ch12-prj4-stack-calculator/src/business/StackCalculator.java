package business;

import java.util.LinkedList;

public class StackCalculator 
{
	LinkedList<Double> stack;
	
	public StackCalculator()
	{
		stack = new LinkedList<>();
	}
	
	public StackCalculator(LinkedList<Double> stack)
	{
		this.stack = stack;
	}
	
	public void push(double x)
	{
		stack.add(x);
	}
	
	public double pop()
	{
		return stack.removeLast();
	}
	
	public double add()
	{
		double a = stack.pop();
		double b = stack.pop();
		stack.add(a + b);
		return (a + b);
	}
	
	public double subtract()
	{
		double a = stack.pop();
		double b = stack.pop();
		stack.add(a - b);
		return (a - b);
	}
	
	public double multiply()
	{
		double a = stack.pop();
		double b = stack.pop();
		stack.add(a * b);
		return (a * b);
	}
	
	public double divide()
	{
		double a = stack.pop();
		double b = stack.pop();
		stack.add(a / b);
		return (a / b);
	}
	
	public void clear()
	{
		stack.clear();
	}
	
	/*public double[] getValues()
	{
		return stack.toArray();
	}
	*/
	public int size()
	{
		return stack.size();
	}
}
