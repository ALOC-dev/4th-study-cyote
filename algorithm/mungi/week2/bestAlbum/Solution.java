import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int n = genres.length;

        Map<String, Integer> total = new HashMap<>();
        for (int i = 0; i < n; i++) {
            total.put(genres[i], total.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> orderedGenres = new ArrayList<>(total.keySet());
        orderedGenres.sort(new Comparator<String>() {
            @Override
            public int compare(String g1, String g2) {
                return total.get(g2).compareTo(total.get(g1));
            }
        });

        List<Integer> temp = new ArrayList<>();
        for (String g : orderedGenres) {
            Map<Integer, Integer> byGenre = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (genres[i].equals(g)) {
                    byGenre.put(i, plays[i]);
                }
            }

            List<Integer> songIdx = new ArrayList<>(byGenre.keySet());
            songIdx.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer i1, Integer i2) {
                    int p1 = byGenre.get(i1);
                    int p2 = byGenre.get(i2);
                    if (p1 != p2) {
                        return Integer.valueOf(p2).compareTo(p1);
                    }
                    return i1.compareTo(i2);
                }
            });

            temp.add(songIdx.get(0));
            if (songIdx.size() > 1) temp.add(songIdx.get(1));
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] result = s.solution(genres, plays);
        System.out.println(Arrays.toString(result));
    }
}
