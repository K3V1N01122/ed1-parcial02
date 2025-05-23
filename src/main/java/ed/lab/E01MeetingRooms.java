package ed.lab; //Kevin Palencia

import java.util.Arrays;
import java.util.PriorityQueue;

public class E01MeetingRooms {

    public int minMeetingRooms(MeetingInterval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(intervals[0].end);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= minHeap.peek()) {
                minHeap.poll(); // reutiliza una sala
            }
            minHeap.add(intervals[i].end);
        }

        return minHeap.size(); // número máximo de salas necesarias
    }
}
