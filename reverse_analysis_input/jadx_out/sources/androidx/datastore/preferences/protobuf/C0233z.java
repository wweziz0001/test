package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0233z extends IOException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4219l;

    public static C0233z a() {
        return new C0233z("Protocol message had invalid UTF-8.");
    }

    public static C0232y b() {
        return new C0232y("Protocol message tag had invalid wire type.");
    }

    public static C0233z c() {
        return new C0233z("CodedInputStream encountered a malformed varint.");
    }

    public static C0233z d() {
        return new C0233z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0233z e() {
        return new C0233z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
