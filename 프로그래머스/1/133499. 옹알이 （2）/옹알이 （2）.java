class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] validSounds = {"aya", "ye", "woo", "ma"};

        for (String str : babbling) {
            String prev = ""; // 이전 발음을 저장
            boolean isValid = true;

            while (!str.isEmpty()) {
                boolean matched = false;
                for (String sound : validSounds) {
                    if (str.startsWith(sound) && !sound.equals(prev)) {
                        // 유효한 발음이고 이전 발음과 다른 경우
                        prev = sound; // 이전 발음을 갱신
                        str = str.substring(sound.length()); // 발음을 제거
                        matched = true;
                        break;
                    }
                }

                if (!matched) { // 어떤 발음에도 매칭되지 않으면 무효
                    isValid = false;
                    break;
                }
            }

            if (isValid) answer++;
        }

        return answer;
    }
}