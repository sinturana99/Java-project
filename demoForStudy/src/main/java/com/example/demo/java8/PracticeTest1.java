package com.example.demo.java8;

import com.example.demo.FamilyInfo;
import java.util.*;

public class PracticeTest1 {

    public static void main(String[] args) {
        Map<String, List<FamilyInfo>> familyMap = new HashMap<>();
        makeFamilyTree(familyMap);
        searchingAndPrinting(familyMap);
    }


    private static void makeFamilyTree(Map<String, List<FamilyInfo>> familyMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items to be add");
        String j = sc.nextLine();
        for (int i = 0; i < Integer.parseInt(j); i++) {
            FamilyInfo info = new FamilyInfo();
            System.out.println("Enter name");
            info.setFirstName(sc.nextLine());
            System.out.println("Enter lastName");
            info.setLastName(sc.nextLine());
            System.out.println("Enter phone");
            info.setPhoneNumber(sc.nextLine());
            System.out.println("Enter email");
            info.setEmail(sc.nextLine());
            if (!familyMap.isEmpty() && familyMap.containsKey(info.getLastName())) {
                List<FamilyInfo> familyInfoList = familyMap.get(info.getLastName());
                familyInfoList.add(info);
                familyMap.put(info.getLastName(), familyMap.get(info.getLastName()));
            } else {
                List<FamilyInfo> list = new ArrayList<>();
                list.add(info);
                familyMap.put(info.getLastName(), list);
            }
        }
    }


    private static void searchingAndPrinting(Map<String, List<FamilyInfo>> familyMap) {
        System.out.println("Enter surname to search :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (familyMap.containsKey(s)) {
            for (Map.Entry<String, List<FamilyInfo>> familyInfoList : familyMap.entrySet()) {
                if (familyInfoList.getKey().equalsIgnoreCase(s)) {
                    familyInfoList.getValue().forEach(familyInfo -> System.out.println("{" + familyInfoList.getKey() + "} ->" + "{" + familyInfo.getFirstName() + " " + familyInfo.getLastName() + " " + familyInfo.getPhoneNumber()
                            + " " + familyInfo.getEmail() + "}"));
                }
            }
        } else {
            System.out.println("Nothing matched with this provided surname : " + s);
        }
    }


}
