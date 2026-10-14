import com.Neha7.EmptyTextException;

import java.util.ArrayList;
import java.util.Locale;

public class TextDocument {

    private String text;

    public TextDocument(String text) throws EmptyTextException {
        if (text == null || text.trim().isEmpty()) {
            throw new EmptyTextException("Text cannot be empty!");
        }

        this.text = text.trim();
    }

    public String getText() {
        return text;
    }

    public ArrayList<String> getWords() {
        ArrayList<String> words = new ArrayList<>();

        String[] tokens = text.toLowerCase(Locale.ROOT)
                .split("[^\\p{L}\\p{N}]+");

        for (String word : tokens) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

        return words;
    }

    public ArrayList<String> getSentences() {
        ArrayList<String> sentences = new ArrayList<>();

        String[] parts = text.split("(?<=[.!?])\\s+");

        for (String sentence : parts) {
            sentence = sentence.trim();

            if (!sentence.isEmpty()) {
                sentences.add(sentence);
            }
        }

        return sentences;
    }
}