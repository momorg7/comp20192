import java.util.ArrayList;

public class Lexico implements Constants
{
	private ArrayList<Token> tokens;
	private int count = 0;
	private int size;
	
	public Lexico(ArrayList<Token> tokens)
	{
		this.tokens = new ArrayList<>(tokens);
		this.size = tokens.size();
	}
	
	public Token nextToken()
	{
		if(count < size)
		{
			count++;
			return tokens.get(count-1);
		}
		else
		{
			return null;
		}
	}
}
