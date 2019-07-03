
public interface ParserConstants
{
	int START_SYMBOL = 6;

    int FIRST_NON_TERMINAL    = 6;
    int FIRST_SEMANTIC_ACTION = 11;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1,  0,  0 },
        {  2,  1, -1, -1, -1 },
        { -1, -1, -1,  3,  3 },
        {  5,  5,  4, -1, -1 },
        { -1, -1, -1,  6,  7 }
    };

    int[][] PRODUCTIONS = 
    {
        {  8,  7 },
        {  2,  8,  7 },
        {  0 },
        { 10,  9 },
        {  3, 10,  9 },
        {  0 },
        {  4, 10 },
        {  5 }
    };

    String[] PARSER_ERROR =
    {
        "Erro Teste",
        "Era esperado fim de programa",
        "Era esperado \"^\"",
        "Era esperado \"&\"",
        "Era esperado \"~\"",
        "Era esperado \"id\"",
        "<E> invalido",
        "<G> invalido",
        "<T> invalido",
        "<U> invalido",
        "<F> invalido"
    };
}
