package gpacalc.util;

import gpacalc.vo.Subject;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sepearate {
    public static ArrayList<String> separateByComma(String line) {
        ArrayList<String> result = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(line, ",");
        while (st.hasMoreTokens()) {
            String info = st.nextToken();
            result.add(info);
        }
        return result;
    }
    public static ArrayList<Subject> separateByHyphen(ArrayList<String> subjects) {
        ArrayList<Subject> result = new ArrayList<>();
        StringTokenizer st;
        for (String s: subjects) {
            st = new StringTokenizer(s, "-");
            String subjectName = st.nextToken();
            int credit = Integer.parseInt(st.nextToken());
            String score = st.nextToken();
            result.add(new Subject(subjectName, credit, score));
        }
        return result;
    }
}
