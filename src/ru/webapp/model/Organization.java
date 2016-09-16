package ru.webapp.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Айслу on 10.09.2016.
 */
public class Organization {
    private Link link;
    private List<Period> periods;

    /**
     * Created by Айслу on 11.09.2016.
     */
    public static class Period {
        private Date startDate;
        private Date endDate;
        private String position;
        private String content;

        public Period(){

        }
        public Period(Date startDate, Date endDate, String position, String content) {
            this.startDate = startDate;
            this.endDate = endDate;
            this.position = position;
            this.content = content;
        }
    }
}
