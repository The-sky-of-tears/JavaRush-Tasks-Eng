package com.codegym.task.task17.task1710;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) {
        switch (args[0]) {
            case "-c":
                create(args[1], args[2], args[3]);
                break;
            case "-u":
                update(args[1], args[2], args[3], args[4]);
                break;
            case "-d":
                delete(args[1]);
                break;
            case "-i":
                read(args[1]);
                break;
            default:
                break;
        }
    }

    public static Date stringToDate(String date) {
        if (date == null) {
            return null;
        }

        String[] dateParts = date.split(" ");

        return new Date(Integer.parseInt(dateParts[2]) - 1900,
                Integer.parseInt(dateParts[0]) - 1, Integer.parseInt(dateParts[1]));
    }

    public static Sex stringToSex(String sex) {
        if (sex == null) {
            return null;
        }

        if (sex.equals("m")) {
            return Sex.MALE;
        } else {
            return Sex.FEMALE;
        }
    }

    public static void create(String name, String sex, String bd) {
        if (stringToSex(sex) == Sex.MALE) {
            allPeople.add(Person.createMale(name, stringToDate(bd)));
        } else {
            allPeople.add(Person.createFemale(name, stringToDate(bd)));
        }

        System.out.println(allPeople.size() - 1);
    }

    public static void read(String id) {
        int intId = Integer.parseInt(id);

        if (intId < allPeople.size()) {
            System.out.println(allPeople.get(intId));
        }
    }

    public static void update(String id, String name, String sex, String bd) {
        int intId = Integer.parseInt(id);

        if (intId < allPeople.size() && allPeople.get(intId) != null) {
            allPeople.get(intId).setName(name);
            allPeople.get(intId).setSex(stringToSex(sex));
            allPeople.get(intId).setBirthDate(stringToDate(bd));
        }
    }

    public static void delete(String id) {
        int intId = Integer.parseInt(id);

        if (intId < allPeople.size()) {
            update(id, null, null, null);
        }
    }
}
