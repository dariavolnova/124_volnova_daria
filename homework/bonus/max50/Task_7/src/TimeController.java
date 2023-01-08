import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
public final class TimeController {
    public static int max_time_lesson(ArrayList<String> LessonsList, ArrayList<Integer> Wasted_time) {
        Map<String, Integer> LessonMap = new HashMap<>();
        for (int i = 0; i < LessonsList.size(); i++) {
            final int a = i;
            LessonMap.putIfAbsent(LessonsList.get(i), 0);
            LessonMap.computeIfPresent(LessonsList.get(i), (key, oldValue) -> oldValue + Wasted_time.get(a) );
        }
        return Collections.max(LessonMap.entrySet(), Map.Entry.comparingByValue() ).getValue();
    }
}
