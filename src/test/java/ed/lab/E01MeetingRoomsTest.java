package ed.lab;

import java.util.ArrayList;

public class E01MeetingRoomsTest {
    public static void main(String[] args) {
        E01MeetingRooms rooms = new E01MeetingRooms();

        // Test 1: Se esperan 2 salas
        ArrayList<MeetingInterval> lista1 = new ArrayList<>();
        lista1.add(new MeetingInterval(0, 30));
        lista1.add(new MeetingInterval(5, 10));
        lista1.add(new MeetingInterval(15, 20));
        MeetingInterval[] arreglo1 = lista1.toArray(new MeetingInterval[0]);
        int resultado1 = rooms.minMeetingRooms(arreglo1);
        System.out.println("Test 1 - Esperado: 2, Obtenido: " + resultado1);

        // Test 2: Se espera 1 sala
        ArrayList<MeetingInterval> lista2 = new ArrayList<>();
        lista2.add(new MeetingInterval(7, 10));
        lista2.add(new MeetingInterval(2, 4));
        MeetingInterval[] arreglo2 = lista2.toArray(new MeetingInterval[0]);
        int resultado2 = rooms.minMeetingRooms(arreglo2);
        System.out.println("Test 2 - Esperado: 1, Obtenido: " + resultado2);
    }
}
