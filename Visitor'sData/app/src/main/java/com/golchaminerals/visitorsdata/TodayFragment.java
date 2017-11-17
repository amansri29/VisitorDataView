package com.golchaminerals.visitorsdata;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TodayFragment extends Fragment {

    ArrayList<VisitorsDataModel> dataModels;
    ListView listView;
    private static CustomListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today,
                container, false);
        listView=(ListView) view.findViewById(R.id.list);

        dataModels= new ArrayList<>();
        String pi = "/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcU\n" +
                "FhYaHSUfGhsjHBYWICwgIyYnKSopGR8tMC0oMCUoKSj/2wBDAQcHBwoIChMKChMoGhYaKCgoKCgo\n" +
                "KCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCj/wAARCABkAGQDASIA\n" +
                "AhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\n" +
                "AAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\n" +
                "ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\n" +
                "p6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\n" +
                "AwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\n" +
                "BhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\n" +
                "U1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\n" +
                "uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwDqIxxg\n" +
                "VYQVBH0FTp9a5UhEyj0qRaiU1KtAiZBx0p6Co15qVRmmkA9R609RSKKlUe1MQBcU7bmlA5p4WmKw\n" +
                "3ZShOcdzUqIXOFBJ9Kuw24QZPLetSy0VFtjj5jg0Vohfaip1EedI3QVOjcVTR+BzUqt6UxlxWxUq\n" +
                "NVNXqRJcdKEKxeU1MhqjHJ70+S7it4mlnkWOJBlnY4AHvTuOxop3qvqmq2OkWpuNRuUgiHGW5J9g\n" +
                "Byeh6eleZeOviC9lbSppOoQwP0R/LV2JzyM7mx0xyo+vSvKb7xjrutWptGMtwGOXILElvXrwOnAw\n" +
                "OAcZq0rhZs96vPin4Zg8vyLia53tgmOJgE/3t2CO/Y9K1fDvj3QdbuBDBdeTISAPOG0HJOP8+4r5\n" +
                "aOl6uQ+bOf58ZwKlgttT08h2tZlAIJ3Lg1VovZh7OXY+3YBEmUQgsOvPNTDFfIXh3xheQzeXJeT2\n" +
                "sKJtjjhcxohyDkqOvIz7nr6V7J4e+LWnzzQWt+7NI3BmRAqg54z8xAGO+T6nGKhwaEeuAD1oqC2m\n" +
                "FxbxzQOjxSKHRgchgRkEUVFwPKklAFSCYA1xcXimMuqvbSAHqwYHFWE8T2ZdUzIpJx8ycD6mnZhc\n" +
                "64XHvS/aRzzxXLprlo8ojS5jZz0GaedRj3bRIpPpmkNHSC9UVy3xC8UR6VoMm0v9plwItrFSDnru\n" +
                "GCPwOT+dDX3X5s1xXxNne50m1hRclp928kBRhW4yehOePoaI7pDOY8P6TLr1293qcjSJu6ZxuP8A\n" +
                "hXqmmaPHaWgEMMcQHAUDGa4HTtbsdFtYIYGW6dQC5VsDPeul0vxzp82yKaOaGTGCcZX8waialNt9\n" +
                "DtpOEFa+p0HlbX5AqYRxsCHQN68VDbXdvcp5kEgdPWrEJDSYVl3dvrXPY7NLDW8A2PifFqIhDcvk\n" +
                "xyJw2efz+leQ65pN/wCD/EF1o2qbomU8sCPnXsQf69ua+ivD8s1pOtxA4V413Hr0z2x3rz747Our\n" +
                "RWN5cMPtKSFN3cgjqffgflXfSajFJ7nnVldto9P8CeKBB4btlv7iG5BGYZXlCM0eABkDI4IYcHt2\n" +
                "OQCuK+Eq65L4RQ2Wkz30AlZVkjZiowBwPm49fxorblRwO9zzosxA7YpGduDnvzStz17DmoywLfTH\n" +
                "HqOa50WLISV4xkHpUEuDtkVfmHtzUzDAAPJpHTEcg44IYH/P1/SmMrCJ5LlWt5HWdo2CbWI52nHA\n" +
                "961PFtitxbwggrFAYxhcEEs4XGO2AfTuPSq2jo8usWgTPyMXb2G0/wD1q6iRYzdzwzhSjAB1IyGB\n" +
                "UcEe4NZzdnc6KKUnZnBym9tXIAWSPnDGsu5nuLg7ngTdnG4EZAHuAK72+8PA4mh1F44scRSAtj/g\n" +
                "Wd35mqNhoJnnxPMr2oOG8vKl/QZJz+WP50lUSOp0JMxdNfXrbTZ7+0RJLGJW5lxkAfeI6EgEH8va\n" +
                "sw6zeXWN9yIjndlQRj8c17bbWUS2728QiEcUQRUTGO3yrjjpnj2rynVdJWwDxC3m2xHb5qoXV1H3\n" +
                "c46NjqDgcZzziqp1E27oVai4pKLJNE1nV7SeOWPVJmyOAxOx/Y+x49f0q/441p9Yg0+1urdLecOT\n" +
                "uSTcjA4/Ec9sfjWLpFpZxXaRrexQMx25MyAn26+9ep/C7QbBNaj1DxBaxfZjIba3gvwoL5B3NtfG\n" +
                "CSAozzgOQOVYb00pzSZyTbhBs6/wr8YdM8LeHNO0ay0RXjtIEjMiysnmsBhnIEXVjkn60V5f49sH\n" +
                "0nxnrNl9nSBI7p/LjA4CE5TGOMbSOn6dKK+ljldGSUlfU8R42onZmNgtGAM4P6e9KFwff9BXb2+i\n" +
                "WcbDbEHKjgscg/UUyaytkYL9miIBwAIwxbn6dM18pznrchxiJliR1Hc1Bc8/KDgAE5PQ45rrbu3i\n" +
                "X7ixKOgAQZPOO1RQWdn5SuyopznIAXnr+PQ0c6BRMbRbC6lu0kslAkl2JEhPLOSuB2GCeOo+o61f\n" +
                "1y0fT/Et1aGV5GhcRmQjb5mABk9h6+grq/Blun/CX6bEvzCNi/HTODiub+JDeR4y1G3liKMH8xCx\n" +
                "z5ikA7hx03Ar6fL25pct43ZpCVpWRg6jq6QTrFK3A5wT8pqG8vftflPGdkqrhHRgCO/4jj3qt5CC\n" +
                "T7XNIskjjAZj930x/n/GluL212BLm3G08bl+bv2PBA/GkopHVGfN8UrEkF/e7is1yYj0BjHIP41v\n" +
                "XWqKZY7pblpZXx5pI+/2zj1rmVmsJF2rnLccs5I/AGqkubO9UPOWifk5GCvtxT5U9CpVZR15rnot\n" +
                "v4gS0G9toG35nOOMe9JpOsX19eJcSWVpcWyyB0hmQOhXnG7PBz7dM8GuI0YS6vqytGd9rbMMJn/W\n" +
                "N1z9BxXdRuiM1tNKZJJIyyqjbNvbqPc96m7g9HqTpUu2jtY9YsJkV7jwj4cR8DhLdEGO3ANFcnDa\n" +
                "sUGwkJ0UHsPwB/z2orZYjE9Jv7zneHoN3cV9xoKwbcSPn7A81UvfMKFo2+Y4GXpLSXzZmzkqP4vT\n" +
                "3xmrFwBLFvVsvkjB56e/r0rJGSZjW6NdSfMVEhJyjcZ9x6itWK3KKFIG3oeMDPv9fxpIUQkeWoBO\n" +
                "e3YE9/xH5VZY8ttfB9O3sf8APrSstxl3wIsMfieS7nkWGG3jLM7kKqgLkknoBXMfF+KfVpZNf0+K\n" +
                "KW1tJjbyPD1lhwPmPqFbPI7Pnpk1v6XpQnvkuHUSI3y4PQdBx9cCuxXw9YiMxiHy4i4dfLO0ocds\n" +
                "duTx0FdMI3jYzbtK582W14DAuCcF8nByQCOSBn/dHTpVea6JOEwSOC2c7vX/AD/+uvZvEPwzgvJC\n" +
                "YtlvcbiwnhXbn13L+fPXJ5JAAryPxFoOo6DqT2d0Uk8v5g2Mh1POQcZIP9CO1S1y7m0Gp/CQzSxI\n" +
                "5I2Mu3PAIPHXIrJ1KcyuYowCM9QOtWILG+vcrbW8e0HBkOQAa0bHTV0m6hl1EC4MrhQh4AX+I+no\n" +
                "Oveml1FJ20Z0lh4fl8J+H/tzqZppkDTNE4KJzwoweTznI4546ZrB0fV082ONoPtF3NPEyRqOPLCS\n" +
                "Agegyyn8K9B1q8mutPXTrcrHDImxiMHameAB69uvA/AjD8NeH7awvxJEM7ONzctnnv6D+tZyaVza\n" +
                "nzSS7HXWflJbqHilgOP9WFjOKKbJOqtjJx2yKKxsbEOlsdpPr/if8Ks2zEh/diD+v+FFFX0OIhaQ\n" +
                "4V8D0x25Aq4y4iikydzOy/gFGP5miigDovAqie4lWQZVGbA/OuxlbhhxgAUUV109kYS3GRASBVYD\n" +
                "69+9cP4y0q11nUNDhv0LD7c8JZTtJTyZJCD9TGvPXGcYooq5bCg7PQZfaDpokEMNrHAgBwIlC9x/\n" +
                "jXlXj2MQz20SFgmwP16kkj+n86KKzZcdzY0mRplDSHcTGhyevOa2Io1jjUqMHFFFck/iO+h8KK90\n" +
                "5WXjgYHSiiikaH//2Q==\n";

        dataModels.add(new VisitorsDataModel("Aman", "Srivastav", "5656323252", "Umang Jain", "456532", "232 223 212", "Official", " ", pi, "Jaipur", "3" ));
        dataModels.add(new VisitorsDataModel("Aman", "Srivastav", "5656323252", "Umang Jain", "456532", "232 223 212", "Official", " ", pi, "Jaipur", "3" ));
        dataModels.add(new VisitorsDataModel("Aman", "Srivastav", "5656323252", "Umang Jain", "456532", "232 223 212", "Official", " ", pi, "Jaipur", "3" ));
        dataModels.add(new VisitorsDataModel("Aman", "Srivastav", "5656323252", "Umang Jain", "456532", "232 223 212", "Official", " ", pi, "Jaipur", "3" ));
        dataModels.add(new VisitorsDataModel("Aman", "Srivastav", "5656323252", "Umang Jain", "456532", "232 223 212", "Official", " ", pi, "Jaipur", "3" ));
        dataModels.add(new VisitorsDataModel("Aman", "Srivastav", "5656323252", "Umang Jain", "456532", "232 223 212", "Official", " ", pi, "Jaipur", "3" ));
        dataModels.add(new VisitorsDataModel("Aman", "Srivastav", "5656323252", "Umang Jain", "456532", "232 223 212", "Official", " ", pi, "Jaipur", "3" ));
        dataModels.add(new VisitorsDataModel("Aman", "Srivastav", "5656323252", "Umang Jain", "456532", "232 223 212", "Official", " ", pi, "Jaipur", "3" ));


        adapter= new CustomListAdapter(dataModels,getActivity());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                VisitorsDataModel dataModel= dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getFrom()+" "+dataModel.getMobileNumber(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
            }
        });
        return view;
    }


    public static TodayFragment newInstance() {
        TodayFragment myFragment = new TodayFragment();
        return myFragment;
    }

}