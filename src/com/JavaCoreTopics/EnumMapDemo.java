package com.JavaCoreTopics;

import java.util.EnumMap;

enum Role{
    DEVELOPER, MANAGER, TESTER, DESIGNER;
}
public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<Role, String> enumMap = new EnumMap<>(Role.class);
        enumMap.put(Role.DESIGNER, "Design");
        enumMap.put(Role.DEVELOPER, "software development");
        enumMap.put(Role.TESTER, "software Testing");
        enumMap.put(Role.MANAGER, "Management");

        for(Role role: Role.values()){
            System.out.println(role + " : "+enumMap.get(role));
        }
    }
}
