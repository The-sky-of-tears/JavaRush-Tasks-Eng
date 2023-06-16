package en.codegym.task.pro.task13.task1316;

/* 
Let's list the CodeGym quests
*/

public class Solution {

    public static void main(String[] args) {
        var enums = CodeGymQuest.values();
        for (var member : enums) {
            System.out.println(member.ordinal());
        }
    }
}
