package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.hqp_mobile_app.R;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends ListView {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f8322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Q f8328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public I.e f8332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public A.b f8333w;

    public T(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f8322l = new Rect();
        this.f8323m = 0;
        this.f8324n = 0;
        this.f8325o = 0;
        this.f8326p = 0;
        this.f8330t = z4;
        setCacheColorHint(0);
    }

    public final int a(int i, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i5) {
                return i5;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.T.b(int, android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f8322l;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f8333w != null) {
            return;
        }
        super.drawableStateChanged();
        Q q4 = this.f8328r;
        if (q4 != null) {
            q4.f8306m = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f8331u && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f8330t || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f8330t || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f8330t || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f8330t && this.f8329s) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f8333w = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f8333w == null) {
            A.b bVar = new A.b(this, 7);
            this.f8333w = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !O.f8299d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            O.f8296a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            O.f8297b.invoke(this, Integer.valueOf(iPointToPosition));
                            O.f8298c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                        } catch (InvocationTargetException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f8331u && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8327q = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        A.b bVar = this.f8333w;
        if (bVar != null) {
            T t4 = (T) bVar.f4m;
            t4.f8333w = null;
            t4.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f8329s = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        Q q4 = null;
        if (drawable != null) {
            Q q5 = new Q();
            Drawable drawable2 = q5.f8305l;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            q5.f8305l = drawable;
            drawable.setCallback(q5);
            q5.f8306m = true;
            q4 = q5;
        }
        this.f8328r = q4;
        super.setSelector(q4);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f8323m = rect.left;
        this.f8324n = rect.top;
        this.f8325o = rect.right;
        this.f8326p = rect.bottom;
    }
}
