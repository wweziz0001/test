package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import g.InterfaceC0434a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final l reflectionAccessors = new l();
    private final SparseArray<m> flutterIdToOrigin = new SparseArray<>();
    private final Map<m, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l3;
        int iIntValue;
        for (int i = 0; i < accessibilityNodeInfo.getChildCount(); i++) {
            l lVar = this.reflectionAccessors;
            Method method = lVar.f6957f;
            Long l4 = null;
            Field field = lVar.f6956e;
            Method method2 = lVar.f6955d;
            if (method2 != null || (field != null && method != null)) {
                if (method2 != null) {
                    try {
                        l3 = (Long) method2.invoke(accessibilityNodeInfo, Integer.valueOf(i));
                        l4 = l3;
                    } catch (IllegalAccessException e5) {
                        Log.w(TAG, "Failed to access getChildId method.", e5);
                    } catch (InvocationTargetException e6) {
                        Log.w(TAG, "The getChildId method threw an exception when invoked.", e6);
                    }
                } else {
                    try {
                        l3 = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i));
                        l3.getClass();
                        l4 = l3;
                    } catch (ArrayIndexOutOfBoundsException e7) {
                        e = e7;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    } catch (IllegalAccessException e8) {
                        Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e8);
                    } catch (InvocationTargetException e9) {
                        e = e9;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                    }
                }
            }
            if (l4 != null) {
                int iLongValue = (int) (l4.longValue() >> 32);
                m mVar = new m(view, iLongValue);
                if (this.originToFlutterId.containsKey(mVar)) {
                    iIntValue = this.originToFlutterId.get(mVar).intValue();
                } else {
                    int i5 = this.nextFlutterId;
                    this.nextFlutterId = i5 + 1;
                    cacheVirtualIdMappings(view, iLongValue, i5);
                    iIntValue = i5;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, iIntValue);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i, int i5) {
        m mVar = new m(view, i);
        this.originToFlutterId.put(mVar, Integer.valueOf(i5));
        this.flutterIdToOrigin.put(i5, mVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
        accessibilityNodeInfoObtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfoObtain.setSource(this.rootAccessibilityView, i);
        accessibilityNodeInfoObtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfoObtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfoObtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfoObtain);
        return accessibilityNodeInfoObtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo r6, android.view.View r7, android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r5 = this;
            io.flutter.view.l r0 = r5.reflectionAccessors
            java.lang.reflect.Method r0 = r0.f6953b
            r1 = 0
            java.lang.String r2 = "AccessibilityBridge"
            if (r0 == 0) goto L22
            java.lang.Object r0 = r0.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
            r0.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L15
            goto L74
        L13:
            r0 = move-exception
            goto L17
        L15:
            r0 = move-exception
            goto L1d
        L17:
            java.lang.String r3 = "The getParentNodeId method threw an exception when invoked."
            android.util.Log.w(r2, r3, r0)
            goto L22
        L1d:
            java.lang.String r3 = "Failed to access getParentNodeId method."
            android.util.Log.w(r2, r3, r0)
        L22:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 >= r3) goto L2e
            java.lang.String r6 = "Unexpected Android version. Unable to find the parent ID."
            android.util.Log.w(r2, r6)
            goto L73
        L2e:
            android.view.accessibility.AccessibilityNodeInfo r6 = android.view.accessibility.AccessibilityNodeInfo.obtain(r6)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r2 = 0
            r0.setDataPosition(r2)
            r6.writeToParcel(r0, r2)
            r0.setDataPosition(r2)
            long r3 = r0.readLong()
            boolean r6 = io.flutter.view.l.b(r3, r2)
            if (r6 == 0) goto L4d
            r0.readInt()
        L4d:
            r6 = 1
            boolean r6 = io.flutter.view.l.b(r3, r6)
            if (r6 == 0) goto L57
            r0.readLong()
        L57:
            r6 = 2
            boolean r6 = io.flutter.view.l.b(r3, r6)
            if (r6 == 0) goto L61
            r0.readInt()
        L61:
            r6 = 3
            boolean r6 = io.flutter.view.l.b(r3, r6)
            if (r6 == 0) goto L70
            long r1 = r0.readLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L70:
            r0.recycle()
        L73:
            r0 = r1
        L74:
            if (r0 != 0) goto L77
            return
        L77:
            long r0 = r0.longValue()
            r6 = 32
            long r0 = r0 >> r6
            int r6 = (int) r0
            java.util.Map<io.flutter.view.m, java.lang.Integer> r0 = r5.originToFlutterId
            io.flutter.view.m r1 = new io.flutter.view.m
            r1.<init>(r7, r6)
            java.lang.Object r6 = r0.get(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L97
            android.view.View r7 = r5.rootAccessibilityView
            int r6 = r6.intValue()
            r8.setParent(r7, r6)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo;
        m mVar = this.flutterIdToOrigin.get(i);
        if (mVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = mVar.f6958a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (accessibilityNodeInfoCreateAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(mVar.f6959b)) == null) {
            return null;
        }
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long lA = l.a(this.reflectionAccessors, accessibilityRecord);
        if (lA == null) {
            return null;
        }
        return this.originToFlutterId.get(new m(view, (int) (lA.longValue() >> 32)));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i, Rect rect) {
        Long l3;
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.f6952a;
        if (method == null) {
            l3 = null;
        } else {
            try {
                l3 = (Long) method.invoke(accessibilityNodeInfoCreateAccessibilityNodeInfo, null);
            } catch (IllegalAccessException e5) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e5);
                l3 = null;
            } catch (InvocationTargetException e6) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e6);
                l3 = null;
            }
        }
        if (l3 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, (int) (l3.longValue() >> 32), i);
        return convertToFlutterNode(accessibilityNodeInfoCreateAccessibilityNodeInfo, i, view);
    }

    public boolean onAccessibilityHoverEvent(int i, MotionEvent motionEvent) {
        m mVar = this.flutterIdToOrigin.get(i);
        if (mVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = mVar.f6958a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < motionEvent.getPointerCount(); i5++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i5] = pointerProperties;
            motionEvent.getPointerProperties(i5, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i5, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i5] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i, int i5, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        m mVar = this.flutterIdToOrigin.get(i);
        if (mVar == null || (accessibilityNodeProvider = mVar.f6958a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(mVar.f6959b, i5, bundle);
    }

    public View platformViewOfNode(int i) {
        m mVar = this.flutterIdToOrigin.get(i);
        if (mVar == null) {
            return null;
        }
        return mVar.f6958a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long lA = l.a(this.reflectionAccessors, accessibilityEvent);
        if (lA == null) {
            return false;
        }
        int iLongValue = (int) (lA.longValue() >> 32);
        Integer num = this.originToFlutterId.get(new m(view, iLongValue));
        if (num == null) {
            int i = this.nextFlutterId;
            this.nextFlutterId = i + 1;
            Integer numValueOf = Integer.valueOf(i);
            cacheVirtualIdMappings(view, iLongValue, i);
            num = numValueOf;
        }
        accessibilityEventObtain.setSource(this.rootAccessibilityView, num.intValue());
        accessibilityEventObtain.setClassName(accessibilityEvent.getClassName());
        accessibilityEventObtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i5 = 0; i5 < accessibilityEventObtain.getRecordCount(); i5++) {
            AccessibilityRecord record = accessibilityEventObtain.getRecord(i5);
            Long lA2 = l.a(this.reflectionAccessors, record);
            if (lA2 == null) {
                return false;
            }
            m mVar = new m(view, (int) (lA2.longValue() >> 32));
            if (!this.originToFlutterId.containsKey(mVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(mVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEventObtain);
    }
}
