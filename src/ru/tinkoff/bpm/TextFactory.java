package ru.tinkoff.bpm;

import java.util.ArrayList;
import java.util.List;

public class TextFactory {

    public static List<String> build() {
        List<String> texts = new ArrayList<String>();
        texts.add("This comment is so good.");
        texts.add("This comment is so Loooooooooooooooooooooooooooong.");
        texts.add("Very negative comment !!!!=(!!!!;");
        texts.add("Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|");
        texts.add("This comment is so bad....");
        texts.add("The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!");
        texts.add("Negative bad :( spam.");
        texts.add("Very bad, very neg =(, very ..................");
        return texts;
    }
}
