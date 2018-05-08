package algorithm.implementations;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

/**
 * @author Shamah M Zoha
 * @since 5/6/2018
 */
public class AcmIcpcTeam {

    private static int[] acmTeam(String[] topics) {
        List<BitSet> memberProfList = new ArrayList<>();
        populateMemberProfList(memberProfList, topics);

        int[] occurrence = new int[topics[0].length()];
        int maxChapters = Integer.MIN_VALUE;
        int index = 0;

        for (BitSet contextMember : memberProfList) {
            for (int i = index; i < memberProfList.size(); i++) {
                if (i != index) {
                    BitSet tmp = (BitSet) contextMember.clone();
                    tmp.or(memberProfList.get(i));

                    maxChapters = Math.max(maxChapters, tmp.cardinality());
                    occurrence[tmp.cardinality() - 1]++;
                }
            }

            index++;
        }

        return new int[]{maxChapters, occurrence[maxChapters - 1]};
    }

    private static void populateMemberProfList(List<BitSet> chapList, String[] topics) {
        for (String topic : topics) {
            BitSet topicSet = new BitSet();

            for (int i = 0; i < topic.length(); i++) {
                if(topic.charAt(i) == '1') topicSet.set(i);
            }

            chapList.add(topicSet);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] topic = new String[n];
        for(int topic_i = 0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int[] result = acmTeam(topic);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
