package _202206.week2.midterm;

import java.util.ArrayList;

public class Solution2 {
    public String[] solution(String[][] booked, String[][] unbooked) {
        int bookedIndex = 0;
        int unbookedIndex = 0;
        int total = booked.length + unbooked.length;
        ArrayList<String> customer = new ArrayList<String>();
        String endTime = "00:01";

        while (( bookedIndex < booked.length ) && ( unbookedIndex < unbooked.length )) {
            if (booked[bookedIndex][0].compareTo(unbooked[unbookedIndex][0]) <= 0) {
                customer.add(booked[bookedIndex][1]);
                bookedIndex++;
            } else {
                if (endTime(unbooked[unbookedIndex][0]).compareTo(booked[bookedIndex][0]) > 0) {
                    customer.add(booked[bookedIndex][1]);
                    bookedIndex++;
                } else {
                    customer.add(unbooked[unbookedIndex][1]);
                    unbookedIndex++;
                }
            }
            System.out.println(customer);
        }
        if (bookedIndex >= booked.length) {
            for (int i = unbookedIndex; i < unbooked.length; i++) {
                customer.add(unbooked[i][1]);
            }
        }

        if (unbookedIndex >= unbooked.length) {
            for (int i = bookedIndex; i < booked.length; i++) {
                customer.add(booked[i][1]);
            }
        }
        System.out.println(customer);
        return customer.toArray(new String[total]);
    }

    /**
     * 업무 처리 시간을 리턴한다.
     *
     * @param time
     * @return 업무 처리 시간
     */
    public String endTime(String time) {
        String[] targetTime = time.split(":");
        int minute = Integer.parseInt(targetTime[1]);
        int hour = Integer.parseInt(targetTime[0]);
        if (minute + 10 >= 60) {
            hour++;
            minute -= 60;
        }
        minute += 10;
        String result = "";
        if (hour < 10) {
            result = "0" + hour + ":";
        } else {
            result = hour + ":";
        }

        if (minute < 10) {
            result += "0" + minute;
        } else {
            result += minute;
        }
        return result;
    }
}
