package io.github.ensozos.antlr.lexer;

import org.antlr.v4.runtime.IntStream;

public interface ILexer {

    /**
     * Reset current lexer state.
     */
    void resetLexer();

    /**
     * Set input stream in lexer object. This method is used to avoid
     * IntStream initialization in the lexer constructor.
     *
     * @param input the intStream of the lexer (e.g CharStream)
     */
    void setInput(IntStream input);
}
