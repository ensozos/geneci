

import io.github.ensozos.antlr.listener.ILanguageListener;
import io.github.ensozos.antlr.lexer.ILexer;
import io.github.ensozos.antlr.parser.IParser;
import io.github.ensozos.antlr.LanguageFactory;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.List;

public class ClassInfoGenerator {
    /**
     * The programming lanuage of the source files.
     */
    private String language;

    /**
     * The factory objcet to construct the proper lexer, parser and listener.
     */
    private LanguageFactory languageFactory;

    /**
     * Constructs a classInfoGenerator for the given language.
     *
     * @param language the language of the source files.
     */
    public ClassInfoGenerator(String language) {
        this.language = language;
        this.languageFactory = new LanguageFactory();
    }

    /**
     * Generates class information for the list with all path files. The result
     * is in Json format.
     *
     * @param files the list with all file paths.
     * @return class information in Json format.
     */
    public String generateClassInfoFromFiles(List<String> files) {
        if (files.size() == 0) return "No files found!";

        ILexer lexer = languageFactory.getLexer(language);
        IParser parser = languageFactory.getParser(language);
        ILanguageListener languageListener = languageFactory.getLanguageListener(language);

        CharStream inputCharStreams;
        CommonTokenStream tokens;
        ParseTree ast;
        ParseTreeWalker astWalker = new ParseTreeWalker();
        for (String filePath : files) {
            try {
                inputCharStreams = CharStreams.fromFileName(filePath);
                lexer.setInput(inputCharStreams);

                tokens = new CommonTokenStream((TokenSource) lexer);

                parser.setInput(tokens);
                ast = parser.getTopRuleContext();

                astWalker.walk((ParseTreeListener) languageListener, ast);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return languageListener.getSourceInfoToJson();
    }


}
