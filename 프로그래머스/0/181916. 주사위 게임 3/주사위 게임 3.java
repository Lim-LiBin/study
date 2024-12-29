import java.util.HashMap;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int dice[] = {a, b, c, d};
        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. 주사위 숫자의 빈도 계산
        for (int num : dice) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. 조건별 점수 계산
        if (map.size() == 1) {
            // 모든 숫자가 동일
            answer = 1111 * a;
        } else if (map.size() == 4) {
            // 모든 숫자가 다름
            answer = Math.min(Math.min(a, b), Math.min(c, d));
        } else if (map.size() == 2) {
            // 두 가지 숫자만 있는 경우
            int[] keys = new int[2];
            int idx = 0;
            for (int key : map.keySet()) {
                keys[idx++] = key;
            }
            int count1 = map.get(keys[0]);
            int count2 = map.get(keys[1]);

            if (count1 == 3 || count2 == 3) {
                // 3개 동일, 1개 다른 경우
                int p = (count1 == 3) ? keys[0] : keys[1];
                int q = (count1 == 1) ? keys[0] : keys[1];
                answer = (10 * p + q) * (10 * p + q);
            } else {
                // 2개씩 동일한 경우
                answer = (keys[0] + keys[1]) * Math.abs(keys[0] - keys[1]);
            }
        } else if (map.size() == 3) {
            // 2개 동일 + 나머지 각각 다른 경우
            int p = 0, q = 0, r = 0;
            for (int key : map.keySet()) {
                int count = map.get(key);
                if (count == 2) {
                    p = key;
                } else if (q == 0) {
                    q = key;
                } else {
                    r = key;
                }
            }
            answer = q * r;
        }

        return answer;
    }
}
