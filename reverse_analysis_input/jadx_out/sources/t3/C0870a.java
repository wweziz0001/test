package t3;

import a0.C0200z;
import android.content.SharedPreferences;
import android.util.Log;
import j3.C0524a;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;

/* JADX INFO: renamed from: t3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0870a implements j3.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f10057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1.b f10058m = new p1.b(13);

    public static void d(InterfaceC0696f interfaceC0696f, final C0870a c0870a) {
        C0200z c0200zQ = interfaceC0696f.q();
        C0871b c0871b = C0871b.f10059e;
        Z1.i iVar = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0871b, c0200zQ);
        if (c0870a != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b(c0870a) { // from class: t3.c

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0870a f10062m;

                {
                    this.f10062m = c0870a;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i) {
                        case 0:
                            C0870a c0870a2 = this.f10062m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0870a2.f10057l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Z1.f.P(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            C0870a c0870a3 = this.f10062m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0870a3.f10057l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Z1.f.P(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0870a c0870a4 = this.f10062m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0870a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Z1.f.P(th3);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 3:
                            C0870a c0870a5 = this.f10062m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0870a5.f10057l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Z1.f.P(th4);
                            }
                            lVar.u(arrayList6);
                            break;
                        case 4:
                            C0870a c0870a6 = this.f10062m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0870a6.getClass();
                                String string = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0870a6.f10057l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Z1.f.P(th5);
                            }
                            lVar.u(arrayList8);
                            break;
                        case 5:
                            C0870a c0870a7 = this.f10062m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0870a7.f10057l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Z1.f.P(th6);
                            }
                            lVar.u(arrayList10);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0870a c0870a8 = this.f10062m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0870a8.f10057l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0870a8.f10058m.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Z1.f.P(th7);
                            }
                            lVar.u(arrayList12);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0870a c0870a9 = this.f10062m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0870a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Z1.f.P(th8);
                            }
                            lVar.u(arrayList14);
                            break;
                        default:
                            C0870a c0870a10 = this.f10062m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0870a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Z1.f.P(th9);
                            }
                            lVar.u(arrayList16);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        Z1.i iVar2 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0871b, c0200zQ);
        if (c0870a != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b(c0870a) { // from class: t3.c

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0870a f10062m;

                {
                    this.f10062m = c0870a;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i5) {
                        case 0:
                            C0870a c0870a2 = this.f10062m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0870a2.f10057l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Z1.f.P(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            C0870a c0870a3 = this.f10062m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0870a3.f10057l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Z1.f.P(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0870a c0870a4 = this.f10062m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0870a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Z1.f.P(th3);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 3:
                            C0870a c0870a5 = this.f10062m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0870a5.f10057l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Z1.f.P(th4);
                            }
                            lVar.u(arrayList6);
                            break;
                        case 4:
                            C0870a c0870a6 = this.f10062m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0870a6.getClass();
                                String string = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0870a6.f10057l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Z1.f.P(th5);
                            }
                            lVar.u(arrayList8);
                            break;
                        case 5:
                            C0870a c0870a7 = this.f10062m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0870a7.f10057l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Z1.f.P(th6);
                            }
                            lVar.u(arrayList10);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0870a c0870a8 = this.f10062m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0870a8.f10057l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0870a8.f10058m.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Z1.f.P(th7);
                            }
                            lVar.u(arrayList12);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0870a c0870a9 = this.f10062m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0870a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Z1.f.P(th8);
                            }
                            lVar.u(arrayList14);
                            break;
                        default:
                            C0870a c0870a10 = this.f10062m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0870a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Z1.f.P(th9);
                            }
                            lVar.u(arrayList16);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        Z1.i iVar3 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0871b, c0200zQ);
        if (c0870a != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b(c0870a) { // from class: t3.c

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0870a f10062m;

                {
                    this.f10062m = c0870a;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i6) {
                        case 0:
                            C0870a c0870a2 = this.f10062m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0870a2.f10057l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Z1.f.P(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            C0870a c0870a3 = this.f10062m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0870a3.f10057l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Z1.f.P(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0870a c0870a4 = this.f10062m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0870a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Z1.f.P(th3);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 3:
                            C0870a c0870a5 = this.f10062m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0870a5.f10057l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Z1.f.P(th4);
                            }
                            lVar.u(arrayList6);
                            break;
                        case 4:
                            C0870a c0870a6 = this.f10062m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0870a6.getClass();
                                String string = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0870a6.f10057l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Z1.f.P(th5);
                            }
                            lVar.u(arrayList8);
                            break;
                        case 5:
                            C0870a c0870a7 = this.f10062m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0870a7.f10057l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Z1.f.P(th6);
                            }
                            lVar.u(arrayList10);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0870a c0870a8 = this.f10062m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0870a8.f10057l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0870a8.f10058m.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Z1.f.P(th7);
                            }
                            lVar.u(arrayList12);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0870a c0870a9 = this.f10062m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0870a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Z1.f.P(th8);
                            }
                            lVar.u(arrayList14);
                            break;
                        default:
                            C0870a c0870a10 = this.f10062m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0870a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Z1.f.P(th9);
                            }
                            lVar.u(arrayList16);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        Z1.i iVar4 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0871b, c0200zQ);
        if (c0870a != null) {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b(c0870a) { // from class: t3.c

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0870a f10062m;

                {
                    this.f10062m = c0870a;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i7) {
                        case 0:
                            C0870a c0870a2 = this.f10062m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0870a2.f10057l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Z1.f.P(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            C0870a c0870a3 = this.f10062m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0870a3.f10057l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Z1.f.P(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0870a c0870a4 = this.f10062m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0870a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Z1.f.P(th3);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 3:
                            C0870a c0870a5 = this.f10062m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0870a5.f10057l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Z1.f.P(th4);
                            }
                            lVar.u(arrayList6);
                            break;
                        case 4:
                            C0870a c0870a6 = this.f10062m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0870a6.getClass();
                                String string = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0870a6.f10057l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Z1.f.P(th5);
                            }
                            lVar.u(arrayList8);
                            break;
                        case 5:
                            C0870a c0870a7 = this.f10062m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0870a7.f10057l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Z1.f.P(th6);
                            }
                            lVar.u(arrayList10);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0870a c0870a8 = this.f10062m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0870a8.f10057l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0870a8.f10058m.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Z1.f.P(th7);
                            }
                            lVar.u(arrayList12);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0870a c0870a9 = this.f10062m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0870a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Z1.f.P(th8);
                            }
                            lVar.u(arrayList14);
                            break;
                        default:
                            C0870a c0870a10 = this.f10062m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0870a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Z1.f.P(th9);
                            }
                            lVar.u(arrayList16);
                            break;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        Z1.i iVar5 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0871b, c0200zQ);
        if (c0870a != null) {
            final int i8 = 4;
            iVar5.E(new InterfaceC0692b(c0870a) { // from class: t3.c

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0870a f10062m;

                {
                    this.f10062m = c0870a;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i8) {
                        case 0:
                            C0870a c0870a2 = this.f10062m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0870a2.f10057l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Z1.f.P(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            C0870a c0870a3 = this.f10062m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0870a3.f10057l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Z1.f.P(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0870a c0870a4 = this.f10062m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0870a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Z1.f.P(th3);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 3:
                            C0870a c0870a5 = this.f10062m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0870a5.f10057l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Z1.f.P(th4);
                            }
                            lVar.u(arrayList6);
                            break;
                        case 4:
                            C0870a c0870a6 = this.f10062m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0870a6.getClass();
                                String string = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0870a6.f10057l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Z1.f.P(th5);
                            }
                            lVar.u(arrayList8);
                            break;
                        case 5:
                            C0870a c0870a7 = this.f10062m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0870a7.f10057l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Z1.f.P(th6);
                            }
                            lVar.u(arrayList10);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0870a c0870a8 = this.f10062m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0870a8.f10057l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0870a8.f10058m.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Z1.f.P(th7);
                            }
                            lVar.u(arrayList12);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0870a c0870a9 = this.f10062m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0870a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Z1.f.P(th8);
                            }
                            lVar.u(arrayList14);
                            break;
                        default:
                            C0870a c0870a10 = this.f10062m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0870a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Z1.f.P(th9);
                            }
                            lVar.u(arrayList16);
                            break;
                    }
                }
            });
        } else {
            iVar5.E(null);
        }
        Z1.i iVar6 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0871b, c0200zQ);
        if (c0870a != null) {
            final int i9 = 5;
            iVar6.E(new InterfaceC0692b(c0870a) { // from class: t3.c

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0870a f10062m;

                {
                    this.f10062m = c0870a;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i9) {
                        case 0:
                            C0870a c0870a2 = this.f10062m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0870a2.f10057l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Z1.f.P(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            C0870a c0870a3 = this.f10062m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0870a3.f10057l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Z1.f.P(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0870a c0870a4 = this.f10062m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0870a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Z1.f.P(th3);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 3:
                            C0870a c0870a5 = this.f10062m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0870a5.f10057l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Z1.f.P(th4);
                            }
                            lVar.u(arrayList6);
                            break;
                        case 4:
                            C0870a c0870a6 = this.f10062m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0870a6.getClass();
                                String string = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0870a6.f10057l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Z1.f.P(th5);
                            }
                            lVar.u(arrayList8);
                            break;
                        case 5:
                            C0870a c0870a7 = this.f10062m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0870a7.f10057l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Z1.f.P(th6);
                            }
                            lVar.u(arrayList10);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0870a c0870a8 = this.f10062m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0870a8.f10057l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0870a8.f10058m.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Z1.f.P(th7);
                            }
                            lVar.u(arrayList12);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0870a c0870a9 = this.f10062m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0870a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Z1.f.P(th8);
                            }
                            lVar.u(arrayList14);
                            break;
                        default:
                            C0870a c0870a10 = this.f10062m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0870a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Z1.f.P(th9);
                            }
                            lVar.u(arrayList16);
                            break;
                    }
                }
            });
        } else {
            iVar6.E(null);
        }
        Z1.i iVar7 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0871b, c0200zQ);
        if (c0870a != null) {
            final int i10 = 6;
            iVar7.E(new InterfaceC0692b(c0870a) { // from class: t3.c

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0870a f10062m;

                {
                    this.f10062m = c0870a;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i10) {
                        case 0:
                            C0870a c0870a2 = this.f10062m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0870a2.f10057l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Z1.f.P(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            C0870a c0870a3 = this.f10062m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0870a3.f10057l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Z1.f.P(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0870a c0870a4 = this.f10062m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0870a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Z1.f.P(th3);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 3:
                            C0870a c0870a5 = this.f10062m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0870a5.f10057l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Z1.f.P(th4);
                            }
                            lVar.u(arrayList6);
                            break;
                        case 4:
                            C0870a c0870a6 = this.f10062m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0870a6.getClass();
                                String string = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0870a6.f10057l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Z1.f.P(th5);
                            }
                            lVar.u(arrayList8);
                            break;
                        case 5:
                            C0870a c0870a7 = this.f10062m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0870a7.f10057l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Z1.f.P(th6);
                            }
                            lVar.u(arrayList10);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0870a c0870a8 = this.f10062m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0870a8.f10057l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0870a8.f10058m.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Z1.f.P(th7);
                            }
                            lVar.u(arrayList12);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0870a c0870a9 = this.f10062m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0870a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Z1.f.P(th8);
                            }
                            lVar.u(arrayList14);
                            break;
                        default:
                            C0870a c0870a10 = this.f10062m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0870a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Z1.f.P(th9);
                            }
                            lVar.u(arrayList16);
                            break;
                    }
                }
            });
        } else {
            iVar7.E(null);
        }
        Z1.i iVar8 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0871b, c0200zQ);
        if (c0870a != null) {
            final int i11 = 7;
            iVar8.E(new InterfaceC0692b(c0870a) { // from class: t3.c

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0870a f10062m;

                {
                    this.f10062m = c0870a;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i11) {
                        case 0:
                            C0870a c0870a2 = this.f10062m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0870a2.f10057l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Z1.f.P(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            C0870a c0870a3 = this.f10062m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0870a3.f10057l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Z1.f.P(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0870a c0870a4 = this.f10062m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0870a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Z1.f.P(th3);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 3:
                            C0870a c0870a5 = this.f10062m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0870a5.f10057l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Z1.f.P(th4);
                            }
                            lVar.u(arrayList6);
                            break;
                        case 4:
                            C0870a c0870a6 = this.f10062m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0870a6.getClass();
                                String string = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0870a6.f10057l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Z1.f.P(th5);
                            }
                            lVar.u(arrayList8);
                            break;
                        case 5:
                            C0870a c0870a7 = this.f10062m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0870a7.f10057l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Z1.f.P(th6);
                            }
                            lVar.u(arrayList10);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0870a c0870a8 = this.f10062m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0870a8.f10057l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0870a8.f10058m.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Z1.f.P(th7);
                            }
                            lVar.u(arrayList12);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0870a c0870a9 = this.f10062m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0870a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Z1.f.P(th8);
                            }
                            lVar.u(arrayList14);
                            break;
                        default:
                            C0870a c0870a10 = this.f10062m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0870a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Z1.f.P(th9);
                            }
                            lVar.u(arrayList16);
                            break;
                    }
                }
            });
        } else {
            iVar8.E(null);
        }
        Z1.i iVar9 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0871b, c0200zQ);
        if (c0870a == null) {
            iVar9.E(null);
        } else {
            final int i12 = 8;
            iVar9.E(new InterfaceC0692b(c0870a) { // from class: t3.c

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C0870a f10062m;

                {
                    this.f10062m = c0870a;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    switch (i12) {
                        case 0:
                            C0870a c0870a2 = this.f10062m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0870a2.f10057l.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = Z1.f.P(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            C0870a c0870a3 = this.f10062m;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0870a3.f10057l.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = Z1.f.P(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            C0870a c0870a4 = this.f10062m;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0870a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = Z1.f.P(th3);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 3:
                            C0870a c0870a5 = this.f10062m;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0870a5.f10057l.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = Z1.f.P(th4);
                            }
                            lVar.u(arrayList6);
                            break;
                        case 4:
                            C0870a c0870a6 = this.f10062m;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d5 = (Double) arrayList9.get(1);
                            try {
                                c0870a6.getClass();
                                String string = Double.toString(d5.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0870a6.f10057l.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = Z1.f.P(th5);
                            }
                            lVar.u(arrayList8);
                            break;
                        case 5:
                            C0870a c0870a7 = this.f10062m;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0870a7.f10057l.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = Z1.f.P(th6);
                            }
                            lVar.u(arrayList10);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0870a c0870a8 = this.f10062m;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0870a8.f10057l.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0870a8.f10058m.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = Z1.f.P(th7);
                            }
                            lVar.u(arrayList12);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0870a c0870a9 = this.f10062m;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0870a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = Z1.f.P(th8);
                            }
                            lVar.u(arrayList14);
                            break;
                        default:
                            C0870a c0870a10 = this.f10062m;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0870a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = Z1.f.P(th9);
                            }
                            lVar.u(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor editorEdit = this.f10057l.edit();
        Map<String, ?> all = this.f10057l.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final HashMap b(String str, List list) throws ClassNotFoundException, IOException {
        Object bigInteger;
        Object objValueOf;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f10057l.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj = all.get(str2);
                Objects.requireNonNull(obj);
                boolean z4 = obj instanceof String;
                p1.b bVar = this.f10058m;
                if (z4) {
                    String str3 = (String) obj;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        objValueOf = obj;
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            objValueOf = bVar.n(str3.substring(40));
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        bigInteger = new BigInteger(str3.substring(44), 36);
                        objValueOf = bigInteger;
                    } else {
                        objValueOf = obj;
                        if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                            objValueOf = Double.valueOf(str3.substring(40));
                        }
                    }
                    map.put(str2, objValueOf);
                } else {
                    boolean z5 = obj instanceof Set;
                    objValueOf = obj;
                    if (z5) {
                        ArrayList arrayList = new ArrayList((Set) obj);
                        this.f10057l.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + bVar.o(arrayList)).apply();
                        bigInteger = arrayList;
                        objValueOf = bigInteger;
                    }
                    map.put(str2, objValueOf);
                }
            }
        }
        return map;
    }

    public final Boolean c(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f10057l.edit().putString(str, str2).commit());
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        this.f10057l = c0524a.f7453a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            d(interfaceC0696f, this);
        } catch (Exception e5) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e5);
        }
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        d(c0524a.f7455c, null);
    }
}
