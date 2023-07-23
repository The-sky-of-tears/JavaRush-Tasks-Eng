package com.codegym.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Reading and writing to a file: Human

*/

public class Solution {
    public static void main(String[] args) {
        // Update the string passed to the createTempFile method based on the path to a file on your hard drive
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            Human smith = new Human("Smith", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            smith.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();

            /*System.out.println(somePerson.name);
            for (Asset asset : somePerson.assets) {
                System.out.println(asset.getName() + " " + asset.getPrice());
            }*/

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            String hasName = name != null ? "Yes" : "No";
            bufferedWriter.write(hasName + "\n");
            if (name != null) {
                bufferedWriter.write(name + "\n");
            }

            String hasAssets = assets != null ? "Yes" : "No";
            bufferedWriter.write(hasAssets + "\n");
            if (assets != null) {
                bufferedWriter.write(assets.size() + "\n");

                for (Asset asset : assets) {
                    bufferedWriter.write(asset.getName() + " " + asset.getPrice() + "\n");
                }
            }

            bufferedWriter.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String hasName = bufferedReader.readLine();
            if (hasName.equals("Yes")) {
                name = bufferedReader.readLine();
            }

            String hasAssets = bufferedReader.readLine();
            if (hasAssets.equals("Yes")) {
                int assetsSize = Integer.parseInt(bufferedReader.readLine());

                for (int i = 0; i < assetsSize; i++) {
                    String[] newAssetParams = bufferedReader.readLine().split("\\s");
                    Asset assetFromFile = new Asset(newAssetParams[0],
                            Double.parseDouble(newAssetParams[1]));

                    assets.add(assetFromFile);
                }
            }
        }
    }
}
