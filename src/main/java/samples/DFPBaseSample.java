package samples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DFPBaseSample {
    private String text;

    public void cleanText(){
        DFPBaseSample inst = new DFPBaseSample();
        inst.normalizeWhiteSpace(); //Left Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eget ligula eu lectus lobortis condimentum. Aliquam nonummy auctor massa. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nulla at risus. Quisque purus magna, auctor et, sagittis ac, posuere eu, lectus. Nam mattis, felis ut adipiscing. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eget ligula eu lectus lobortis condimentum. Aliquam nonummy auctor massa. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nulla at risus. Quisque purus magna, auctor et, sagittis ac, posuere eu, lectus. Nam mattis, felis ut adipiscing.
        inst.removeComments();

    }

    private void normalizeWhiteSpace(){
        text.replace("  ", "");
    }

    private void removeComments(){
        String pattern = "(\".*?\"|'.*?')|(/\\*.*?\\*/|//.*?$)";
        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE | Pattern.DOTALL);
        Matcher matcher = regex.matcher(text);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                matcher.appendReplacement(buffer, matcher.group(1));
            } else {
                matcher.appendReplacement(buffer, "");
            }
        }
        matcher.appendTail(buffer);
        text = buffer.toString();
    }

    private void removeDuplicateWords(){
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i - 1])) {
                result.append(" ");
                result.append(words[i]);
            }
        }

        text = result.toString();
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

}
