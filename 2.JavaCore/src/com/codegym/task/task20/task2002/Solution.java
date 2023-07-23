package com.codegym.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Reading and writing to a file: CodeGym

*/

public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
            File yourFile = File.createTempFile("1111111111111", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            CodeGym codeGym = new CodeGym();
            User newUser = new User();
            newUser.setFirstName("Artem");
            newUser.setLastName("The_sky_of_tears");
            newUser.setBirthDate(new Date(1689930798477L));
            newUser.setMale(true);
            newUser.setCountry(User.Country.OTHER);
            codeGym.users.add(newUser);
            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Here check that the codeGym object is equal to the loadedObject object

            System.out.println(loadedObject.users.get(0));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {

            PrintWriter printWriter = new PrintWriter(outputStream);

            if (users != null) {

                for (User user : users) {
                    printWriter.println(user);
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] userFromFileParams = line.split("\\s");
                User userFromFile = new User();
                userFromFile.setFirstName(userFromFileParams[0]);
                userFromFile.setLastName(userFromFileParams[1]);
                userFromFile.setBirthDate(new Date(Long.parseLong(userFromFileParams[2])));
                userFromFile.setMale(Boolean.parseBoolean(userFromFileParams[3]));

                switch (userFromFileParams[4]) {
                    case "UNITED_STATES":
                        userFromFile.setCountry(User.Country.UNITED_STATES);
                        break;
                    case "UNITED_KINGDOM":
                        userFromFile.setCountry(User.Country.UNITED_KINGDOM);
                        break;
                    default:
                        userFromFile.setCountry(User.Country.OTHER);
                        break;
                }
                users.add(userFromFile);
            }
            bufferedReader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
