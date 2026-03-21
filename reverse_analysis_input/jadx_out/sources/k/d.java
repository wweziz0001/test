package k;

import a.AbstractC0149a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import h.AbstractC0441a;
import java.io.IOException;
import l.MenuC0550h;
import m.M;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f7508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f7509f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f7510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f7511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7513d;

    static {
        Class[] clsArr = {Context.class};
        f7508e = clsArr;
        f7509f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f7512c = context;
        Object[] objArr = {context};
        this.f7510a = objArr;
        this.f7511b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [k.d] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i;
        ?? r6;
        ColorStateList colorStateList;
        int resourceId;
        C0527c c0527c = new C0527c(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    r6 = r4;
                    z4 = z4;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z5 && name2.equals(str)) {
                        r6 = r4;
                        z5 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            c0527c.f7485b = 0;
                            c0527c.f7486c = 0;
                            c0527c.f7487d = 0;
                            c0527c.f7488e = 0;
                            c0527c.f7489f = r4;
                            c0527c.f7490g = r4;
                        } else if (name2.equals("item")) {
                            if (!c0527c.f7491h) {
                                c0527c.f7491h = r4;
                                c0527c.b(c0527c.f7484a.add(c0527c.f7485b, c0527c.i, c0527c.f7492j, c0527c.f7493k));
                            }
                        } else if (name2.equals("menu")) {
                            ?? r62 = r4;
                            z4 = r62 == true ? 1 : 0;
                            r6 = r62;
                        }
                        r6 = r4;
                        z4 = z4;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = r6;
                i = 2;
                z4 = z4;
                z5 = z5;
            } else {
                if (!z5) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    d dVar = c0527c.f7483D;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = dVar.f7512c.obtainStyledAttributes(attributeSet, AbstractC0441a.f5892l);
                        c0527c.f7485b = ObtainStyledAttributes.getResourceId(r4, 0);
                        c0527c.f7486c = ObtainStyledAttributes.getInt(3, 0);
                        c0527c.f7487d = ObtainStyledAttributes.getInt(4, 0);
                        c0527c.f7488e = ObtainStyledAttributes.getInt(5, 0);
                        c0527c.f7489f = ObtainStyledAttributes.getBoolean(2, r4);
                        c0527c.f7490g = ObtainStyledAttributes.getBoolean(0, r4);
                        ObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = dVar.f7512c;
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0441a.f5893m);
                            c0527c.i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                            c0527c.f7492j = (typedArrayObtainStyledAttributes.getInt(5, c0527c.f7486c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, c0527c.f7487d) & 65535);
                            c0527c.f7493k = typedArrayObtainStyledAttributes.getText(7);
                            c0527c.f7494l = typedArrayObtainStyledAttributes.getText(8);
                            c0527c.f7495m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes.getString(9);
                            c0527c.f7496n = string == null ? (char) 0 : string.charAt(0);
                            c0527c.f7497o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes.getString(10);
                            c0527c.f7498p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0527c.f7499q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes.hasValue(11)) {
                                c0527c.f7500r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0527c.f7500r = c0527c.f7488e;
                            }
                            c0527c.f7501s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                            c0527c.f7502t = typedArrayObtainStyledAttributes.getBoolean(4, c0527c.f7489f);
                            c0527c.f7503u = typedArrayObtainStyledAttributes.getBoolean(1, c0527c.f7490g);
                            c0527c.f7504v = typedArrayObtainStyledAttributes.getInt(21, -1);
                            c0527c.y = typedArrayObtainStyledAttributes.getString(12);
                            c0527c.f7505w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                            c0527c.f7506x = typedArrayObtainStyledAttributes.getString(15);
                            String string3 = typedArrayObtainStyledAttributes.getString(14);
                            boolean z6 = string3 != null;
                            if (z6 && c0527c.f7505w == 0 && c0527c.f7506x == null) {
                                if (c0527c.a(string3, f7509f, dVar.f7511b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z6) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0527c.f7507z = typedArrayObtainStyledAttributes.getText(17);
                            c0527c.f7480A = typedArrayObtainStyledAttributes.getText(22);
                            if (typedArrayObtainStyledAttributes.hasValue(19)) {
                                c0527c.f7482C = M.c(typedArrayObtainStyledAttributes.getInt(19, -1), c0527c.f7482C);
                            } else {
                                c0527c.f7482C = null;
                            }
                            if (typedArrayObtainStyledAttributes.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0149a.t(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                                }
                                c0527c.f7481B = colorStateList;
                            } else {
                                c0527c.f7481B = null;
                            }
                            typedArrayObtainStyledAttributes.recycle();
                            c0527c.f7491h = false;
                            r6 = 1;
                        } else if (name3.equals("menu")) {
                            r6 = 1;
                            c0527c.f7491h = true;
                            SubMenu subMenuAddSubMenu = c0527c.f7484a.addSubMenu(c0527c.f7485b, c0527c.i, c0527c.f7492j, c0527c.f7493k);
                            c0527c.b(subMenuAddSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                        } else {
                            r6 = 1;
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = r6;
                        i = 2;
                        z4 = z4;
                        z5 = z5;
                    }
                }
                r6 = r4;
                z4 = z4;
            }
            eventType = xmlResourceParser.next();
            r4 = r6;
            i = 2;
            z4 = z4;
            z5 = z5;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC0550h)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f7512c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e5) {
                    throw new InflateException("Error inflating menu XML", e5);
                }
            } catch (XmlPullParserException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
