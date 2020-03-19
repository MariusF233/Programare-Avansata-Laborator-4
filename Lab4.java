/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author me
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var r = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Resident("R" + i))
                .toArray(Resident[]::new);

        List<Resident> residentList = new ArrayList<>();

        for (Resident res : r) {
            residentList.add(res);
        }
Collections.sort(residentList,Comparator.comparing(Resident::getName));

Map<Resident, List<Hospital>> resPrefMap = new HashMap<>();
// One by one
List<Hospital> prefList = new ArrayList<>();
prefList.add(h[0]);
prefList.add(h[1]);
prefList.add(h[2]);

resPrefMap.put(r[0], prefList);

Map<Hospital, List<Resident>> resPrefMap = new HashMap<>();
resPrefMap.put(r[0], Arrays.asList(h[0], h[1], h[2]));
    }



}
