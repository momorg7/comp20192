import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Sintatico sintatico = new Sintatico();
		Semantico semantico = new Semantico();

		Token id1 = new Token(5, "id", 0);
		Token id2 = new Token(3, "^", 1);
		Token id3 = new Token(5, "id", 2);
		Token id4 = new Token(3, "&", 3);
		Token id5 = new Token(5, "id", 4);
		Token id6 = new Token(2, "^", 5);
		Token id7 = new Token(5, "id", 6);
		
		ArrayList<Token> tokens = new ArrayList<>();
		
		tokens.add(id1);
		tokens.add(id2);
		tokens.add(id3);
		tokens.add(id4);
		tokens.add(id5);
		tokens.add(id6);
		tokens.add(id7);
		
		Lexico lexico = new Lexico(tokens);
		
		try
		{
			sintatico.parse(lexico, semantico);
			System.out.println("Expressao aceita.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
