package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f5143c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List d(long j5, Object obj, int i) {
        List list;
        List list2 = (List) o0.f5235b.i(j5, obj);
        if (list2.isEmpty()) {
            List e5 = list2 instanceof F ? new E(i) : ((list2 instanceof Y) && (list2 instanceof InterfaceC0345z)) ? ((InterfaceC0345z) list2).c(i) : new ArrayList(i);
            o0.v(j5, obj, e5);
            return e5;
        }
        if (f5143c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i);
            arrayList.addAll(list2);
            o0.v(j5, obj, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof j0)) {
                if (!(list2 instanceof Y) || !(list2 instanceof InterfaceC0345z)) {
                    return list2;
                }
                InterfaceC0345z interfaceC0345z = (InterfaceC0345z) list2;
                if (((AbstractC0322b) interfaceC0345z).f5180l) {
                    return list2;
                }
                InterfaceC0345z interfaceC0345zC = interfaceC0345z.c(list2.size() + i);
                o0.v(j5, obj, interfaceC0345zC);
                return interfaceC0345zC;
            }
            E e6 = new E(list2.size() + i);
            e6.addAll((j0) list2);
            o0.v(j5, obj, e6);
            list = e6;
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void a(long j5, Object obj) {
        Object objUnmodifiableList;
        List list = (List) o0.f5235b.i(j5, obj);
        if (list instanceof F) {
            objUnmodifiableList = ((F) list).a();
        } else {
            if (f5143c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof Y) && (list instanceof InterfaceC0345z)) {
                AbstractC0322b abstractC0322b = (AbstractC0322b) ((InterfaceC0345z) list);
                if (abstractC0322b.f5180l) {
                    abstractC0322b.f5180l = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        o0.v(j5, obj, objUnmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void b(long j5, Object obj, Object obj2) {
        List list = (List) o0.f5235b.i(j5, obj2);
        List listD = d(j5, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        o0.v(j5, obj, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List c(long j5, Object obj) {
        return d(j5, obj, 10);
    }
}
