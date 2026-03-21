package androidx.appcompat.view.menu;

import D.I;
import Z1.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.example.hqp_mobile_app.R;
import h.AbstractC0441a;
import java.lang.reflect.Field;
import l.InterfaceC0558p;
import l.MenuItemC0551i;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0558p, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LayoutInflater f3793A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3794B;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItemC0551i f3795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f3796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RadioButton f3797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f3798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CheckBox f3799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f3800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f3801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f3802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f3803t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Drawable f3804u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f3805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f3806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3807x;
    public final Drawable y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f3808z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s sVarM = s.M(getContext(), attributeSet, AbstractC0441a.f5894n, R.attr.listMenuViewStyle);
        this.f3804u = sVarM.D(5);
        TypedArray typedArray = (TypedArray) sVarM.f3086n;
        this.f3805v = typedArray.getResourceId(1, -1);
        this.f3807x = typedArray.getBoolean(7, false);
        this.f3806w = context;
        this.y = sVarM.D(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3808z = typedArrayObtainStyledAttributes.hasValue(0);
        sVarM.O();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3793A == null) {
            this.f3793A = LayoutInflater.from(getContext());
        }
        return this.f3793A;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f3801r;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3802s;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3802s.getLayoutParams();
        rect.top = this.f3802s.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // l.InterfaceC0558p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(l.MenuItemC0551i r11) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(l.i):void");
    }

    @Override // l.InterfaceC0558p
    public MenuItemC0551i getItemData() {
        return this.f3795l;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = I.f300a;
        setBackground(this.f3804u);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3798o = textView;
        int i = this.f3805v;
        if (i != -1) {
            textView.setTextAppearance(this.f3806w, i);
        }
        this.f3800q = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3801r = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.y);
        }
        this.f3802s = (ImageView) findViewById(R.id.group_divider);
        this.f3803t = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        if (this.f3796m != null && this.f3807x) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3796m.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i, i5);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f3797n == null && this.f3799p == null) {
            return;
        }
        if ((this.f3795l.f7778x & 4) != 0) {
            if (this.f3797n == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3797n = radioButton;
                LinearLayout linearLayout = this.f3803t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3797n;
            view = this.f3799p;
        } else {
            if (this.f3799p == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3799p = checkBox;
                LinearLayout linearLayout2 = this.f3803t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3799p;
            view = this.f3797n;
        }
        if (z4) {
            compoundButton.setChecked(this.f3795l.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f3799p;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3797n;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f3795l.f7778x & 4) != 0) {
            if (this.f3797n == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3797n = radioButton;
                LinearLayout linearLayout = this.f3803t;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3797n;
        } else {
            if (this.f3799p == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3799p = checkBox;
                LinearLayout linearLayout2 = this.f3803t;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3799p;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f3794B = z4;
        this.f3807x = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f3802s;
        if (imageView != null) {
            imageView.setVisibility((this.f3808z || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3795l.f7768n.getClass();
        boolean z4 = this.f3794B;
        if (z4 || this.f3807x) {
            ImageView imageView = this.f3796m;
            if (imageView == null && drawable == null && !this.f3807x) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3796m = imageView2;
                LinearLayout linearLayout = this.f3803t;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3807x) {
                this.f3796m.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3796m;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3796m.getVisibility() != 0) {
                this.f3796m.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3798o.getVisibility() != 8) {
                this.f3798o.setVisibility(8);
            }
        } else {
            this.f3798o.setText(charSequence);
            if (this.f3798o.getVisibility() != 0) {
                this.f3798o.setVisibility(0);
            }
        }
    }
}
