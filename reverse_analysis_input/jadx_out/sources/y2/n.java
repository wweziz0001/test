package y2;

import D2.X;
import D2.r0;
import a.AbstractC0149a;
import a0.AbstractC0169U;
import a0.C0167S;
import a0.C0190p;
import a0.InterfaceC0164O;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.lifecycle.AbstractC0274p;
import com.example.hqp_mobile_app.R;
import com.google.crypto.tink.shaded.protobuf.AbstractC0329i;
import d0.AbstractC0370w;
import h0.C0448G;
import h0.i0;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import k3.InterfaceC0542b;
import m.C0603m0;
import m.C0604n;
import m.G0;
import m.M;
import m2.C0640G;
import m2.I;
import m2.b0;
import m2.g0;
import n3.InterfaceC0709s;
import w.AbstractC0937a;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC0542b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10959f;

    public n(String str, AbstractC0329i abstractC0329i, X x4, r0 r0Var, Integer num) {
        this.f10954a = str;
        this.f10955b = s.b(str);
        this.f10956c = abstractC0329i;
        this.f10957d = x4;
        this.f10958e = r0Var;
        this.f10959f = num;
    }

    public static boolean c(int[] iArr, int i) {
        for (int i5 : iArr) {
            if (i5 == i) {
                return true;
            }
        }
        return false;
    }

    public static n d(String str, AbstractC0329i abstractC0329i, X x4, r0 r0Var, Integer num) throws GeneralSecurityException {
        if (r0Var == r0.f580p) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new n(str, abstractC0329i, x4, r0Var, num);
    }

    public static ColorStateList e(Context context, int i) {
        int iC = G0.c(context, R.attr.colorControlHighlight);
        int iB = G0.b(context, R.attr.colorButtonNormal);
        int[] iArr = G0.f8259b;
        int[] iArr2 = G0.f8261d;
        int iB2 = AbstractC0937a.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, G0.f8260c, G0.f8263f}, new int[]{iB, iB2, AbstractC0937a.b(iC, i), i});
    }

    public static H f(InterfaceC0164O interfaceC0164O, I i, H h2, C0167S c0167s) {
        int iB;
        C0448G c0448g = (C0448G) interfaceC0164O;
        AbstractC0169U abstractC0169UZ = c0448g.z();
        c0448g.d0();
        if (c0448g.f5945d0.f6174a.p()) {
            iB = 0;
        } else {
            i0 i0Var = c0448g.f5945d0;
            iB = i0Var.f6174a.b(i0Var.f6175b.f10531a);
        }
        Object objL = abstractC0169UZ.p() ? null : abstractC0169UZ.l(iB);
        int iB2 = (c0448g.G() || abstractC0169UZ.p()) ? -1 : abstractC0169UZ.f(iB, c0167s, false).b(AbstractC0370w.M(c0448g.x()) - c0167s.f3240e);
        for (int i5 = 0; i5 < i.size(); i5++) {
            H h5 = (H) i.get(i5);
            if (i(h5, objL, c0448g.G(), c0448g.u(), c0448g.v(), iB2)) {
                return h5;
            }
        }
        if (i.isEmpty() && h2 != null) {
            if (i(h2, objL, c0448g.G(), c0448g.u(), c0448g.v(), iB2)) {
                return h2;
            }
        }
        return null;
    }

    public static LayerDrawable g(C0603m0 c0603m0, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = c0603m0.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = c0603m0.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean i(H h2, Object obj, boolean z4, int i, int i5, int i6) {
        if (!h2.f10531a.equals(obj)) {
            return false;
        }
        int i7 = h2.f10532b;
        return (z4 && i7 == i && h2.f10533c == i5) || (!z4 && i7 == -1 && h2.f10535e == i6);
    }

    public static void j(Drawable drawable, int i) {
        PorterDuffColorFilter porterDuffColorFilterE;
        PorterDuff.Mode mode = C0604n.f8454b;
        int[] iArr = M.f8291a;
        Drawable drawableMutate = drawable.mutate();
        synchronized (C0604n.class) {
            porterDuffColorFilterE = C0603m0.e(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterE);
    }

    public void a(InterfaceC0709s interfaceC0709s) {
        ((HashSet) this.f10956c).add(interfaceC0709s);
    }

    public void b(D0.d dVar, H h2, AbstractC0169U abstractC0169U) {
        if (h2 == null) {
            return;
        }
        if (abstractC0169U.b(h2.f10531a) != -1) {
            dVar.o(h2, abstractC0169U);
            return;
        }
        AbstractC0169U abstractC0169U2 = (AbstractC0169U) ((g0) this.f10956c).get(h2);
        if (abstractC0169U2 != null) {
            dVar.o(h2, abstractC0169U2);
        }
    }

    public ColorStateList h(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0149a.t(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0149a.t(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, G0.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return e(context, G0.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0149a.t(context, R.color.abc_tint_spinner);
            }
            if (c((int[]) this.f10955b, i)) {
                return G0.d(context, R.attr.colorControlNormal);
            }
            if (c((int[]) this.f10958e, i)) {
                return AbstractC0149a.t(context, R.color.abc_tint_default);
            }
            if (c((int[]) this.f10959f, i)) {
                return AbstractC0149a.t(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0149a.t(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = G0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = G0.f8259b;
            iArr2[0] = G0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = G0.f8262e;
            iArr2[1] = G0.c(context, R.attr.colorControlActivated);
            iArr[2] = G0.f8263f;
            iArr2[2] = G0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = G0.f8259b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = G0.f8262e;
            iArr2[1] = G0.c(context, R.attr.colorControlActivated);
            iArr[2] = G0.f8263f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void k(AbstractC0169U abstractC0169U) {
        D0.d dVar = new D0.d(4);
        if (((I) this.f10955b).isEmpty()) {
            b(dVar, (H) this.f10958e, abstractC0169U);
            if (!i4.a.v((H) this.f10959f, (H) this.f10958e)) {
                b(dVar, (H) this.f10959f, abstractC0169U);
            }
            if (!i4.a.v((H) this.f10957d, (H) this.f10958e) && !i4.a.v((H) this.f10957d, (H) this.f10959f)) {
                b(dVar, (H) this.f10957d, abstractC0169U);
            }
        } else {
            for (int i = 0; i < ((I) this.f10955b).size(); i++) {
                b(dVar, (H) ((I) this.f10955b).get(i), abstractC0169U);
            }
            if (!((I) this.f10955b).contains((H) this.f10957d)) {
                b(dVar, (H) this.f10957d, abstractC0169U);
            }
        }
        this.f10956c = dVar.f();
    }

    public n() {
        this.f10954a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f10955b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f10956c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f10957d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f10958e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f10959f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public n(q0.o oVar, MediaFormat mediaFormat, C0190p c0190p, Surface surface, MediaCrypto mediaCrypto, Z1.s sVar) {
        this.f10954a = oVar;
        this.f10955b = mediaFormat;
        this.f10956c = c0190p;
        this.f10957d = surface;
        this.f10958e = mediaCrypto;
        this.f10959f = sVar;
    }

    public n(Activity activity, AbstractC0274p abstractC0274p) {
        this.f10955b = new HashSet();
        this.f10956c = new HashSet();
        this.f10957d = new HashSet();
        this.f10958e = new HashSet();
        new HashSet();
        this.f10959f = new HashSet();
        this.f10954a = activity;
        new HiddenLifecycleReference(abstractC0274p);
    }

    public n(C0167S c0167s) {
        this.f10954a = c0167s;
        C0640G c0640g = I.f8549m;
        this.f10955b = b0.f8583p;
        this.f10956c = g0.f8607r;
    }
}
