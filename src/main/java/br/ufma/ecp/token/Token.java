package br.ufma.ecp.token;
public class Token {

    public final TokenType type;
    public final String lexeme;

    public Token (TokenType type, String lexeme,int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.line = line;
    }

    public String toString() {
        var type = this.type.toString();

        if (type.equals("NUMBER"))
            type =  "intConst";

        if (type.equals("STRING"))
            type =  "stringConst";

        if (type.equals("IDENT"))
        type =  "identificador";

        if (TokenType.isSymbol(lexeme.charAt(0)))
            type = "symbol";
            //Os símbolos <, >, ", e & são impressos como &lt;  &gt;  &quot; e &amp; Para não conflitar com o significado destes símbolos no XML
            if (valor.equals(">")) {
                valor = "&gt;" ;
            } else if (valor.equals("<")) {
                valor = "&lt;" ;
            } else if (valor.equals("\"")) {
                valor = "&quot;" ;
            } else if (valor.equals("&")) {
                valor = "&amp;" ;
            }

        if (TokenType.isKeyword(this.type) )
            type = "keyword";
    

        return "<"+ type +">" + valor + "</"+ type + ">";
    }
    
}
