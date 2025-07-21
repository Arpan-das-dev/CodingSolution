package org.solutions;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public String encodings(List<String> string) {
        StringBuilder encoded = new StringBuilder();
        for (String str : string) {
            int length = str.length();
            encoded.append(length).append("#").append(str);
        }
        return encoded.toString();
    }

    public List<String> decoding(String encoded) {           //5#hello5#world
        List<String> decoded = new ArrayList<>();
        int start = 0;
        int end = encoded.length();
        while (start < end) {
            int hashPosition = encoded.indexOf('#', start);
            int length = Integer.parseInt(encoded.substring(start, hashPosition));
            int startPositon = hashPosition + 1;
            int endPosition = startPositon + length;
            String decode = encoded.substring(startPositon, endPosition);
            decoded.add(decode);
            start = endPosition;
        }
        return decoded;
    }
}
