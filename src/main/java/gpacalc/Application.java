package gpacalc;

import camp.nextstep.edu.missionutils.Console;
import gpacalc.util.Sepearate;
import gpacalc.vo.Subject;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        //TODO: 구현
        ArrayList<String> majorString = new ArrayList<>();
        ArrayList<String> generalString = new ArrayList<>();
        ArrayList<Subject> major = new ArrayList<>();
        ArrayList<Subject> general = new ArrayList<>();

        System.out.println("전공 과목명과 이수학점, 평점을 입력해주세요(예시: 프로그래밍언어론-3-A+,소프트웨어공학-3-B+):");
        String majorInput = Console.readLine();
        System.out.println("교양 과목명과 이수학점, 평점을 입력해주세요(예시: 선형대수학-3-C0,인간관계와자기성장-3-P):");
        String generalInput = Console.readLine();

        majorString = Sepearate.separateByComma(majorInput);
        generalString = Sepearate.separateByComma(generalInput);

        major = Sepearate.separateByHyphen(majorString);
        general = Sepearate.separateByHyphen(generalString);

        for (Subject s : major) {
            System.out.println(s.getSubjectName());
        }
        for (Subject s : general) {
            System.out.println(s.getSubjectName());
        }

    }
}
