%%
%class Lexer
%byaccj

%{
    private Parser yyparser;

    /* Constructor que associa o Parser ao Lexer */
    public Lexer(java.io.Reader r, Parser yyparser) {
        this(r);
        this.yyparser = yyparser;
    }
%}

%%

"."                           { return ParserTokens.DOT; }
"^"                           { return ParserTokens.UP; }
"^{"                          { return ParserTokens.UP_C; }
"_"	                          { return ParserTokens.DOWN; }
"_{"                          { return ParserTokens.DOWN_C; }
">"	                          { return ParserTokens.T_UP; }
">{"                          { return ParserTokens.T_UP_C; }
"<"	                          { return ParserTokens.T_DOWN; }
"<{"                          { return ParserTokens.T_DOWN_C; }
"\MAJORSCALE"                 { return ParserTokens.MAJOR;}

"\}"|"\{"   { return yytext().charAt(0); }

[0-9]+      {
    yyparser.yylval = new ParserVal(Integer.parseInt(yytext()));
    return ParserTokens.INT; }

[ \n\r]     { /* ignore */ }
.           { /* ignore */ }

