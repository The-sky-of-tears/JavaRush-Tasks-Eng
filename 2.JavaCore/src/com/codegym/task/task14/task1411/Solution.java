package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true)
        {
            key = reader.readLine();

            if (!key.equals("user") && !key.equals("loser") && !key.equals("coder") && !key.equals("programmer")) {
                break;
            }

            switch (key) {
                case "user":
                    Person.User user = new Person.User();
                    doWork(user);
                    break;
                case "loser":
                    Person.Loser loser = new Person.Loser();
                    doWork(loser);
                    break;
                case "coder":
                    Person.Coder coder = new Person.Coder();
                    doWork(coder);
                    break;
                case "programmer":
                    Person.Programmer programmer = new Person.Programmer();
                    doWork(programmer);
                    break;
                default:
                    break;
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Programmer) {
            ((Person.Programmer) person).enjoy();
        }
    }
}
