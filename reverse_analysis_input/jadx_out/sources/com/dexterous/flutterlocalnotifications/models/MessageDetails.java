package com.dexterous.flutterlocalnotifications.models;

import g.InterfaceC0434a;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public class MessageDetails implements Serializable {
    public String dataMimeType;
    public String dataUri;
    public PersonDetails person;
    public String text;
    public Long timestamp;

    public MessageDetails(String str, Long l3, PersonDetails personDetails, String str2, String str3) {
        this.text = str;
        this.timestamp = l3;
        this.person = personDetails;
        this.dataMimeType = str2;
        this.dataUri = str3;
    }
}
