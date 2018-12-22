package com.company;

public class Main {

    public static void main(String[] args) {
        int[] APPOINTMENTS = {1, 2, 500, 27, 39};
        for (int i = 0; i < APPOINTMENTS.length - 1; i ++) {
            System.out.print(APPOINTMENTS[i] + ", ");
        }
        System.out.print(APPOINTMENTS[APPOINTMENTS.length - 1]);

        DailySchedule mySchedule = new DailySchedule(APPOINTMENTS);

        System.out.println(", 10");
        mySchedule.addAppt(new Appointment(10), false);
    }
}
