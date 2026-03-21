package D1;

import A0.w;
import C3.o;
import D3.f;
import E3.g;
import E3.h;
import E3.i;
import I.k;
import I.m;
import I.n;
import O.j;
import Q1.C;
import Q1.C0118a;
import Q1.C0121d;
import Q1.r;
import R1.q;
import U3.l;
import V3.J;
import a.AbstractC0149a;
import a0.C0200z;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import b3.AbstractC0307a;
import b3.AbstractC0313g;
import b3.C0310d;
import c1.C0318a;
import c2.ExecutorC0319a;
import com.example.hqp_mobile_app.R;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.InterfaceC0351d;
import f0.C0416k;
import f0.C0417l;
import g4.p;
import g4.t;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l0.C0563b;
import m.A;
import m2.g0;
import m3.C0675i;
import n.C0681a;
import n3.C0704n;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;
import s1.C0786b;
import t1.AbstractC0859a;
import u3.C0896b;
import x1.InterfaceC0986b;
import y1.C1002b;
import y3.C1039j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static g A(g gVar, h hVar) {
        N3.h.e(hVar, "key");
        if (N3.h.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final int B(Cursor cursor, String str) {
        N3.h.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        int i = -1;
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            String[] columnNames = cursor.getColumnNames();
            N3.h.d(columnNames, "columnNames");
            String strConcat = ".".concat(str);
            String str2 = "." + str + '`';
            int length = columnNames.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                String str3 = columnNames[i5];
                int i7 = i6 + 1;
                if (str3.length() >= str.length() + 2 && (l.d0(str3, strConcat, false) || (str3.charAt(0) == '`' && l.d0(str3, str2, false)))) {
                    i = i6;
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        return i;
    }

    public static final int C(Cursor cursor, String str) {
        String string;
        N3.h.e(cursor, "c");
        int iB = B(cursor, str);
        if (iB >= 0) {
            return iB;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            N3.h.d(columnNames, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i = 0;
            for (String str2 : columnNames) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                i4.a.d(sb, str2, null);
            }
            sb.append((CharSequence) "");
            string = sb.toString();
        } catch (Exception e5) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e5);
            string = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }

    public static C0417l D(int i) {
        int i5 = AbstractC0370w.f5326a;
        Locale locale = Locale.US;
        return new C0417l(Uri.parse("rtp://0.0.0.0:" + i), 1, null, Collections.emptyMap(), 0L, -1L, null, 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class E(S3.b bVar) {
        N3.h.e(bVar, "<this>");
        Class clsA = ((N3.d) bVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    public static B.c F(A a5) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new B.c(m.c(a5));
        }
        TextPaint textPaint = new TextPaint(a5.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iA = k.a(a5);
        int iD = k.d(a5);
        if (a5.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (a5.getInputType() & 15) != 3) {
            boolean z4 = a5.getLayoutDirection() == 1;
            switch (a5.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z4) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(m.b(I.l.a(a5.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new B.c(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static C1002b G(C0675i c0675i, SQLiteDatabase sQLiteDatabase) {
        N3.h.e(c0675i, "refHolder");
        N3.h.e(sQLiteDatabase, "sqLiteDatabase");
        C1002b c1002b = (C1002b) c0675i.f8712m;
        if (c1002b != null && N3.h.a(c1002b.f10911l, sQLiteDatabase)) {
            return c1002b;
        }
        C1002b c1002b2 = new C1002b(sQLiteDatabase);
        c0675i.f8712m = c1002b2;
        return c1002b2;
    }

    public static i H(g gVar, h hVar) {
        N3.h.e(hVar, "key");
        return N3.h.a(gVar.getKey(), hVar) ? E3.j.f675l : gVar;
    }

    public static void I(c1.d dVar, int i, InterfaceC0351d interfaceC0351d) {
        long jG = dVar.g(i);
        List listD = dVar.d(jG);
        if (listD.isEmpty()) {
            return;
        }
        if (i == dVar.h() - 1) {
            throw new IllegalStateException();
        }
        long jG2 = dVar.g(i + 1) - dVar.g(i);
        if (jG2 > 0) {
            interfaceC0351d.accept(new C0318a(listD, jG, jG2));
        }
    }

    public static i K(g gVar, i iVar) {
        N3.h.e(iVar, "context");
        return iVar == E3.j.f675l ? gVar : (i) iVar.k(gVar, new E3.b(1));
    }

    public static R.b N(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j5;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i5 = 0;
        while (true) {
            if (i5 >= i) {
                j5 = -1;
                break;
            }
            int i6 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j5 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i6) {
                break;
            }
            i5++;
        }
        if (j5 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j5 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j6 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i7 = 0; i7 < j6; i7++) {
                int i8 = byteBufferDuplicate.getInt();
                long j7 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i8 || 1701669481 == i8) {
                    byteBufferDuplicate.position((int) (j7 + j5));
                    R.b bVar = new R.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f376o = byteBufferDuplicate;
                    bVar.f373l = iPosition;
                    int i9 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f374m = i9;
                    bVar.f375n = ((ByteBuffer) bVar.f376o).getShort(i9);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void O(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            m.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void P(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i5);
        }
    }

    public static void Q(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        A.e eVar;
        N3.h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new defpackage.g(1) : eVar.e();
        Z1.i iVar = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.x
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    switch (i) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c1039j3.getClass();
                                cookieManager.setCookie(str, str2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            C1054y c1054y = new C1054y(lVar, 0);
                            c1039j.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C1042m(0, c1054y));
                            break;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            N3.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c1039j4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        Z1.i iVar2 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: y3.x
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    switch (i5) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c1039j3.getClass();
                                cookieManager.setCookie(str, str2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            C1054y c1054y = new C1054y(lVar, 0);
                            c1039j.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C1042m(0, c1054y));
                            break;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            N3.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c1039j4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        Z1.i iVar3 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b() { // from class: y3.x
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    switch (i6) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c1039j3.getClass();
                                cookieManager.setCookie(str, str2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            C1054y c1054y = new C1054y(lVar, 0);
                            c1039j.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C1042m(0, c1054y));
                            break;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            N3.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c1039j4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        Z1.i iVar4 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar4.E(null);
        } else {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b() { // from class: y3.x
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    switch (i7) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C1032c) c1039j2.f11068a.f9n).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                listQ = AbstractC0149a.y(null);
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            break;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c1039j3.getClass();
                                cookieManager.setCookie(str, str2);
                                listQ2 = AbstractC0149a.y(null);
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            break;
                        case 2:
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            C1054y c1054y = new C1054y(lVar, 0);
                            c1039j.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C1042m(0, c1054y));
                            break;
                        default:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            N3.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            N3.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c1039j4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listQ3 = AbstractC0149a.y(null);
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            break;
                    }
                }
            });
        }
    }

    public static void R(InterfaceC0696f interfaceC0696f, final C1039j c1039j) {
        A.e eVar;
        N3.h.e(interfaceC0696f, "binaryMessenger");
        InterfaceC0703m gVar = (c1039j == null || (eVar = c1039j.f11068a) == null) ? new defpackage.g(1) : eVar.e();
        Z1.i iVar = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b() { // from class: y3.D
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c1039j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listQ = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            return;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c1039j3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listQ2 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            return;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(new C1028X(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            return;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listQ4 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            return;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listQ5 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            return;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1050u enumC1050u = (EnumC1050u) obj14;
                            try {
                                c1039j7.getClass();
                                int iOrdinal = enumC1050u.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC1050u enumC1050u2 = EnumC1050u.f11104n;
                                    c1039j7.f11068a.getClass();
                                    throw new IllegalArgumentException(enumC1050u2 + " doesn't represent a native value.");
                                }
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            return;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        Z1.i iVar2 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b() { // from class: y3.D
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i5) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c1039j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listQ = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            return;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c1039j3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listQ2 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            return;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(new C1028X(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            return;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listQ4 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            return;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listQ5 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            return;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1050u enumC1050u = (EnumC1050u) obj14;
                            try {
                                c1039j7.getClass();
                                int iOrdinal = enumC1050u.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC1050u enumC1050u2 = EnumC1050u.f11104n;
                                    c1039j7.f11068a.getClass();
                                    throw new IllegalArgumentException(enumC1050u2 + " doesn't represent a native value.");
                                }
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            return;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        Z1.i iVar3 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b() { // from class: y3.D
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i6) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c1039j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listQ = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            return;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c1039j3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listQ2 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            return;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(new C1028X(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            return;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listQ4 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            return;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listQ5 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            return;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1050u enumC1050u = (EnumC1050u) obj14;
                            try {
                                c1039j7.getClass();
                                int iOrdinal = enumC1050u.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC1050u enumC1050u2 = EnumC1050u.f11104n;
                                    c1039j7.f11068a.getClass();
                                    throw new IllegalArgumentException(enumC1050u2 + " doesn't represent a native value.");
                                }
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            return;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        Z1.i iVar4 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b() { // from class: y3.D
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i7) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c1039j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listQ = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            return;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c1039j3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listQ2 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            return;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(new C1028X(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            return;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listQ4 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            return;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listQ5 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            return;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1050u enumC1050u = (EnumC1050u) obj14;
                            try {
                                c1039j7.getClass();
                                int iOrdinal = enumC1050u.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC1050u enumC1050u2 = EnumC1050u.f11104n;
                                    c1039j7.f11068a.getClass();
                                    throw new IllegalArgumentException(enumC1050u2 + " doesn't represent a native value.");
                                }
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            return;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        Z1.i iVar5 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", gVar, (C0200z) null);
        if (c1039j != null) {
            final int i8 = 4;
            iVar5.E(new InterfaceC0692b() { // from class: y3.D
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i8) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c1039j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listQ = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            return;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c1039j3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listQ2 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            return;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(new C1028X(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            return;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listQ4 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            return;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listQ5 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            return;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1050u enumC1050u = (EnumC1050u) obj14;
                            try {
                                c1039j7.getClass();
                                int iOrdinal = enumC1050u.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC1050u enumC1050u2 = EnumC1050u.f11104n;
                                    c1039j7.f11068a.getClass();
                                    throw new IllegalArgumentException(enumC1050u2 + " doesn't represent a native value.");
                                }
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            return;
                    }
                }
            });
        } else {
            iVar5.E(null);
        }
        Z1.i iVar6 = new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", gVar, (C0200z) null);
        if (c1039j == null) {
            iVar6.E(null);
        } else {
            final int i9 = 5;
            iVar6.E(new InterfaceC0692b() { // from class: y3.D
                @Override // n3.InterfaceC0692b
                public final void t(Object obj, Z1.l lVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    switch (i9) {
                        case 0:
                            C1039j c1039j2 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c1039j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listQ = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th) {
                                listQ = Z1.f.Q(th);
                            }
                            lVar.u(listQ);
                            return;
                        case 1:
                            C1039j c1039j3 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c1039j3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listQ2 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th2) {
                                listQ2 = Z1.f.Q(th2);
                            }
                            lVar.u(listQ2);
                            return;
                        case 2:
                            C1039j c1039j4 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            N3.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c1039j4.getClass();
                                listQ3 = AbstractC0149a.y(new C1028X(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listQ3 = Z1.f.Q(th3);
                            }
                            lVar.u(listQ3);
                            return;
                        case 3:
                            C1039j c1039j5 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c1039j5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listQ4 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th4) {
                                listQ4 = Z1.f.Q(th4);
                            }
                            lVar.u(listQ4);
                            return;
                        case 4:
                            C1039j c1039j6 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c1039j6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listQ5 = AbstractC0149a.y(null);
                                break;
                            } catch (Throwable th5) {
                                listQ5 = Z1.f.Q(th5);
                            }
                            lVar.u(listQ5);
                            return;
                        default:
                            C1039j c1039j7 = c1039j;
                            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC1050u enumC1050u = (EnumC1050u) obj14;
                            try {
                                c1039j7.getClass();
                                int iOrdinal = enumC1050u.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC1050u enumC1050u2 = EnumC1050u.f11104n;
                                    c1039j7.f11068a.getClass();
                                    throw new IllegalArgumentException(enumC1050u2 + " doesn't represent a native value.");
                                }
                                listQ6 = AbstractC0149a.y(null);
                            } catch (Throwable th6) {
                                listQ6 = Z1.f.Q(th6);
                            }
                            lVar.u(listQ6);
                            return;
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void S(c1.d r13, c1.k r14, d0.InterfaceC0351d r15) {
        /*
            long r0 = r14.f5053a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r13.a(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r13.h()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r13.g(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L52
            int r2 = r13.h()
            if (r4 >= r2) goto L52
            java.util.List r7 = r13.d(r0)
            long r2 = r13.g(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L52
            long r8 = r14.f5053a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L52
            c1.a r12 = new c1.a
            long r10 = r2 - r8
            r6 = r12
            r6.<init>(r7, r8, r10)
            r15.accept(r12)
            r2 = 1
            goto L53
        L52:
            r2 = r5
        L53:
            r3 = r4
        L54:
            int r6 = r13.h()
            if (r3 >= r6) goto L60
            I(r13, r3, r15)
            int r3 = r3 + 1
            goto L54
        L60:
            boolean r14 = r14.f5054b
            if (r14 == 0) goto L89
            if (r2 == 0) goto L68
            int r4 = r4 + (-1)
        L68:
            if (r5 >= r4) goto L70
            I(r13, r5, r15)
            int r5 = r5 + 1
            goto L68
        L70:
            if (r2 == 0) goto L89
            c1.a r14 = new c1.a
            java.util.List r7 = r13.d(r0)
            long r8 = r13.g(r4)
            long r2 = r13.g(r4)
            long r10 = r0 - r2
            r6 = r14
            r6.<init>(r7, r8, r10)
            r15.accept(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.b.S(c1.d, c1.k, d0.d):void");
    }

    public static ActionMode.Callback T(ActionMode.Callback callback) {
        return (!(callback instanceof n) || Build.VERSION.SDK_INT < 26) ? callback : ((n) callback).f1008a;
    }

    public static ActionMode.Callback U(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof n) || callback == null) ? callback : new n(callback, textView);
    }

    public static ArrayList V(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0896b) {
            C0896b c0896b = (C0896b) th;
            arrayList.add(c0896b.f10255l);
            arrayList.add(c0896b.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static void W(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final List b(Throwable th) {
        return C3.g.Q(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static String c(int i, String str, int i5) {
        if (i < 0) {
            return C.g0("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i5 >= 0) {
            return C.g0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(AbstractC0307a.i("negative size: ", i5));
    }

    public static final p d(t tVar) {
        N3.h.e(tVar, "<this>");
        return new p(tVar);
    }

    public static D3.i e(D3.i iVar) {
        f fVar = iVar.f620l;
        fVar.b();
        return fVar.f611t > 0 ? iVar : D3.i.f619m;
    }

    public static C0417l f(l0.m mVar, String str, l0.j jVar, int i) {
        C0416k c0416k = new C0416k();
        c0416k.f5679a = AbstractC0360m.w(str, jVar.f7864c);
        c0416k.f5682d = jVar.f7862a;
        c0416k.f5683e = jVar.f7863b;
        String strB = mVar.b();
        if (strB == null) {
            strB = AbstractC0360m.w(((C0563b) mVar.f7870m.get(0)).f7818a, jVar.f7864c).toString();
        }
        c0416k.f5684f = strB;
        c0416k.f5685g = i;
        c0416k.f5681c = g0.f8607r;
        AbstractC0360m.j(c0416k.f5679a, "The uri must be set.");
        return new C0417l(c0416k.f5679a, c0416k.f5680b, null, c0416k.f5681c, c0416k.f5682d, c0416k.f5683e, c0416k.f5684f, c0416k.f5685g);
    }

    public static String g(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b4)));
        }
        return sb.toString();
    }

    public static void k(boolean z4, String str, long j5) {
        if (!z4) {
            throw new IllegalArgumentException(C.g0(str, Long.valueOf(j5)));
        }
    }

    public static void l(int i, int i5) {
        String strG0;
        if (i < 0 || i >= i5) {
            if (i < 0) {
                strG0 = C.g0("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i5 < 0) {
                    throw new IllegalArgumentException(AbstractC0307a.i("negative size: ", i5));
                }
                strG0 = C.g0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(strG0);
        }
    }

    public static void m(String str, long j5) {
        if (j5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j5 + ") must be >= 0");
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void o(int i, int i5) {
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(c(i, "index", i5));
        }
    }

    public static void p(int i, int i5, int i6) {
        if (i < 0 || i5 < i || i5 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? c(i, "start index", i6) : (i5 < 0 || i5 > i6) ? c(i5, "end index", i6) : C.g0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] q(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static B0.j r(w wVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = wVar.length();
        int i = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (wVar.o(jElapsedRealtime, i5)) {
                i++;
            }
        }
        return new B0.j(1, 0, length, i);
    }

    public static final q s(Context context, C0118a c0118a) {
        s1.i iVar;
        int i;
        int i5;
        boolean zContainsKey;
        N3.h.e(context, "context");
        ExecutorService executorService = (ExecutorService) c0118a.f1800f;
        Z1.i iVar2 = new Z1.i();
        iVar2.f3014n = new Handler(Looper.getMainLooper());
        iVar2.f3015o = new ExecutorC0319a(iVar2, 0);
        a2.p pVar = new a2.p(executorService);
        iVar2.f3012l = pVar;
        iVar2.f3013m = new J(pVar);
        Context applicationContext = context.getApplicationContext();
        N3.h.d(applicationContext, "context.applicationContext");
        a2.p pVar2 = (a2.p) iVar2.f3012l;
        N3.h.d(pVar2, "workTaskExecutor.serialTaskExecutor");
        boolean z4 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        r rVar = (r) c0118a.f1801g;
        N3.h.e(rVar, "clock");
        if (z4) {
            iVar = new s1.i(applicationContext, null);
            iVar.i = true;
        } else {
            if (l.i0("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            s1.i iVar3 = new s1.i(applicationContext, "androidx.work.workdb");
            iVar3.f9591h = new R1.m(applicationContext);
            iVar = iVar3;
        }
        iVar.f9589f = pVar2;
        R1.b bVar = new R1.b(rVar);
        ArrayList arrayList = iVar.f9586c;
        arrayList.add(bVar);
        iVar.a(R1.d.f1867h);
        iVar.a(new R1.g(applicationContext, 2, 3));
        iVar.a(R1.d.i);
        iVar.a(R1.d.f1868j);
        iVar.a(new R1.g(applicationContext, 5, 6));
        iVar.a(R1.d.f1869k);
        iVar.a(R1.d.f1870l);
        iVar.a(R1.d.f1871m);
        iVar.a(new R1.g(applicationContext));
        iVar.a(new R1.g(applicationContext, 10, 11));
        iVar.a(R1.d.f1863d);
        iVar.a(R1.d.f1864e);
        iVar.a(R1.d.f1865f);
        iVar.a(R1.d.f1866g);
        iVar.f9593k = false;
        iVar.f9594l = true;
        Executor executor = iVar.f9589f;
        if (executor == null && iVar.f9590g == null) {
            D0.j jVar = C0681a.f8742c;
            iVar.f9590g = jVar;
            iVar.f9589f = jVar;
        } else if (executor != null && iVar.f9590g == null) {
            iVar.f9590g = executor;
        } else if (executor == null) {
            iVar.f9589f = iVar.f9590g;
        }
        HashSet hashSet = iVar.f9598p;
        LinkedHashSet linkedHashSet = iVar.f9597o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(AbstractC0307a.i("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", iIntValue).toString());
                }
            }
        }
        InterfaceC0986b bVar2 = iVar.f9591h;
        if (bVar2 == null) {
            bVar2 = new p1.b(19);
        }
        InterfaceC0986b interfaceC0986b = bVar2;
        if (iVar.f9595m > 0) {
            if (iVar.f9585b != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z5 = iVar.i;
        int i6 = iVar.f9592j;
        if (i6 == 0) {
            throw null;
        }
        Context context2 = iVar.f9584a;
        if (i6 != 1) {
            i = i6;
        } else {
            Object systemService = context2.getSystemService("activity");
            N3.h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = iVar.f9589f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = iVar.f9590g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C0786b c0786b = new C0786b(context2, iVar.f9585b, interfaceC0986b, iVar.f9596n, arrayList, z5, i, executor2, executor3, iVar.f9593k, iVar.f9594l, linkedHashSet, iVar.f9587d, iVar.f9588e);
        Package r4 = WorkDatabase.class.getPackage();
        N3.h.b(r4);
        String name = r4.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        N3.h.b(canonicalName);
        N3.h.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            N3.h.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strReplace = canonicalName.replace('.', '_');
        N3.h.d(strReplace, "replace(...)");
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, WorkDatabase.class.getClassLoader());
            N3.h.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            workDatabase.getClass();
            workDatabase.f4785c = workDatabase.e(c0786b);
            Set setI = workDatabase.i();
            BitSet bitSet = new BitSet();
            Iterator it2 = setI.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = workDatabase.f4789g;
                ArrayList arrayList2 = c0786b.f9568n;
                if (zHasNext) {
                    Class cls2 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i7 = size - 1;
                            if (cls2.isAssignableFrom(arrayList2.get(size).getClass())) {
                                bitSet.set(size);
                                break;
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size = i7;
                        }
                        size = -1;
                    } else {
                        size = -1;
                    }
                    if (size < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls2, arrayList2.get(size));
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i8 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i8 < 0) {
                                break;
                            }
                            size2 = i8;
                        }
                    }
                    for (AbstractC0859a abstractC0859a : workDatabase.g(linkedHashMap)) {
                        int i9 = abstractC0859a.f10001a;
                        C0675i c0675i = c0786b.f9559d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0675i.f8712m;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i9))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i9));
                            if (map == null) {
                                map = o.f292l;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(abstractC0859a.f10002b));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            c0675i.g(abstractC0859a);
                        }
                    }
                    workDatabase.h().setWriteAheadLoggingEnabled(c0786b.f9562g == 3);
                    workDatabase.f4788f = c0786b.f9560e;
                    workDatabase.f4784b = c0786b.f9563h;
                    N3.h.e(c0786b.i, "executor");
                    new ArrayDeque();
                    workDatabase.f4787e = c0786b.f9561f;
                    Map mapJ = workDatabase.j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = mapJ.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        ArrayList arrayList3 = c0786b.f9567m;
                        if (!zHasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i10 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i10 < 0) {
                                        break;
                                    }
                                    size3 = i10;
                                }
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            N3.h.d(applicationContext2, "context.applicationContext");
                            Context applicationContext3 = applicationContext2.getApplicationContext();
                            N3.h.d(applicationContext3, "context.applicationContext");
                            N3.h.e(iVar2, "taskExecutor");
                            X1.a aVar = new X1.a(applicationContext3, iVar2, 0);
                            Context applicationContext4 = applicationContext2.getApplicationContext();
                            N3.h.d(applicationContext4, "context.applicationContext");
                            N3.h.e(iVar2, "taskExecutor");
                            X1.a aVar2 = new X1.a(applicationContext4, iVar2, 1);
                            Context applicationContext5 = applicationContext2.getApplicationContext();
                            N3.h.d(applicationContext5, "context.applicationContext");
                            String str = X1.i.f2622a;
                            N3.h.e(iVar2, "taskExecutor");
                            X1.h hVar = new X1.h(applicationContext5, iVar2);
                            Context applicationContext6 = applicationContext2.getApplicationContext();
                            N3.h.d(applicationContext6, "context.applicationContext");
                            N3.h.e(iVar2, "taskExecutor");
                            X1.a aVar3 = new X1.a(applicationContext6, iVar2, 2);
                            N3.h.e(iVar2, "taskExecutor");
                            Z1.i iVar4 = new Z1.i();
                            iVar4.f3012l = aVar;
                            iVar4.f3013m = aVar2;
                            iVar4.f3014n = hVar;
                            iVar4.f3015o = aVar3;
                            R1.f fVar = new R1.f(context.getApplicationContext(), c0118a, iVar2, workDatabase);
                            String str2 = R1.j.f1893a;
                            U1.b bVar3 = new U1.b(context, workDatabase, c0118a);
                            a2.n.a(context, SystemJobService.class, true);
                            Q1.q.d().a(R1.j.f1893a, "Created SystemJobScheduler and enabled SystemJobService");
                            return new q(context.getApplicationContext(), c0118a, iVar2, workDatabase, C3.g.Q(bVar3, new S1.c(context, c0118a, iVar4, fVar, new Z1.l(fVar, iVar2), iVar2)), fVar, iVar4);
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i11 = size4 - 1;
                                    if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        i5 = size4;
                                        break;
                                    }
                                    if (i11 < 0) {
                                        break;
                                    }
                                    size4 = i11;
                                }
                                i5 = -1;
                            } else {
                                i5 = -1;
                            }
                            if (!(i5 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            workDatabase.f4791j.put(cls4, arrayList3.get(i5));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }

    public static final boolean u(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            N3.h.e(objArr, "<this>");
            Iterable cVar = new R3.c(0, objArr.length - 1, 1);
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                Iterator it = cVar.iterator();
                while (it.hasNext()) {
                    int iA = ((R3.b) it).a();
                    if (!u(objArr[iA], objArr2[iA])) {
                        return false;
                    }
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            Collection collection = (Collection) obj;
            N3.h.e(collection, "<this>");
            Iterable cVar2 = new R3.c(0, collection.size() - 1, 1);
            if (!(cVar2 instanceof Collection) || !((Collection) cVar2).isEmpty()) {
                Iterator it2 = cVar2.iterator();
                while (it2.hasNext()) {
                    int iA2 = ((R3.b) it2).a();
                    if (!u(list.get(iA2), list2.get(iA2))) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return N3.h.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!map2.containsKey(entry.getKey()) || !u(entry.getValue(), map2.get(entry.getKey()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static C0310d w(C0704n c0704n, b3.h hVar) {
        String upperCase;
        int i = 1;
        if (c0704n.a("backoffPolicyType") == null) {
            return null;
        }
        try {
            Object objA = c0704n.a("backoffPolicyType");
            N3.h.b(objA);
            upperCase = ((String) objA).toUpperCase(Locale.ROOT);
            N3.h.d(upperCase, "toUpperCase(...)");
        } catch (Exception unused) {
            int i5 = AbstractC0313g.f4920a;
        }
        if (upperCase == null) {
            throw new NullPointerException("Name is null");
        }
        if (!upperCase.equals("EXPONENTIAL")) {
            if (!upperCase.equals("LINEAR")) {
                throw new IllegalArgumentException("No enum constant androidx.work.BackoffPolicy.".concat(upperCase));
            }
            i = 2;
        }
        return new C0310d(((Integer) c0704n.a("backoffDelayInMilliseconds")) != null ? r3.intValue() : 0L, i);
    }

    public static C0121d x(C0704n c0704n) {
        int iC;
        N3.h.e(c0704n, "call");
        try {
            Object objA = c0704n.a("networkType");
            N3.h.b(objA);
            String upperCase = ((String) objA).toUpperCase(Locale.ROOT);
            N3.h.d(upperCase, "toUpperCase(...)");
            iC = AbstractC0307a.C(upperCase);
        } catch (Exception unused) {
            int i = AbstractC0313g.f4920a;
            iC = 1;
        }
        int i5 = iC;
        Boolean bool = (Boolean) c0704n.a("requiresBatteryNotLow");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) c0704n.a("requiresCharging");
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = (Boolean) c0704n.a("requiresDeviceIdle");
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = (Boolean) c0704n.a("requiresStorageNotLow");
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC0307a.r("networkType", i5);
        return new C0121d(i5, zBooleanValue2, zBooleanValue3, zBooleanValue, zBooleanValue4, -1L, -1L, C3.f.Z(linkedHashSet));
    }

    public static int y(C0704n c0704n) {
        N3.h.e(c0704n, "call");
        try {
            Object objA = c0704n.a("outOfQuotaPolicy");
            N3.h.b(objA);
            String upperCase = ((String) objA).toUpperCase(Locale.ROOT);
            N3.h.d(upperCase, "toUpperCase(...)");
            if (upperCase == null) {
                throw new NullPointerException("Name is null");
            }
            if (upperCase.equals("RUN_AS_NON_EXPEDITED_WORK_REQUEST")) {
                return 1;
            }
            if (upperCase.equals("DROP_WORK_REQUEST")) {
                return 2;
            }
            throw new IllegalArgumentException("No enum constant androidx.work.OutOfQuotaPolicy.".concat(upperCase));
        } catch (Exception unused) {
            int i = AbstractC0313g.f4920a;
            return 0;
        }
    }

    public static final Z1.j z(Z1.p pVar) {
        N3.h.e(pVar, "<this>");
        return new Z1.j(pVar.f3046a, pVar.f3064t);
    }

    public abstract int J(byte[] bArr, int i, int i5);

    public abstract void L(r.f fVar, r.f fVar2);

    public abstract void M(r.f fVar, Thread thread);

    public abstract boolean h(r.g gVar, r.c cVar, r.c cVar2);

    public abstract boolean i(r.g gVar, Object obj, Object obj2);

    public abstract boolean j(r.g gVar, r.f fVar, r.f fVar2);

    public abstract String t(byte[] bArr, int i, int i5);

    public abstract int v(String str, byte[] bArr, int i, int i5);
}
