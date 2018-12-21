package ru.tinkoff.bpm;

public class TextFactory {

    public static String[] build() {
        return new String[]{
            "This comment is so good.",                             // OK
            "This comment is so Loooooooooooooooooooooooooooong.",  // TOO_LONG
            "Very negative comment !!!!=(!!!!;",                    // NEGATIVE_TEXT
            "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|",      // NEGATIVE_TEXT or TOO_LONG
            "This comment is so bad....",                           // SPAM
            "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!",   // SPAM or TOO_LONG
            "Negative bad :( spam.",                                // SPAM or NEGATIVE_TEXT
            "Very bad, very neg =(, very .................."
            // SPAM or NEGATIVE_TEXT or TOO_LONG
        };
    }
}
