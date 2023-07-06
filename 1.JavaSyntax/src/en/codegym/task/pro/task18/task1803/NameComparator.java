package en.codegym.task.pro.task18.task1803;

import java.util.Comparator;

/* 
CodeGym mentors
*/

public class NameComparator implements Comparator<CodeGymMentor> {

    @Override
    public int compare(CodeGymMentor cgm1, CodeGymMentor cgm2) {
        return cgm1.getName().length() - cgm2.getName().length();
    }
}
