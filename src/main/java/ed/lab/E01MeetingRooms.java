package ed.lab; //KP

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class E01MeetingRooms {

    public int minMeetingRooms(List<MeetingInterval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return 0;
        }


        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(intervals.getFirst().end);

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start >= minHeap.peek()) {
                minHeap.poll(); // reutiliza una sala
            }
            minHeap.add(intervals.get(i).end);
        }

        return minHeap.size(); // número máximo de salas necesarias
    }
}
