package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import l.C0548f;
import l.MenuC0550h;
import l.MenuItemC0551i;

/* JADX INFO: renamed from: m.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0597j0 extends T {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MenuItemC0551i f8431A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f8432x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC0589f0 f8433z;

    public C0597j0(Context context, boolean z4) {
        super(context, z4);
        if (1 == AbstractC0595i0.a(context.getResources().getConfiguration())) {
            this.f8432x = 21;
            this.y = 22;
        } else {
            this.f8432x = 22;
            this.y = 21;
        }
    }

    @Override // m.T, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0548f c0548f;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f8433z != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0548f = (C0548f) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0548f = (C0548f) adapter;
                headersCount = 0;
            }
            MenuItemC0551i item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0548f.getCount()) ? null : c0548f.getItem(i);
            MenuItemC0551i menuItemC0551i = this.f8431A;
            if (menuItemC0551i != item) {
                MenuC0550h menuC0550h = c0548f.f7728l;
                if (menuItemC0551i != null) {
                    this.f8433z.r(menuC0550h, menuItemC0551i);
                }
                this.f8431A = item;
                if (item != null) {
                    this.f8433z.f(menuC0550h, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f8432x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.y) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0548f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0548f) adapter).f7728l.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0589f0 interfaceC0589f0) {
        this.f8433z = interfaceC0589f0;
    }

    @Override // m.T, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
