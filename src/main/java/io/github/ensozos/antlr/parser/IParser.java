package io.github.ensozos.antlr.parser;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;

public interface IParser {

    /**
     * Set token stream to parser object. This method is used to avoid
     * tokenStream initialization in the parser constructor.
     *
     * @param tokenStream the token stream (i.e CommonTokenStream)
     */
    void setInput(TokenStream tokenStream);

    /**
     * Get the top rule context of current grammar.
     * (e.g the top rule in SimpleJavaGrammar is compilationUnit)
     *
     * @return the top rule of your grammar
     */
    ParserRuleContext getTopRuleContext();

}
