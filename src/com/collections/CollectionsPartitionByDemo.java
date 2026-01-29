package com.collections;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsPartitionByDemo {
    public static void main(String[] args) {

    List<Character> charList = List.of('1', 'a','2','b','3','c');
    Map<Boolean, List<Character>> charMap = charList.stream()
            .collect(Collectors.partitioningBy(Character::isDigit));
        System.out.println("Numbers:" +charMap.get(true));
        System.out.println("characters:" +charMap.get(false));
    }

}
