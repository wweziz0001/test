package t3;

import a.AbstractC0149a;
import a0.C0200z;
import b3.AbstractC0307a;
import java.util.List;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;

/* JADX INFO: renamed from: t3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0874e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0874e f10065a = new C0874e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B3.e f10066b = new B3.e(new defpackage.c(2));

    public static InterfaceC0703m a() {
        return (InterfaceC0703m) f10066b.a();
    }

    public static void b(InterfaceC0696f interfaceC0696f, final InterfaceC0875f interfaceC0875f, String str) {
        N3.h.e(interfaceC0696f, "binaryMessenger");
        String strConcat = str.length() > 0 ? ".".concat(str) : "";
        C0200z c0200zQ = interfaceC0696f.q();
        Z1.i iVar = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i = 6;
            iVar.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        Z1.i iVar2 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i5 = 12;
            iVar2.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i5) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        Z1.i iVar3 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i6 = 13;
            iVar3.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i6) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        Z1.i iVar4 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i7 = 14;
            iVar4.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i7) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        Z1.i iVar5 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i8 = 0;
            iVar5.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i8) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar5.E(null);
        }
        Z1.i iVar6 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i9 = 1;
            iVar6.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i9) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar6.E(null);
        }
        Z1.i iVar7 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i10 = 2;
            iVar7.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i10) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar7.E(null);
        }
        Z1.i iVar8 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i11 = 3;
            iVar8.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i11) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar8.E(null);
        }
        Z1.i iVar9 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i12 = 4;
            iVar9.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i12) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar9.E(null);
        }
        Z1.i iVar10 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i13 = 5;
            iVar10.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i13) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar10.E(null);
        }
        Z1.i iVar11 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i14 = 7;
            iVar11.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i14) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar11.E(null);
        }
        Z1.i iVar12 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i15 = 8;
            iVar12.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i15) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar12.E(null);
        }
        Z1.i iVar13 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i16 = 9;
            iVar13.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i16) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar13.E(null);
        }
        Z1.i iVar14 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), a(), c0200zQ);
        if (interfaceC0875f != null) {
            final int i17 = 10;
            iVar14.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i17) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        } else {
            iVar14.E(null);
        }
        Z1.i iVar15 = new Z1.i(interfaceC0696f, AbstractC0307a.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), a(), c0200zQ);
        if (interfaceC0875f == null) {
            iVar15.E(null);
        } else {
            final int i18 = 11;
            iVar15.E(new InterfaceC0692b() { // from class: t3.d
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listB;
                    List listB2;
                    List listB3;
                    List listB4;
                    List listB5;
                    List listB6;
                    List listB7;
                    List listB8;
                    List listB9;
                    List listB10;
                    List listB11;
                    List listB12;
                    List listB13;
                    List listB14;
                    List listB15;
                    switch (i18) {
                        case 0:
                            InterfaceC0875f interfaceC0875f2 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f2.g(str2, str3, (C0876g) obj4);
                                listB = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listB = AbstractC0149a.b(th);
                            }
                            lVar.u(listB);
                            break;
                        case 1:
                            InterfaceC0875f interfaceC0875f3 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f3.a(str4, list3, (C0876g) obj7);
                                listB2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listB2 = AbstractC0149a.b(th2);
                            }
                            lVar.u(listB2);
                            break;
                        case 2:
                            InterfaceC0875f interfaceC0875f4 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N3.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB3 = AbstractC0149a.y(interfaceC0875f4.p(str5, (C0876g) obj9));
                            } catch (Throwable th3) {
                                listB3 = AbstractC0149a.b(th3);
                            }
                            lVar.u(listB3);
                            break;
                        case 3:
                            InterfaceC0875f interfaceC0875f5 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N3.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB4 = AbstractC0149a.y(interfaceC0875f5.r(str6, (C0876g) obj11));
                            } catch (Throwable th4) {
                                listB4 = AbstractC0149a.b(th4);
                            }
                            lVar.u(listB4);
                            break;
                        case 4:
                            InterfaceC0875f interfaceC0875f6 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N3.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB5 = AbstractC0149a.y(interfaceC0875f6.m(str7, (C0876g) obj13));
                            } catch (Throwable th5) {
                                listB5 = AbstractC0149a.b(th5);
                            }
                            lVar.u(listB5);
                            break;
                        case 5:
                            InterfaceC0875f interfaceC0875f7 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N3.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB6 = AbstractC0149a.y(interfaceC0875f7.i(str8, (C0876g) obj15));
                            } catch (Throwable th6) {
                                listB6 = AbstractC0149a.b(th6);
                            }
                            lVar.u(listB6);
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0875f interfaceC0875f8 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N3.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f8.q(str9, zBooleanValue, (C0876g) obj18);
                                listB7 = AbstractC0149a.y(null);
                            } catch (Throwable th7) {
                                listB7 = AbstractC0149a.b(th7);
                            }
                            lVar.u(listB7);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0875f interfaceC0875f9 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N3.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB8 = AbstractC0149a.y(interfaceC0875f9.l(str10, (C0876g) obj20));
                            } catch (Throwable th8) {
                                listB8 = AbstractC0149a.b(th8);
                            }
                            lVar.u(listB8);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0875f interfaceC0875f10 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB9 = AbstractC0149a.y(interfaceC0875f10.o(str11, (C0876g) obj22));
                            } catch (Throwable th9) {
                                listB9 = AbstractC0149a.b(th9);
                            }
                            lVar.u(listB9);
                            break;
                        case 9:
                            InterfaceC0875f interfaceC0875f11 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N3.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f11.f(list12, (C0876g) obj23);
                                listB10 = AbstractC0149a.y(null);
                            } catch (Throwable th10) {
                                listB10 = AbstractC0149a.b(th10);
                            }
                            lVar.u(listB10);
                            break;
                        case 10:
                            InterfaceC0875f interfaceC0875f12 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N3.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB11 = AbstractC0149a.y(interfaceC0875f12.b(list14, (C0876g) obj24));
                            } catch (Throwable th11) {
                                listB11 = AbstractC0149a.b(th11);
                            }
                            lVar.u(listB11);
                            break;
                        case 11:
                            InterfaceC0875f interfaceC0875f13 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listB12 = AbstractC0149a.y(interfaceC0875f13.n(list16, (C0876g) obj25));
                            } catch (Throwable th12) {
                                listB12 = AbstractC0149a.b(th12);
                            }
                            lVar.u(listB12);
                            break;
                        case 12:
                            InterfaceC0875f interfaceC0875f14 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N3.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f14.e(str12, str13, (C0876g) obj28);
                                listB13 = AbstractC0149a.y(null);
                            } catch (Throwable th13) {
                                listB13 = AbstractC0149a.b(th13);
                            }
                            lVar.u(listB13);
                            break;
                        case 13:
                            InterfaceC0875f interfaceC0875f15 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N3.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N3.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f15.c(str14, jLongValue, (C0876g) obj31);
                                listB14 = AbstractC0149a.y(null);
                            } catch (Throwable th14) {
                                listB14 = AbstractC0149a.b(th14);
                            }
                            lVar.u(listB14);
                            break;
                        default:
                            InterfaceC0875f interfaceC0875f16 = interfaceC0875f;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N3.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N3.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N3.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0875f16.h(str15, dDoubleValue, (C0876g) obj34);
                                listB15 = AbstractC0149a.y(null);
                            } catch (Throwable th15) {
                                listB15 = AbstractC0149a.b(th15);
                            }
                            lVar.u(listB15);
                            break;
                    }
                }
            });
        }
    }
}
