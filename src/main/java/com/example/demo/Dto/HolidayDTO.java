package com.example.demo.Dto;

import com.example.demo.enums.HolidayType;

import java.time.LocalDate;

public class HolidayDTO {
    private Long id;
    private String name;
    private LocalDate date;
    private HolidayType type;
    private String description;
    private boolean notifyViaFeeds;
    private boolean reprocessLeave;
    private int reminderDaysBefore;
    private String applicableFor;
    private boolean shiftBased;

    // ✅ Full-args constructor (used by builder)
    public HolidayDTO(Long id, String name, LocalDate date, HolidayType type, String description,
                      boolean notifyViaFeeds, boolean reprocessLeave, int reminderDaysBefore,
                      String applicableFor, boolean shiftBased) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type = type;
        this.description = description;
        this.notifyViaFeeds = notifyViaFeeds;
        this.reprocessLeave = reprocessLeave;
        this.reminderDaysBefore = reminderDaysBefore;
        this.applicableFor = applicableFor;
        this.shiftBased = shiftBased;
    }

    // ✅ Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public LocalDate getDate() { return date; }
    public HolidayType getType() { return type; }
    public String getDescription() { return description; }
    public boolean isNotifyViaFeeds() { return notifyViaFeeds; }
    public boolean isReprocessLeave() { return reprocessLeave; }
    public int getReminderDaysBefore() { return reminderDaysBefore; }
    public String getApplicableFor() { return applicableFor; }
    public boolean isShiftBased() { return shiftBased; }

    // ✅ Manual Builder Pattern
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String name;
        private LocalDate date;
        private HolidayType type;
        private String description;
        private boolean notifyViaFeeds;
        private boolean reprocessLeave;
        private int reminderDaysBefore;
        private String applicableFor;
        private boolean shiftBased;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder type(HolidayType type) {
            this.type = type;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder notifyViaFeeds(boolean notifyViaFeeds) {
            this.notifyViaFeeds = notifyViaFeeds;
            return this;
        }

        public Builder reprocessLeave(boolean reprocessLeave) {
            this.reprocessLeave = reprocessLeave;
            return this;
        }

        public Builder reminderDaysBefore(int reminderDaysBefore) {
            this.reminderDaysBefore = reminderDaysBefore;
            return this;
        }

        public Builder applicableFor(String applicableFor) {
            this.applicableFor = applicableFor;
            return this;
        }

        public Builder shiftBased(boolean shiftBased) {
            this.shiftBased = shiftBased;
            return this;
        }

        public HolidayDTO build() {
            return new HolidayDTO(id, name, date, type, description, notifyViaFeeds, reprocessLeave,
                                  reminderDaysBefore, applicableFor, shiftBased);
        }
    }
}
