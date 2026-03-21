package com.dexterous.flutterlocalnotifications.models;

import g.InterfaceC0434a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    public boolean useAlarmClock() {
        return this == alarmClock;
    }

    public boolean useAllowWhileIdle() {
        return this == exactAllowWhileIdle || this == inexactAllowWhileIdle;
    }

    public boolean useExactAlarm() {
        return this == exact || this == exactAllowWhileIdle;
    }
}
