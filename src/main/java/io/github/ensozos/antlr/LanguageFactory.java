package io.github.ensozos.antlr;


import io.github.ensozos.antlr.lexer.ILexer;
import io.github.ensozos.antlr.lexer.SimpleJavaLexer;
import io.github.ensozos.antlr.listener.ILanguageListener;
import io.github.ensozos.antlr.parser.IParser;
import io.github.ensozos.antlr.parser.SimpleJavaParser;

public class LanguageFactory {

    /**
     * Return lexer object for the given language.
     *
     * @param lexerType the programming language.
     * @return antlr lexer
     */
    public ILexer getLexer(String lexerType) {
        if (lexerType == null) return null;

        if (lexerType.equalsIgnoreCase("Java")) {
            return new SimpleJavaLexer();
        }

        return null;
    }

    /**
     * Returns parser object for the given language.
     *
     * @param parserType the programming language.
     * @return antlr parser
     */
    public IParser getParser(String parserType) {
        if (parserType == null) return null;

        if (parserType.equalsIgnoreCase("Java")) {
            return new SimpleJavaParser();
        }
        return null;
    }

    /**
     * Returns listener object for the given language.
     *
     * @param languageListenerType he programming language.
     * @return antlr listener
     */
    public ILanguageListener getLanguageListener(String languageListenerType) {
        if (languageListenerType == null) return null;

        if (languageListenerType.equalsIgnoreCase("Java")) {
            return new SimpleJavaClassInfoListener();
        }

        return null;
    }

}
